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

app.use(logErrors);
app.use(clientErrorHandler);
app.use(errorHandler);

function logErrors(err, req, res, next) {
  console.error(err.stack);
  next(err);
}

function clientErrorHandler(err, req, res, next) {
  if (req.xhr) {
    res.status(500).send({ error: 'Something blew up!' });
  } else {
    next(err);
  }
}

function errorHandler(err, req, res, next) {
  res.status(500);
  res.end(err);
}

var server = app.listen(8081, function () {
  console.log("接口已启动")
})