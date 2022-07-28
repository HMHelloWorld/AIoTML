#include <stdint.h>
#include <Arduino.h>
/*****************************************************************************
 * Headers for type : TimerArduino
 *****************************************************************************/


// BEGIN: Code from the c_header annotation TimerArduino

#define NB_SOFT_TIMERS 16

// END: Code from the c_header annotation TimerArduino

// Definition of the instance struct:
struct TimerArduino_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_timer;
// Variables for the current instance state
int TimerArduino_SoftTimer_State;
// Variables for the properties of the instance
uint16_t TimerArduino_NB_SOFT_TIMERS_var;

};
// Declaration of prototypes outgoing messages :
void TimerArduino_SoftTimer_OnEntry(int state, struct TimerArduino_Instance *_instance);
void TimerArduino_handle_timer_timer_start(struct TimerArduino_Instance *_instance, uint8_t id, uint16_t time);
void TimerArduino_handle_timer_timer_cancel(struct TimerArduino_Instance *_instance, uint8_t id);
// Declaration of callbacks for incoming messages:
void register_TimerArduino_send_timer_timer_timeout_listener(void (*_listener)(struct TimerArduino_Instance *, uint8_t));
void register_external_TimerArduino_send_timer_timer_timeout_listener(void (*_listener)(struct TimerArduino_Instance *, uint8_t));

// Definition of the states:
#define TIMERARDUINO_SOFTTIMER_STATE 0
#define TIMERARDUINO_SOFTTIMER_DEFAULT_STATE 1


/*****************************************************************************
 * Headers for type : Blink
 *****************************************************************************/

// Definition of the instance struct:
struct Blink_Instance {

// Instances of different sessions
bool active;
// Variables for the ID of the ports of the instance
uint16_t id_timer;
// Variables for the current instance state
int Blink_State;
// Variables for the properties of the instance
uint8_t Blink_TimerID_var;

};
// Declaration of prototypes outgoing messages :
void Blink_OnEntry(int state, struct Blink_Instance *_instance);
void Blink_handle_timer_timer_timeout(struct Blink_Instance *_instance, uint8_t id);
// Declaration of callbacks for incoming messages:
void register_Blink_send_timer_timer_start_listener(void (*_listener)(struct Blink_Instance *, uint8_t, uint16_t));
void register_external_Blink_send_timer_timer_start_listener(void (*_listener)(struct Blink_Instance *, uint8_t, uint16_t));
void register_Blink_send_timer_timer_cancel_listener(void (*_listener)(struct Blink_Instance *, uint8_t));
void register_external_Blink_send_timer_timer_cancel_listener(void (*_listener)(struct Blink_Instance *, uint8_t));

// Definition of the states:
#define BLINK_STATE 0
#define BLINK_NULL_ON_STATE 1
#define BLINK_NULL_OFF_STATE 2



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
/*****************************************************************************
 * Implementation for type : Blink
 *****************************************************************************/

// Declaration of prototypes:
//Prototypes: State Machine
void Blink_OnExit(int state, struct Blink_Instance *_instance);
//Prototypes: Message Sending
void Blink_send_timer_timer_start(struct Blink_Instance *_instance, uint8_t id, uint16_t time);
void Blink_send_timer_timer_cancel(struct Blink_Instance *_instance, uint8_t id);
//Prototypes: Function
void f_Blink_led_init(struct Blink_Instance *_instance);
void f_Blink_led_on(struct Blink_Instance *_instance);
void f_Blink_led_off(struct Blink_Instance *_instance);
// Declaration of functions:
// Definition of function led_init
void f_Blink_led_init(struct Blink_Instance *_instance) {
pinMode(LED_BUILTIN, OUTPUT);
}
// Definition of function led_on
void f_Blink_led_on(struct Blink_Instance *_instance) {
digitalWrite(LED_BUILTIN, HIGH);
}
// Definition of function led_off
void f_Blink_led_off(struct Blink_Instance *_instance) {
digitalWrite(LED_BUILTIN, LOW);
}

