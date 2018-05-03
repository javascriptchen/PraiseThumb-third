'use strict';

var _koa = require('koa');

var _koa2 = _interopRequireDefault(_koa);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var app = new _koa2.default();

app.use(function (ctx) {
  ctx.body = 'Hello World';
});

app.listen(3000);
