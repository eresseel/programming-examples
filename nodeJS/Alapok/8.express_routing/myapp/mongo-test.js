const mongoose = require('mongoose');
mongoose.connect('mongodb://myapp:myapp@127.0.0.1:27017/myapp', {useNewUrlParser: true, useUnifiedTopology: true});

const Cat = mongoose.model('User', { lastName: String, firstName: String, age: Number });
// const kitty = new Cat({ lastName: 'Rebeka', firstName: 'Beres', age: 30 });
// kitty.save().then(() => console.log('Save done'));

// Cat.findOne({ name: 'Bator' }, function (err, cat) {
//     if (err) return handleError(err);
//     console.log(cat.name);
// });

// Cat.find({}, '', function (err, cats) {
//     if (err) return handleError(err);
//     console.log(cats);
// });

Cat.updateOne({ age: { $gt: 40 } }, { lastName: 'Oreg fiu' }, function(err){
    if (err) return handleError(err);
    console.log("Updated");
});
