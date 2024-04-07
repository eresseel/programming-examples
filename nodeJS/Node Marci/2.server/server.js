/**
 * sudo npm i -g nodemon
 * nodemon server.js
 * Automatan ujrainditja a server.js ha a file tartalma modosult
 */

/**
 * Szukseg eseten fuggoseg betoltese
 */

const http = require('http');

class Server {
    /**
     * 1. Beallitja a portot ahol fut majd a NodeJs szerver.
     * 2. Beallitja a maximum ujra probalkozok szamat ujraprobalkozasok eseten.
     * 3. Beallitja a kezdeti erteket az ujraprobalkozoknak.
     * 4. Beallitja az ujraprobalkozasok kozott eltelt idot.
     * 5. Letrehozza a szervert.
     * 6. Beallitja a hibakezelest.
     * 7. Elinditja a port figyelest
     */
    constructor() {
        this.port = 3000;
        this.maxRetry = 10;
        this.retryNum = 0;
        this.retryInterval = 1500;
        this.instance = http.createServer((req, res) => {
            this.response(req, res);
        });

        this.handleError();
        this.startListening();

    }
    /**
     * Osszeallitja a valaszokat a http kereshez.
     * @param {Request} req a kerest tartalmazza
     * @param {Response} res a valaszadashoz szukseges objektum 
     */
    response(req, res) {
        res.end("Hello Marci.");
    }

    /**
     * Hibak kezelese.
     * Ha port foglalt, akkor ujraprobal csatlakozni a megadott intervallumonkent.
     */

    handleError() {
        this.instance.on("error", (e) => {
            if (e.code == "EADDRINUSE") {
                this.retryNum++;
                if (this.maxRetry >= this.retryNum) {
                    let to = setTimeout(() => {
                        clearInterval(to);
                        console.error(`A ${this.port} port foglalt`);
                        this.instance.close();
                        this.startListening();
                    }, this.retryInterval);
                }
            }
        });
    }

    /**
     * POST figyelesenek megkezdese
     */

    startListening() {
    this.instance.listen(this.port, () => {
        console.log(`Listen to http://127.0.0.1:${this.port}`)
    });
    }
}

new Server();