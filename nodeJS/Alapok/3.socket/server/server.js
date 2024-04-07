const httpServer = require("http").createServer(handler);
const io = require("socket.io")(httpServer, {
    cors: {
        origin: "*",
        methods: ["GET", "POST"]
    }
});

const hostname = '127.0.0.1';
const port = 3000;

function handler(req, res) {
    res.statusCode = 200;
    res.end('Node Server OK');
};

io.on("connection", (socket) => {
    socket.on("send-message", (arg) => {
        socket.broadcast.emit("chat-message", arg);
    });
});

httpServer.listen(port, hostname, () => {
    console.log(`Server running at http://${hostname}:${port}/`);
});