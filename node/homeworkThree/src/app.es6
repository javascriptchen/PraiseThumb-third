import Koa from 'koa';
import co from 'co'; // koa-swig依赖
import render from 'koa-swig';// 模板
import server from 'koa-static';// 静态资源路径
import router from 'koa-simple-router'; // 路由
import CONFIG from './config/config';
import babel_po from 'babel-polyfill';// 编译async
import babel_re from 'babel-core/register';// 编译async
import initControler from './controler/initControler';// 路由抽取出去的文件

const app = new Koa();
initControler.init(app, router);

// koa-swig渲染的页面
app.context.render = co.wrap(render({
  root: CONFIG.get('viewDir'),
  autoescape: true,
  cache: 'memory',
  ext: 'html'
}));
// 静态资源路径
app.use(server(CONFIG.get('staticDir')));

app.listen(CONFIG.get('port'));

export default app;