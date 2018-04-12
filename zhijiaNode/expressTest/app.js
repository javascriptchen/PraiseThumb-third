var express = require('express');
var bodyParser = require('body-parser');
var app = express();
var urlencodedParser = bodyParser.urlencoded({
  extended: false
})
app.use(express.static('public'));

app.get('/index', function (req, res) {
  res.sendFile(__dirname + "/views/" + "index.html")
})
app.post('/index', urlencodedParser, function (req, res) {
  res.redirect("https://www.baidu.com/s?tn=99006304_6_oem_dg&isource=infinity&wd="+req.body.data+"")
})

var server = app.listen(8081, function () {
  console.log("接口已启动")
})
// 1.安装并引用express 启动一个express实例；
// 2.app listen一个端口，启动一个后台服务
// 3.app.get 设置基础的路由，然后吐出数据
// 4.平时的请求都是get，浏览器直接敲
// 5.get post put delete 
// req.query req.params res.send() res.json()