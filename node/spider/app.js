var express = require('express');
var app = express();
var request = require('request');
const cheerio = require('cheerio')

app.get('/', function (req, res) {
  request('https://www.namaiche.com/', function (error, response, body) {
    const $ = cheerio.load(body)
    res.json({
      'header': $('.headerCenter a').length
    })
    res.send('hello world'); // 当前的$他是一个拿到了整个body的前端选择器
    
  });
});

app.listen(3000);