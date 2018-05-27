'use strict';

Object.defineProperty(exports, "__esModule", {
  value: true
});

var _koa = require('koa');

var _koa2 = _interopRequireDefault(_koa);

var _co = require('co');

var _co2 = _interopRequireDefault(_co);

var _koaSwig = require('koa-swig');

var _koaSwig2 = _interopRequireDefault(_koaSwig);

var _koaStatic = require('koa-static');

var _koaStatic2 = _interopRequireDefault(_koaStatic);

var _koaSimpleRouter = require('koa-simple-router');

var _koaSimpleRouter2 = _interopRequireDefault(_koaSimpleRouter);

var _config = require('./config/config');

var _config2 = _interopRequireDefault(_config);

var _babelPolyfill = require('babel-polyfill');

var _babelPolyfill2 = _interopRequireDefault(_babelPolyfill);

var _register = require('babel-core/register');

var _register2 = _interopRequireDefault(_register);

var _initControler = require('./controler/initControler');

var _initControler2 = _interopRequireDefault(_initControler);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

// 路由抽取出去的文件

// 编译async
// 路由
// 模板
var app = new _koa2.default(); // 编译async
// 静态资源路径
// koa-swig依赖

_initControler2.default.init(app, _koaSimpleRouter2.default);

// koa-swig渲染的页面
app.context.render = _co2.default.wrap((0, _koaSwig2.default)({
  root: _config2.default.get('viewDir'),
  autoescape: true,
  cache: 'memory',
  ext: 'html'
}));
// 静态资源路径
app.use((0, _koaStatic2.default)(_config2.default.get('staticDir')));

app.listen(_config2.default.get('port'));

exports.default = app;