// Socket.io klien oldali kommunikacio

const socket = io('http://127.0.0.1:3000');

let area = document.querySelector('#node-console');

// uzenet megjelenites
function showSocketMessage(message) {
    area.innerHTML += message + "\n";
};

// uzenet kuldes
let messageInput = document.querySelector("#my-message");
messageInput.addEventListener("keyup", function(e){
    if (e.keyCode === 13) {
        socket.emit('send-message', messageInput.value);
        messageInput.value = "";
    }
});

document.querySelector("#send-message")
    .addEventListener("click", function() {
        socket.emit('send-message', messageInput.value);
        messageInput.value = "";
    });

// idobelyeg keszitese
function getTimeStamp() {
    const currentDate = new Date();
    const stamp = currentDate.getHours() + ":" + currentDate.getMinutes() + ":" + currentDate.getSeconds();

    return stamp;
}
// uzenet megjelenites
socket.on("chat-message", (data) => {
    data = "<strong>" + getTimeStamp() + ":</strong> " + data;
    showSocketMessage(data)
});
