var express = require('express');
var app = express();
app.use(express.static('public'));
swig = require('swig'),
app.set('view engine', 'html');
app.engine('html', swig.renderFile);

app.get('/', function (req, res, next) {
  res.render('index',{
    title:"测试首页",
    data:'index'
  })
});

var server = app.listen(8081, function () {
  console.log("接口已启动")
})