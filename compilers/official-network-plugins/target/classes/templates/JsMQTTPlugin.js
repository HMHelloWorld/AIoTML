const mqtt_lib = require('mqtt');
const Format = require('.//*$FORMAT$*/');

function /*$NAME$*/(name, debug, serverURL, subtopic, pubtopic, instance, callback) {
    this.name = name;
    this.debug = debug;
    this.ready = false;
    this.subtopic = subtopic;
    this.pubtopic = pubtopic;
    this.formatter = new Format();
    this.client = mqtt_lib.connect(serverURL);

    this.client.on('connect', () => {
        this.client.subscribe(this.subtopic);
        callback(true);
    });

   	this.client.on('message', (topic, payload,packet) => {
   	    if (subtopic.includes(topic)) {
            const msg = formatter.parse(payload);
            /*$DISPATCH$*/
        }
   	});
}

/*$RECEIVERS$*/

/*$NAME$*/.prototype._stop = function() {
	this.client.end();
};

module.exports = /*$NAME$*/;
