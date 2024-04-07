// process objektum
if (process.argv.indexOf("dev") !== -1) {
    console.log = function () {};
}

console.log("App started prod mode...");

// futtato kornyezet vizsgalata
if (process.env.USER.indexOf("kerb3rosz") !== -1) {
    console.log("Linux");
} else {
    console.log("Windows");
}

const util = require("util");
const fs = require("fs");
const http = require('http');

const hostname = '127.0.0.1';
const port = 3000;

const server = http.createServer((req, res) => {
    res.statusCode = 200;
    res.end("Run server");
});

server.listen(port, hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`);
});

let _to;

function startMemoryMonitor() {
    clearTimeout(_to);
    console.log(util.inspect(process.memoryUsage()));
    _to = setTimeout(function() {
        startMemoryMonitor();
    }, 1000);
}

_to = setTimeout(function() {
    startMemoryMonitor();
}, 1000);