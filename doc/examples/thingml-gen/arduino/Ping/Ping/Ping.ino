#include <stdint.h>
#include <Arduino.h>
/*****************************************************************************
 * Headers for type : PingClient
 *****************************************************************************/

// Definition of the instance struct:
struct PingClient_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_ping_service;
// Variables for the current instance state
int PingClient_PingClientMachine_State;
// Variables for the properties of the instance
uint8_t PingClient_PingClientMachine_counter_var;

};
// Declaration of prototypes outgoing messages :
void PingClient_PingClientMachine_OnEntry(int state, struct PingClient_Instance *_instance);
void PingClient_handle_ping_service_pong(struct PingClient_Instance *_instance, uint8_t seq);
// Declaration of callbacks for incoming messages:
void register_PingClient_send_ping_service_ping_listener(void (*_listener)(struct PingClient_Instance *, uint8_t));
void register_external_PingClient_send_ping_service_ping_listener(void (*_listener)(struct PingClient_Instance *, uint8_t));

// Definition of the states:
#define PINGCLIENT_PINGCLIENTMACHINE_OK_STATE 0
#define PINGCLIENT_PINGCLIENTMACHINE_STATE 1
#define PINGCLIENT_PINGCLIENTMACHINE_PING_STATE 2
#define PINGCLIENT_PINGCLIENTMACHINE_STOP_STATE 3


/*****************************************************************************
 * Headers for type : PingServer
 *****************************************************************************/

// Definition of the instance struct:
struct PingServer_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_ping_service;
// Variables for the current instance state
int PingServer_State;
// Variables for the properties of the instance

};
// Declaration of prototypes outgoing messages :
void PingServer_OnEntry(int state, struct PingServer_Instance *_instance);
void PingServer_handle_ping_service_ping(struct PingServer_Instance *_instance, uint8_t seq);
// Declaration of callbacks for incoming messages:
void register_PingServer_send_ping_service_pong_listener(void (*_listener)(struct PingServer_Instance *, uint8_t));
void register_external_PingServer_send_ping_service_pong_listener(void (*_listener)(struct PingServer_Instance *, uint8_t));

// Definition of the states:
#define PINGSERVER_NULL_ACTIVE_STATE 0
#define PINGSERVER_STATE 1



/* Adds and instance to the runtime and returns its id */
uint16_t add_instance(void * instance_struct);
/* Returns the instance with id */
void * instance_by_id(uint16_t id);

/* Returns the number of byte currently in the fifo */
int fifo_byte_length();
/* Returns the number of bytes currently available in the fifo */
int fifo_byte_available();
/* Returns true if the fifo is empty */
int fifo_empty();
/* Return true if the fifo is full */
int fifo_full();
/* Enqueue 1 byte in the fifo if there is space
   returns 1 for sucess and 0 if the fifo was full */
int fifo_enqueue(byte b);
/* Enqueue 1 byte in the fifo without checking for available space
   The caller should have checked that there is enough space */
int _fifo_enqueue(byte b);
/* Dequeue 1 byte in the fifo.
   The caller should check that the fifo is not empty */
byte fifo_dequeue();

#define MAX_INSTANCES 2
#define FIFO_SIZE 256

/*********************************
 * Instance IDs and lookup
 *********************************/

void * instances[MAX_INSTANCES];
uint16_t instances_count = 0;

void * instance_by_id(uint16_t id) {
  return instances[id];
}

uint16_t add_instance(void * instance_struct) {
  instances[instances_count] = instance_struct;
  return instances_count++;
}

/******************************************
 * Simple byte FIFO implementation
 ******************************************/

byte fifo[FIFO_SIZE];
int fifo_head = 0;
int fifo_tail = 0;

// Returns the number of byte currently in the fifo
int fifo_byte_length() {
  if (fifo_tail >= fifo_head)
    return fifo_tail - fifo_head;
  return fifo_tail + FIFO_SIZE - fifo_head;
}

// Returns the number of bytes currently available in the fifo
int fifo_byte_available() {
  return FIFO_SIZE - 1 - fifo_byte_length();
}

