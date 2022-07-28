const WebSocketServer = require('ws').Server;
const events = require('./events');
const Format = require('.//*$FORMAT$*/');
global.gws = null;
function /*$NAME$*/(name, debug, portnum, instance) {
    this.name = name;
    this.debug = debug;
    this.ready = false;

    this.formatter = new Format();
    this.wss = new WebSocketServer({port:portnum});

	this.wss.on('connection', function (ws) {
	    /*$CALLBACK$*/
        console.log(`[SERVER] connection()`);
        gws = ws;
        ws.on('message', function (data) {
        console.log(`[SERVER] Received: ${data}`);
        const formatter = new Format();
        const msg = formatter.parse(data);
        /*$DISPATCH$*/
        })
        
     })
    
}

/*$RECEIVERS$*/

/*$NAME$*/.prototype._stop = function() {
	this.wss.close();
};

module.exports = /*$NAME$*/;