// Sessions functionss:


// On Entry Actions:
void Blink_OnEntry(int state, struct Blink_Instance *_instance) {
switch(state) {
case BLINK_STATE:{
_instance->Blink_State = BLINK_NULL_ON_STATE;
f_Blink_led_init(_instance);
Blink_OnEntry(_instance->Blink_State, _instance);
break;
}
case BLINK_NULL_ON_STATE:{
Blink_send_timer_timer_start(_instance, _instance->Blink_TimerID_var, 500);
f_Blink_led_on(_instance);
break;
}
case BLINK_NULL_OFF_STATE:{
Blink_send_timer_timer_start(_instance, _instance->Blink_TimerID_var, 500);
f_Blink_led_off(_instance);
break;
}
default: break;
}
}

// On Exit Actions:
void Blink_OnExit(int state, struct Blink_Instance *_instance) {
switch(state) {
case BLINK_STATE:{
Blink_OnExit(_instance->Blink_State, _instance);
break;}
case BLINK_NULL_ON_STATE:{
break;}
case BLINK_NULL_OFF_STATE:{
break;}
default: break;
}
}

// Event Handlers for incoming messages:
void Blink_handle_timer_timer_timeout(struct Blink_Instance *_instance, uint8_t id) {
if(!(_instance->active)) return;
//Region null
uint8_t Blink_State_event_consumed = 0;
if (_instance->Blink_State == BLINK_NULL_ON_STATE) {
if (Blink_State_event_consumed == 0 && id == _instance->Blink_TimerID_var) {
Blink_OnExit(BLINK_NULL_ON_STATE, _instance);
_instance->Blink_State = BLINK_NULL_OFF_STATE;
Blink_OnEntry(BLINK_NULL_OFF_STATE, _instance);
Blink_State_event_consumed = 1;
}
}
else if (_instance->Blink_State == BLINK_NULL_OFF_STATE) {
if (Blink_State_event_consumed == 0 && id == _instance->Blink_TimerID_var) {
Blink_OnExit(BLINK_NULL_OFF_STATE, _instance);
_instance->Blink_State = BLINK_NULL_ON_STATE;
Blink_OnEntry(BLINK_NULL_ON_STATE, _instance);
Blink_State_event_consumed = 1;
}
}
//End Region null
//End dsregion null
//Session list: 
}

// Observers for outgoing messages:
void (*external_Blink_send_timer_timer_start_listener)(struct Blink_Instance *, uint8_t, uint16_t)= 0x0;
void (*Blink_send_timer_timer_start_listener)(struct Blink_Instance *, uint8_t, uint16_t)= 0x0;
void register_external_Blink_send_timer_timer_start_listener(void (*_listener)(struct Blink_Instance *, uint8_t, uint16_t)){
external_Blink_send_timer_timer_start_listener = _listener;
}
void register_Blink_send_timer_timer_start_listener(void (*_listener)(struct Blink_Instance *, uint8_t, uint16_t)){
Blink_send_timer_timer_start_listener = _listener;
}
void Blink_send_timer_timer_start(struct Blink_Instance *_instance, uint8_t id, uint16_t time){
if (Blink_send_timer_timer_start_listener != 0x0) Blink_send_timer_timer_start_listener(_instance, id, time);
if (external_Blink_send_timer_timer_start_listener != 0x0) external_Blink_send_timer_timer_start_listener(_instance, id, time);
;
}
void (*external_Blink_send_timer_timer_cancel_listener)(struct Blink_Instance *, uint8_t)= 0x0;
void (*Blink_send_timer_timer_cancel_listener)(struct Blink_Instance *, uint8_t)= 0x0;
void register_external_Blink_send_timer_timer_cancel_listener(void (*_listener)(struct Blink_Instance *, uint8_t)){
external_Blink_send_timer_timer_cancel_listener = _listener;
}
void register_Blink_send_timer_timer_cancel_listener(void (*_listener)(struct Blink_Instance *, uint8_t)){
Blink_send_timer_timer_cancel_listener = _listener;
}
void Blink_send_timer_timer_cancel(struct Blink_Instance *_instance, uint8_t id){
if (Blink_send_timer_timer_cancel_listener != 0x0) Blink_send_timer_timer_cancel_listener(_instance, id);
if (external_Blink_send_timer_timer_cancel_listener != 0x0) external_Blink_send_timer_timer_cancel_listener(_instance, id);
;
}




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
 * Implementation for type : TimerArduino
 *****************************************************************************/


