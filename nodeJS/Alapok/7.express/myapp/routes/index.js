var express = require('express');
var router = express.Router();

/* GET home page. */
router.get('/', function(req, res, next) {
  res.render('index', { title: 'Szemelyvonat' });
});

router.get('/alma', function(req, res, next) {
  res.render('alma', { title: 'Alma' });
});

module.exports = router;
