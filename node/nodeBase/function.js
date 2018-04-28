// 匿名函数
var http = require('http');
http.createServer(function (req, res) {
  res.writeHead(200, {"Content-Type": "text/plan"});
  res.write("Hello World!\n");
  res.end();
}).listen(8000);

// 先定义，后传递
var http = require('http');
function onRequest(req, res) {
  res.writeHead(200, {"Content-Type": "text/plan"});
  res.write("Hello World!\n");
  res.end();
}
http.createServer(onRequest).listen(8000);