// BEGIN: Code from the c_global annotation TimerArduino
uint32_t Timer_timeouts[NB_SOFT_TIMERS];
uint8_t  Timer_wraps[NB_SOFT_TIMERS];
uint32_t Timer_prev;
// END: Code from the c_global annotation TimerArduino

// Declaration of prototypes:
//Prototypes: State Machine
void TimerArduino_SoftTimer_OnExit(int state, struct TimerArduino_Instance *_instance);
//Prototypes: Message Sending
void TimerArduino_send_timer_timer_timeout(struct TimerArduino_Instance *_instance, uint8_t id);
//Prototypes: Function
uint32_t f_TimerArduino_time_ms(struct TimerArduino_Instance *_instance);
void f_TimerArduino_init_arrays(struct TimerArduino_Instance *_instance);
void f_TimerArduino_poll_soft_timers(struct TimerArduino_Instance *_instance);
void f_TimerArduino_startTimer(struct TimerArduino_Instance *_instance, uint8_t id, uint16_t delay);
void f_TimerArduino_cancel(struct TimerArduino_Instance *_instance, uint8_t id);
// Declaration of functions:
// Definition of function time_ms
uint32_t f_TimerArduino_time_ms(struct TimerArduino_Instance *_instance) {
return millis();
}
// Definition of function init_arrays
void f_TimerArduino_init_arrays(struct TimerArduino_Instance *_instance) {
uint8_t i;
	    for (i = 0; i < _instance->TimerArduino_NB_SOFT_TIMERS_var; i++) {
	        Timer_timeouts[i] = 0;
	        Timer_wraps[i] = 0;
	    }
	    Timer_prev = f_TimerArduino_time_ms(_instance);
}
// Definition of function poll_soft_timers
void f_TimerArduino_poll_soft_timers(struct TimerArduino_Instance *_instance) {
uint32_t current = f_TimerArduino_time_ms(_instance);
		uint8_t i;
		for (i = 0; i < _instance->TimerArduino_NB_SOFT_TIMERS_var; i++) {
		    if (Timer_timeouts[i] > 0) {
		        if (current >= Timer_prev) {
		            // Normal time progression
		            if (current > Timer_timeouts[i] && Timer_wraps[i] == 0) {
TimerArduino_send_timer_timer_timeout(_instance, i);
Timer_timeouts[i] = 0;
		                Timer_wraps[i] = 0;
		            }
		        } else {
		            // A wraparound has occurred
		            if (Timer_wraps[i] == 0) {
TimerArduino_send_timer_timer_timeout(_instance, i);
Timer_timeouts[i] = 0;
		            } else {
		                Timer_wraps[i] = 0;
		                if (current > Timer_timeouts[i]) {
TimerArduino_send_timer_timer_timeout(_instance, i);
Timer_timeouts[i] = 0;
		                }
		            }
		        }
		    }
		}
}
// Definition of function startTimer
void f_TimerArduino_startTimer(struct TimerArduino_Instance *_instance, uint8_t id, uint16_t delay) {

    	if (id < NB_SOFT_TIMERS) {
	        uint32_t current = f_TimerArduino_time_ms(_instance);
	        uint32_t timeout = current + delay;
	        if (timeout == 0) timeout = 1;
	
	        Timer_timeouts[id] = timeout;
	        Timer_wraps[id] = (timeout > current) ? 0 : 1;
	    }
    
}
// Definition of function cancel
void f_TimerArduino_cancel(struct TimerArduino_Instance *_instance, uint8_t id) {

        if (id < NB_SOFT_TIMERS) {
	        Timer_timeouts[id] = 0;
	        Timer_wraps[id] = 0;
	    }
      
}

