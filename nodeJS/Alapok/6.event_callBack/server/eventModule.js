const events = require('events');
const fs = require('fs');
const emitter = new events.EventEmitter;

let fileEvent = function(callBack) {};

fileEvent.prototype.start = function(path, callBack) {
    let self = this;
    this.path = path;
    fs.readFile(path , 'utf8', function(err, data) {
        callBack.call(self, data);
    });

    return this;
};

module.exports = {
    "readJSON" : new fileEvent
};