// Returns true if the fifo is empty
int fifo_empty() {
  return fifo_head == fifo_tail;
}

// Return true if the fifo is full
int fifo_full() {
  return fifo_head == ((fifo_tail + 1) % FIFO_SIZE);
}

// Enqueue 1 byte in the fifo if there is space
// returns 1 for sucess and 0 if the fifo was full
int fifo_enqueue(byte b) {
  int new_tail = (fifo_tail + 1) % FIFO_SIZE;
  if (new_tail == fifo_head) return 0; // the fifo is full
  fifo[fifo_tail] = b;
  fifo_tail = new_tail;
  return 1;
}

// Enqueue 1 byte in the fifo without checking for available space
// The caller should have checked that there is enough space
int _fifo_enqueue(byte b) {
  fifo[fifo_tail] = b;
  fifo_tail = (fifo_tail + 1) % FIFO_SIZE;
  return 0; // Dummy added by steffend
}

// Dequeue 1 byte in the fifo.
// The caller should check that the fifo is not empty
byte fifo_dequeue() {
  if (!fifo_empty()) {
    byte result = fifo[fifo_head];
    fifo_head = (fifo_head + 1) % FIFO_SIZE;
    return result;
  }
  return 0;
}

/*****************************************************************************
 * Implementation for type : PingClient
 *****************************************************************************/

// Declaration of prototypes:
//Prototypes: State Machine
void PingClient_PingClientMachine_OnExit(int state, struct PingClient_Instance *_instance);
//Prototypes: Message Sending
void PingClient_send_ping_service_ping(struct PingClient_Instance *_instance, uint8_t seq);
//Prototypes: Function
// Declaration of functions:

// Sessions functionss:


// On Entry Actions:
void PingClient_PingClientMachine_OnEntry(int state, struct PingClient_Instance *_instance) {
switch(state) {
case PINGCLIENT_PINGCLIENTMACHINE_STATE:{
_instance->PingClient_PingClientMachine_State = PINGCLIENT_PINGCLIENTMACHINE_PING_STATE;
_instance->PingClient_PingClientMachine_counter_var = 0;
PingClient_PingClientMachine_OnEntry(_instance->PingClient_PingClientMachine_State, _instance);
break;
}
case PINGCLIENT_PINGCLIENTMACHINE_OK_STATE:{
break;
}
case PINGCLIENT_PINGCLIENTMACHINE_PING_STATE:{
// PRINT: "Send Ping "
// PRINT: _instance->PingClient_PingClientMachine_counter_var
// PRINT: " ... "
PingClient_send_ping_service_ping(_instance, _instance->PingClient_PingClientMachine_counter_var);
break;
}
case PINGCLIENT_PINGCLIENTMACHINE_STOP_STATE:{
// PRINT: "Bye."
// PRINT: "\n"
_instance->active = false;
break;
}
default: break;
}
}

// On Exit Actions:
void PingClient_PingClientMachine_OnExit(int state, struct PingClient_Instance *_instance) {
switch(state) {
case PINGCLIENT_PINGCLIENTMACHINE_STATE:{
PingClient_PingClientMachine_OnExit(_instance->PingClient_PingClientMachine_State, _instance);
break;}
case PINGCLIENT_PINGCLIENTMACHINE_OK_STATE:{
break;}
case PINGCLIENT_PINGCLIENTMACHINE_PING_STATE:{
_instance->PingClient_PingClientMachine_counter_var = _instance->PingClient_PingClientMachine_counter_var + 1;
break;}
case PINGCLIENT_PINGCLIENTMACHINE_STOP_STATE:{
break;}
default: break;
}
}