// Sessions functionss:


// On Entry Actions:
void TimerArduino_SoftTimer_OnEntry(int state, struct TimerArduino_Instance *_instance) {
switch(state) {
case TIMERARDUINO_SOFTTIMER_STATE:{
_instance->TimerArduino_SoftTimer_State = TIMERARDUINO_SOFTTIMER_DEFAULT_STATE;
f_TimerArduino_init_arrays(_instance);
TimerArduino_SoftTimer_OnEntry(_instance->TimerArduino_SoftTimer_State, _instance);
break;
}
case TIMERARDUINO_SOFTTIMER_DEFAULT_STATE:{
break;
}
default: break;
}
}

// On Exit Actions:
void TimerArduino_SoftTimer_OnExit(int state, struct TimerArduino_Instance *_instance) {
switch(state) {
case TIMERARDUINO_SOFTTIMER_STATE:{
TimerArduino_SoftTimer_OnExit(_instance->TimerArduino_SoftTimer_State, _instance);
break;}
case TIMERARDUINO_SOFTTIMER_DEFAULT_STATE:{
break;}
default: break;
}
}

// Event Handlers for incoming messages:
void TimerArduino_handle_timer_timer_start(struct TimerArduino_Instance *_instance, uint8_t id, uint16_t time) {
if(!(_instance->active)) return;
//Region SoftTimer
uint8_t TimerArduino_SoftTimer_State_event_consumed = 0;
if (_instance->TimerArduino_SoftTimer_State == TIMERARDUINO_SOFTTIMER_DEFAULT_STATE) {
if (TimerArduino_SoftTimer_State_event_consumed == 0 && time > 0) {
f_TimerArduino_startTimer(_instance, id, time);
TimerArduino_SoftTimer_State_event_consumed = 1;
}
}
//End Region SoftTimer
//End dsregion SoftTimer
//Session list: 
}
void TimerArduino_handle_timer_timer_cancel(struct TimerArduino_Instance *_instance, uint8_t id) {
if(!(_instance->active)) return;
//Region SoftTimer
uint8_t TimerArduino_SoftTimer_State_event_consumed = 0;
if (_instance->TimerArduino_SoftTimer_State == TIMERARDUINO_SOFTTIMER_DEFAULT_STATE) {
if (TimerArduino_SoftTimer_State_event_consumed == 0 && 1) {
f_TimerArduino_cancel(_instance, id);
TimerArduino_SoftTimer_State_event_consumed = 1;
}
}
//End Region SoftTimer
//End dsregion SoftTimer
//Session list: 
}

// Observers for outgoing messages:
void (*external_TimerArduino_send_timer_timer_timeout_listener)(struct TimerArduino_Instance *, uint8_t)= 0x0;
void (*TimerArduino_send_timer_timer_timeout_listener)(struct TimerArduino_Instance *, uint8_t)= 0x0;
void register_external_TimerArduino_send_timer_timer_timeout_listener(void (*_listener)(struct TimerArduino_Instance *, uint8_t)){
external_TimerArduino_send_timer_timer_timeout_listener = _listener;
}
void register_TimerArduino_send_timer_timer_timeout_listener(void (*_listener)(struct TimerArduino_Instance *, uint8_t)){
TimerArduino_send_timer_timer_timeout_listener = _listener;
}
void TimerArduino_send_timer_timer_timeout(struct TimerArduino_Instance *_instance, uint8_t id){
if (TimerArduino_send_timer_timer_timeout_listener != 0x0) TimerArduino_send_timer_timer_timeout_listener(_instance, id);
if (external_TimerArduino_send_timer_timer_timeout_listener != 0x0) external_TimerArduino_send_timer_timer_timeout_listener(_instance, id);
;
}






