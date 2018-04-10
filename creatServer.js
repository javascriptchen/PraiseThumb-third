var http = require('http');
http.createServer(function (req, res) {
  // 定义http头
  res.writeHead(200, {
    "Content-Type": "text/plan"
  });
  // 发送响应数据
  res.end("Hello World!\n");
}).listen(8000);
// 服务运行后输出一行信息
console.log("server is running...");