var server = require('./http.js');
var router = require("./router");
server.start(router.route)