/*****************************************************************************
 * Definitions for configuration : BlinkArduino
 *****************************************************************************/

//Declaration of instance variables
//Instance timer
// Variables for the properties of the instance
struct TimerArduino_Instance timer_var;
// Variables for the sessions of the instance
//Instance countdown
// Variables for the properties of the instance
struct Blink_Instance countdown_var;
// Variables for the sessions of the instance


// Enqueue of messages TimerArduino::timer::timer_timeout
void enqueue_TimerArduino_send_timer_timer_timeout(struct TimerArduino_Instance *_instance, uint8_t id){
if ( fifo_byte_available() > 5 ) {

_fifo_enqueue( (1 >> 8) & 0xFF );
_fifo_enqueue( 1 & 0xFF );

// ID of the source port of the instance
_fifo_enqueue( (_instance->id_timer >> 8) & 0xFF );
_fifo_enqueue( _instance->id_timer & 0xFF );

// parameter id
union u_id_t {
uint8_t p;
byte bytebuffer[1];
} u_id;
u_id.p = id;
_fifo_enqueue(u_id.bytebuffer[0] & 0xFF );
}
}
// Enqueue of messages Blink::timer::timer_start
void enqueue_Blink_send_timer_timer_start(struct Blink_Instance *_instance, uint8_t id, uint16_t time){
if ( fifo_byte_available() > 7 ) {

_fifo_enqueue( (2 >> 8) & 0xFF );
_fifo_enqueue( 2 & 0xFF );

// ID of the source port of the instance
_fifo_enqueue( (_instance->id_timer >> 8) & 0xFF );
_fifo_enqueue( _instance->id_timer & 0xFF );

// parameter id
union u_id_t {
uint8_t p;
byte bytebuffer[1];
} u_id;
u_id.p = id;
_fifo_enqueue(u_id.bytebuffer[0] & 0xFF );

// parameter time
union u_time_t {
uint16_t p;
byte bytebuffer[2];
} u_time;
u_time.p = time;
_fifo_enqueue(u_time.bytebuffer[0] & 0xFF );
_fifo_enqueue(u_time.bytebuffer[1] & 0xFF );
}
}
// Enqueue of messages Blink::timer::timer_cancel
void enqueue_Blink_send_timer_timer_cancel(struct Blink_Instance *_instance, uint8_t id){
if ( fifo_byte_available() > 5 ) {

_fifo_enqueue( (3 >> 8) & 0xFF );
_fifo_enqueue( 3 & 0xFF );

// ID of the source port of the instance
_fifo_enqueue( (_instance->id_timer >> 8) & 0xFF );
_fifo_enqueue( _instance->id_timer & 0xFF );

// parameter id
union u_id_t {
uint8_t p;
byte bytebuffer[1];
} u_id;
u_id.p = id;
_fifo_enqueue(u_id.bytebuffer[0] & 0xFF );
}
}


//New dispatcher for messages
void dispatch_timer_start(uint16_t sender, uint8_t param_id, uint16_t param_time) {
if (sender == countdown_var.id_timer) {
TimerArduino_handle_timer_timer_start(&timer_var, param_id, param_time);

}

}


//New dispatcher for messages
void dispatch_timer_timeout(uint16_t sender, uint8_t param_id) {
if (sender == timer_var.id_timer) {
Blink_handle_timer_timer_timeout(&countdown_var, param_id);

}

}


