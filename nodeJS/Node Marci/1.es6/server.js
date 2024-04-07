/**
 * NodeJs alapveto mukodesenek gyakorlasa
 * Server osztaly a keresek es valaszok feldolgozasara.
 */

class Server {
    /**
     * A konstruktor akkor fut le, amikor letrehozunk egy uj szerver peldanyt.
     * Most nincs argumentuma, de at is adhatnank neki adatokat.
     */
    constructor () {
       this.port = 3000;
       setTimeout(() => {   // arrow function, megtartja a this-t
           console.log(this)
       },1000);
       setTimeout(function() {  // hagyomanyos function
        console.log(this)
        },1500);
        this.printPort = () => console.log(this.port); // arrow function, rovid formaja
        this.printAny = message => console.log(message); // egy paramateter atadas eseten arrow function
    }
}

const server = new Server();
server.printPort();
server.printAny("Hello, arrow function");