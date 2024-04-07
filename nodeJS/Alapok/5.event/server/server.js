const eventModule = require('./eventModule');

eventModule
    .readJSON
    .start('./json/products.json')
    .on('done', function(data){
        console.log(data);
    });