// Event Handlers for incoming messages:
void PingClient_handle_ping_service_pong(struct PingClient_Instance *_instance, uint8_t seq) {
if(!(_instance->active)) return;
//Region PingClientMachine
uint8_t PingClient_PingClientMachine_State_event_consumed = 0;
if (_instance->PingClient_PingClientMachine_State == PINGCLIENT_PINGCLIENTMACHINE_PING_STATE) {
if (PingClient_PingClientMachine_State_event_consumed == 0 && seq == _instance->PingClient_PingClientMachine_counter_var) {
PingClient_PingClientMachine_OnExit(PINGCLIENT_PINGCLIENTMACHINE_PING_STATE, _instance);
_instance->PingClient_PingClientMachine_State = PINGCLIENT_PINGCLIENTMACHINE_OK_STATE;
// PRINT: "[OK]"
// PRINT: "\n"
PingClient_PingClientMachine_OnEntry(PINGCLIENT_PINGCLIENTMACHINE_OK_STATE, _instance);
PingClient_PingClientMachine_State_event_consumed = 1;
}
else if (PingClient_PingClientMachine_State_event_consumed == 0 && seq != _instance->PingClient_PingClientMachine_counter_var) {
PingClient_PingClientMachine_OnExit(PINGCLIENT_PINGCLIENTMACHINE_PING_STATE, _instance);
_instance->PingClient_PingClientMachine_State = PINGCLIENT_PINGCLIENTMACHINE_STOP_STATE;
// PRINT: "[Error]"
// PRINT: "\n"
PingClient_PingClientMachine_OnEntry(PINGCLIENT_PINGCLIENTMACHINE_STOP_STATE, _instance);
PingClient_PingClientMachine_State_event_consumed = 1;
}
}
//End Region PingClientMachine
//End dsregion PingClientMachine
//Session list: 
}
int PingClient_handle_empty_event(struct PingClient_Instance *_instance) {
 uint8_t empty_event_consumed = 0;
if(!(_instance->active)) return 0;
//Region PingClientMachine
if (_instance->PingClient_PingClientMachine_State == PINGCLIENT_PINGCLIENTMACHINE_OK_STATE) {
if (_instance->PingClient_PingClientMachine_counter_var > 5) {
PingClient_PingClientMachine_OnExit(PINGCLIENT_PINGCLIENTMACHINE_OK_STATE, _instance);
_instance->PingClient_PingClientMachine_State = PINGCLIENT_PINGCLIENTMACHINE_STOP_STATE;
PingClient_PingClientMachine_OnEntry(PINGCLIENT_PINGCLIENTMACHINE_STOP_STATE, _instance);
return 1;
}
else if (_instance->PingClient_PingClientMachine_counter_var <= 5) {
PingClient_PingClientMachine_OnExit(PINGCLIENT_PINGCLIENTMACHINE_OK_STATE, _instance);
_instance->PingClient_PingClientMachine_State = PINGCLIENT_PINGCLIENTMACHINE_PING_STATE;
PingClient_PingClientMachine_OnEntry(PINGCLIENT_PINGCLIENTMACHINE_PING_STATE, _instance);
return 1;
}
}
//begin dispatchEmptyToSession
//end dispatchEmptyToSession
return empty_event_consumed;
}

// Observers for outgoing messages:
void (*external_PingClient_send_ping_service_ping_listener)(struct PingClient_Instance *, uint8_t)= 0x0;
void (*PingClient_send_ping_service_ping_listener)(struct PingClient_Instance *, uint8_t)= 0x0;
void register_external_PingClient_send_ping_service_ping_listener(void (*_listener)(struct PingClient_Instance *, uint8_t)){
external_PingClient_send_ping_service_ping_listener = _listener;
}
void register_PingClient_send_ping_service_ping_listener(void (*_listener)(struct PingClient_Instance *, uint8_t)){
PingClient_send_ping_service_ping_listener = _listener;
}
void PingClient_send_ping_service_ping(struct PingClient_Instance *_instance, uint8_t seq){
if (PingClient_send_ping_service_ping_listener != 0x0) PingClient_send_ping_service_ping_listener(_instance, seq);
if (external_PingClient_send_ping_service_ping_listener != 0x0) external_PingClient_send_ping_service_ping_listener(_instance, seq);
;
}



/*****************************************************************************
 * Implementation for type : PingServer
 *****************************************************************************/

