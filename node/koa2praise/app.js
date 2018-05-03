import Koa from 'koa';
import co from 'co';
import render from 'koa-swig';
import server from 'koa-static';
import router from 'koa-simple-router';
import CONFIG from './config/config'
import controllerInit from './controler/initControler';

const app = new Koa();
initControler.init(app, router);

app.context.render = co.wrap(render({
  root: path.join(__dirname, CONFIG.get('viewDir')),
  autoescape: true,
  cache: 'memory',
  ext: 'html'
}));
app.use(serve(CONFIG.get('staticDir')));

app.listen(CONFIG.get('port'));