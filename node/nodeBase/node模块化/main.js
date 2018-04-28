// 调用Hello模块
var Hello = require('./hello');

Hello = new Hello();
Hello.setName('Yideng');
Hello.sayHello();