//New dispatcher for messages
void dispatch_timer_cancel(uint16_t sender, uint8_t param_id) {
if (sender == countdown_var.id_timer) {
TimerArduino_handle_timer_timer_cancel(&timer_var, param_id);

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
case 2:{
byte mbuf[7 - 2];
while (mbufi < (7 - 2)) mbuf[mbufi++] = fifo_dequeue();
uint8_t mbufi_timer_start = 2;
union u_timer_start_id_t {
uint8_t p;
byte bytebuffer[1];
} u_timer_start_id;
u_timer_start_id.bytebuffer[0] = mbuf[mbufi_timer_start + 0];
mbufi_timer_start += 1;
union u_timer_start_time_t {
uint16_t p;
byte bytebuffer[2];
} u_timer_start_time;
u_timer_start_time.bytebuffer[0] = mbuf[mbufi_timer_start + 0];
u_timer_start_time.bytebuffer[1] = mbuf[mbufi_timer_start + 1];
mbufi_timer_start += 2;
dispatch_timer_start((mbuf[0] << 8) + mbuf[1] /* instance port*/,
 u_timer_start_id.p /* id */ ,
 u_timer_start_time.p /* time */ );
break;
}
case 1:{
byte mbuf[5 - 2];
while (mbufi < (5 - 2)) mbuf[mbufi++] = fifo_dequeue();
uint8_t mbufi_timer_timeout = 2;
union u_timer_timeout_id_t {
uint8_t p;
byte bytebuffer[1];
} u_timer_timeout_id;
u_timer_timeout_id.bytebuffer[0] = mbuf[mbufi_timer_timeout + 0];
mbufi_timer_timeout += 1;
dispatch_timer_timeout((mbuf[0] << 8) + mbuf[1] /* instance port*/,
 u_timer_timeout_id.p /* id */ );
break;
}
case 3:{
byte mbuf[5 - 2];
while (mbufi < (5 - 2)) mbuf[mbufi++] = fifo_dequeue();
uint8_t mbufi_timer_cancel = 2;
union u_timer_cancel_id_t {
uint8_t p;
byte bytebuffer[1];
} u_timer_cancel_id;
u_timer_cancel_id.bytebuffer[0] = mbuf[mbufi_timer_cancel + 0];
mbufi_timer_cancel += 1;
dispatch_timer_cancel((mbuf[0] << 8) + mbuf[1] /* instance port*/,
 u_timer_cancel_id.p /* id */ );
break;
}
}
return 1;
}


//external Message enqueue

void initialize_configuration_BlinkArduino() {
// Initialize connectors
register_TimerArduino_send_timer_timer_timeout_listener(&enqueue_TimerArduino_send_timer_timer_timeout);
register_Blink_send_timer_timer_start_listener(&enqueue_Blink_send_timer_timer_start);
register_Blink_send_timer_timer_cancel_listener(&enqueue_Blink_send_timer_timer_cancel);


// Network Initialization
// End Network Initialization

// Init the ID, state variables and properties for instance timer
timer_var.active = true;
timer_var.id_timer = add_instance( (void*) &timer_var);
timer_var.TimerArduino_SoftTimer_State = TIMERARDUINO_SOFTTIMER_DEFAULT_STATE;
timer_var.TimerArduino_NB_SOFT_TIMERS_var = NB_SOFT_TIMERS;

TimerArduino_SoftTimer_OnEntry(TIMERARDUINO_SOFTTIMER_STATE, &timer_var);
// Init the ID, state variables and properties for instance countdown
countdown_var.active = true;
countdown_var.id_timer = add_instance( (void*) &countdown_var);
countdown_var.Blink_State = BLINK_NULL_ON_STATE;
countdown_var.Blink_TimerID_var = 0;

Blink_OnEntry(BLINK_STATE, &countdown_var);
}




void setup() {
Serial.begin(9600);
initialize_configuration_BlinkArduino();

}

void loop() {

// Network Listener// End Network Listener

int emptyEventConsumed = 1;
while (emptyEventConsumed != 0) {
emptyEventConsumed = 0;
}
f_TimerArduino_poll_soft_timers(&timer_var);

    processMessageQueue();
}
