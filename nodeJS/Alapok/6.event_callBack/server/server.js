const eventModule = require('./eventModule');

eventModule
    .readJSON
    .start('./json/products.json', function(data) {
        console.log(data);
    });
