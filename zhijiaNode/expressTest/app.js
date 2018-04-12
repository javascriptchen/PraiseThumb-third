var express = require('express');
var app = express();

app.get('/', function (req, res) {
  console.log(req.query);
  
  res.send('Hello World');
})

var server = app.listen(8081, function () {
  console.log("借口已启动")
})