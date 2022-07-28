const mqtt_lib = require('mqtt');
const Format = require('.//*$FORMAT$*/');
const events = require('./events')

function /*$NAME$*/(name, options, subtopic, pubtopic, instance) {
    this.name = name;
    this.ready = false;
    this.subtopic = subtopic;
    this.pubtopic = pubtopic;
    this.formatter = new Format();
    this.client = mqtt_lib.connect(options);
    var client = this.client;
    var formatter = this.formatter
    this.client.on('connect', () => {
        subtopic.forEach(topic => {
            client.subscribe(topic);
    
        });
    });

   	this.client.on('message', (topic, payload,packet) => {
            const msg = formatter.parse(payload);
            /*$DISPATCH$*/
   	});
}

/*$RECEIVERS$*/

/*$NAME$*/.prototype._stop = function() {
	this.client.end();
};

module.exports = /*$NAME$*/;
