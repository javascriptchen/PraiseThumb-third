'use strict';

Object.defineProperty(exports, "__esModule", {
  value: true
});

var _indexControler = require('./indexControler');

var _indexControler2 = _interopRequireDefault(_indexControler);

function _interopRequireDefault(obj) { return obj && obj.__esModule ? obj : { default: obj }; }

var controllerInit = {
  init: function init(app, router) {
    app.use(router(function (_) {
      _.get('/index/index', _indexControler2.default.index());
    }));
  }
};
exports.default = controllerInit;
