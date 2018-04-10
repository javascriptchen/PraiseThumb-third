// 阻塞代码
var fs = require('fs');
var data = fs.readFileSync('data.txt');
console.log(data.toString());

// 非阻塞代码
// fileSteam;
var fs = require('fs');
fs.readFile('data.txt',function(err,data){
  if(err){
    return console.log(err);
  }
  console.log(data.toString());
})
console.log("程序执行完毕");
