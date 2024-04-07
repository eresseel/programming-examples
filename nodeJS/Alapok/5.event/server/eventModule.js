const events = require('events');
const fs = require('fs');

let fileEvent = function() {};
fileEvent.prototype = new events.EventEmitter;
fileEvent.prototype.start = function(path) {
    let self = this;
    this.path = path;
    this.fileContent = fs.readFile(path , 'utf8', function(err, data) {
        self.emit('done', data);
    });
    return this;
};

module.exports = {
    "readJSON" : new fileEvent
};