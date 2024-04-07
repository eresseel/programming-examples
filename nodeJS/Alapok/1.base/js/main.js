// Ajax a nodeJS szerver fele
let xhr = new XMLHttpRequest();

function sendToLog(log) {
    let timeStamp = new Date().getTime();
    document.querySelector("#node-console").innerHTML += timeStamp + ":\n" + log;
}

function showProduct(products) {
    let productsDiv = document.querySelector(".products-div");
    let content='<ul>';
    products = JSON.parse(products);
    
    for (let k in products) {
        content += '<li><strong>' + k + '</strong>. ' + products[k].name + '</li>';
    }
    content += '</ul>';
    productsDiv.innerHTML = content;
}

xhr.open("GET", "http://127.0.0.1:3000");
xhr.onload = function() {
    sendToLog(this.response);
    showProduct(this.response);
};

xhr.send();