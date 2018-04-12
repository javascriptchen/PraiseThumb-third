var express = require('express');
var app = express();
app.use(express.static('public'));
app.get('/', function (req, res) {
  // console.log(req.query);
  // req.params.id
  // res.send();
  // res.json({
  //   id:req.params.id
  // })
  res.render("")
})

var server = app.listen(8081, function () {
  console.log("借口已启动")
})
// 1.安装并引用express 启动一个express实例；
// 2.app listen一个端口，启动一个后台服务
// 3.app.get 设置基础的路由，然后吐出数据
// 4.平时的请求都是get，浏览器直接敲
// 5.get post put delete 
// req.query req.params res.send() res.json()