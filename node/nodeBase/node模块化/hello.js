// 模块主要逻辑

function Hello() {
  var name;
  this.setName = function (argName) {
    name = argName;
  }
  this.sayHello = function () {
    console.log("hello" +   name);
  }
}

// 对模块进行导出
module.exports = Hello;