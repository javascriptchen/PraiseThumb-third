var express = require('express');
var app = express();

// app.get('/*', function (req, res, next) {
//   console.log("必经路由");
//   next();
// });
app.use(function (req, res, next) {
  console.log("必经路由");
  next();
})
app.get('/index', function (req, res, next) {
  req.data = 123;
  next();
}, function (req, res, next) {
  console.log(req.data);
  res.send("123");
});
app.get('/go', function (req, res, next) {
  res.send('go')
});

var server = app.listen(8081, function () {
  console.log("接口已启动")
})