// Declaration of prototypes:
//Prototypes: State Machine
void PingServer_OnExit(int state, struct PingServer_Instance *_instance);
//Prototypes: Message Sending
void PingServer_send_ping_service_pong(struct PingServer_Instance *_instance, uint8_t seq);
//Prototypes: Function
// Declaration of functions:

// Sessions functionss:


// On Entry Actions:
void PingServer_OnEntry(int state, struct PingServer_Instance *_instance) {
switch(state) {
case PINGSERVER_STATE:{
_instance->PingServer_State = PINGSERVER_NULL_ACTIVE_STATE;
PingServer_OnEntry(_instance->PingServer_State, _instance);
break;
}
case PINGSERVER_NULL_ACTIVE_STATE:{
break;
}
default: break;
}
}

// On Exit Actions:
void PingServer_OnExit(int state, struct PingServer_Instance *_instance) {
switch(state) {
case PINGSERVER_STATE:{
PingServer_OnExit(_instance->PingServer_State, _instance);
break;}
case PINGSERVER_NULL_ACTIVE_STATE:{
break;}
default: break;
}
}

// Event Handlers for incoming messages:
void PingServer_handle_ping_service_ping(struct PingServer_Instance *_instance, uint8_t seq) {
if(!(_instance->active)) return;
//Region null
uint8_t PingServer_State_event_consumed = 0;
if (_instance->PingServer_State == PINGSERVER_NULL_ACTIVE_STATE) {
if (PingServer_State_event_consumed == 0 && 1) {
PingServer_OnExit(PINGSERVER_NULL_ACTIVE_STATE, _instance);
_instance->PingServer_State = PINGSERVER_NULL_ACTIVE_STATE;
PingServer_send_ping_service_pong(_instance, seq);
PingServer_OnEntry(PINGSERVER_NULL_ACTIVE_STATE, _instance);
PingServer_State_event_consumed = 1;
}
}
//End Region null
//End dsregion null
//Session list: 
}

// Observers for outgoing messages:
void (*external_PingServer_send_ping_service_pong_listener)(struct PingServer_Instance *, uint8_t)= 0x0;
void (*PingServer_send_ping_service_pong_listener)(struct PingServer_Instance *, uint8_t)= 0x0;
void register_external_PingServer_send_ping_service_pong_listener(void (*_listener)(struct PingServer_Instance *, uint8_t)){
external_PingServer_send_ping_service_pong_listener = _listener;
}
void register_PingServer_send_ping_service_pong_listener(void (*_listener)(struct PingServer_Instance *, uint8_t)){
PingServer_send_ping_service_pong_listener = _listener;
}
void PingServer_send_ping_service_pong(struct PingServer_Instance *_instance, uint8_t seq){
if (PingServer_send_ping_service_pong_listener != 0x0) PingServer_send_ping_service_pong_listener(_instance, seq);
if (external_PingServer_send_ping_service_pong_listener != 0x0) external_PingServer_send_ping_service_pong_listener(_instance, seq);
;
}






/*****************************************************************************
 * Definitions for configuration : Ping
 *****************************************************************************/

//Declaration of instance variables
//Instance client
// Variables for the properties of the instance
struct PingClient_Instance client_var;
// Variables for the sessions of the instance
//Instance server
// Variables for the properties of the instance
struct PingServer_Instance server_var;
// Variables for the sessions of the instance


// Enqueue of messages PingClient::ping_service::ping
void enqueue_PingClient_send_ping_service_ping(struct PingClient_Instance *_instance, uint8_t seq){
if ( fifo_byte_available() > 5 ) {

_fifo_enqueue( (1 >> 8) & 0xFF );
_fifo_enqueue( 1 & 0xFF );

// ID of the source port of the instance
_fifo_enqueue( (_instance->id_ping_service >> 8) & 0xFF );
_fifo_enqueue( _instance->id_ping_service & 0xFF );

// parameter seq
union u_seq_t {
uint8_t p;
byte bytebuffer[1];
} u_seq;
u_seq.p = seq;
_fifo_enqueue(u_seq.bytebuffer[0] & 0xFF );
}
}
// Enqueue of messages PingServer::ping_service::pong
void enqueue_PingServer_send_ping_service_pong(struct PingServer_Instance *_instance, uint8_t seq){
if ( fifo_byte_available() > 5 ) {

_fifo_enqueue( (2 >> 8) & 0xFF );
_fifo_enqueue( 2 & 0xFF );

// ID of the source port of the instance
_fifo_enqueue( (_instance->id_ping_service >> 8) & 0xFF );
_fifo_enqueue( _instance->id_ping_service & 0xFF );

// parameter seq
union u_seq_t {
uint8_t p;
byte bytebuffer[1];
} u_seq;
u_seq.p = seq;
_fifo_enqueue(u_seq.bytebuffer[0] & 0xFF );
}
}


