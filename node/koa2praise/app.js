import Koa from 'koa';
import co from 'co';
import render from 'koa-swig';
import server from 'koa-static';
import router from 'koa-simple-router';
import CONFIG from './config/config';
import babel_po from 'babel-polyfill';
import babel_re from 'babel-core/register';
import initControler from './controler/initControler';

const app = new Koa();
initControler.init(app, router);

app.context.render = co.wrap(render({
  root: CONFIG.get('viewDir'),
  autoescape: true,
  cache: 'memory',
  ext: 'html'
}));
app.use(server(CONFIG.get('staticDir')));

app.listen(CONFIG.get('port'));