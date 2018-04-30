var express = require('express');
var app = express();
app.use(express.static('public'))
// 配置swig
swig = require('swig'),
  app.set('view engine', 'html');
app.engine('html', swig.renderFile);
// 配置路由
app.get('/', function (req, res, next) {
  res.render('index')
})
app.get('/receive', function (req, res, next) {
  console.log(req.query);
  res.json({
    data: 123
  })
})
//容错机制
app.get('*', function (req, res, next) {
  res.status(404);
  res.end('404')
})

app.use(function (err, req, res, next) {
  res.status(500);
  res.end('error...')
})
// 启动服务
app.listen(8081, function () {
  console.log("Server is running");

})