//New dispatcher for messages
void dispatch_ping(uint16_t sender, uint8_t param_seq) {
if (sender == client_var.id_ping_service) {
PingServer_handle_ping_service_ping(&server_var, param_seq);

}

}


//New dispatcher for messages
void dispatch_pong(uint16_t sender, uint8_t param_seq) {
if (sender == server_var.id_ping_service) {
PingClient_handle_ping_service_pong(&client_var, param_seq);

}

}


int processMessageQueue() {
if (fifo_empty()) return 0; // return 0 if there is nothing to do

uint8_t mbufi = 0;

// Read the code of the next port/message in the queue
uint16_t code = fifo_dequeue() << 8;

code += fifo_dequeue();

// Switch to call the appropriate handler
switch(code) {
case 1:{
byte mbuf[5 - 2];
while (mbufi < (5 - 2)) mbuf[mbufi++] = fifo_dequeue();
uint8_t mbufi_ping = 2;
union u_ping_seq_t {
uint8_t p;
byte bytebuffer[1];
} u_ping_seq;
u_ping_seq.bytebuffer[0] = mbuf[mbufi_ping + 0];
mbufi_ping += 1;
dispatch_ping((mbuf[0] << 8) + mbuf[1] /* instance port*/,
 u_ping_seq.p /* seq */ );
break;
}
case 2:{
byte mbuf[5 - 2];
while (mbufi < (5 - 2)) mbuf[mbufi++] = fifo_dequeue();
uint8_t mbufi_pong = 2;
union u_pong_seq_t {
uint8_t p;
byte bytebuffer[1];
} u_pong_seq;
u_pong_seq.bytebuffer[0] = mbuf[mbufi_pong + 0];
mbufi_pong += 1;
dispatch_pong((mbuf[0] << 8) + mbuf[1] /* instance port*/,
 u_pong_seq.p /* seq */ );
break;
}
}
return 1;
}


//external Message enqueue

void initialize_configuration_Ping() {
// Initialize connectors
register_PingClient_send_ping_service_ping_listener(&enqueue_PingClient_send_ping_service_ping);
register_PingServer_send_ping_service_pong_listener(&enqueue_PingServer_send_ping_service_pong);


// Network Initialization
// End Network Initialization

// Init the ID, state variables and properties for instance server
server_var.active = true;
server_var.id_ping_service = add_instance( (void*) &server_var);
server_var.PingServer_State = PINGSERVER_NULL_ACTIVE_STATE;

PingServer_OnEntry(PINGSERVER_STATE, &server_var);
// Init the ID, state variables and properties for instance client
client_var.active = true;
client_var.id_ping_service = add_instance( (void*) &client_var);
client_var.PingClient_PingClientMachine_State = PINGCLIENT_PINGCLIENTMACHINE_PING_STATE;
client_var.PingClient_PingClientMachine_counter_var = 0;

PingClient_PingClientMachine_OnEntry(PINGCLIENT_PINGCLIENTMACHINE_STATE, &client_var);
}




void setup() {
initialize_configuration_Ping();

}

void loop() {

// Network Listener// End Network Listener

int emptyEventConsumed = 1;
while (emptyEventConsumed != 0) {
emptyEventConsumed = 0;
emptyEventConsumed += PingClient_handle_empty_event(&client_var);
}

    processMessageQueue();
}
