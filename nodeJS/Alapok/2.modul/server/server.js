const itfactory = require("itfactory");

let products = itfactory.find("./json/products.json", "name", "otva");

console.log(products);