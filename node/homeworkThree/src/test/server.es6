import requestsuper from 'supertest';
import app from '../app_o.js';
//  先定义一个拿到端口的方法 测试时要关闭node app，否则会端口冲突
function request() {
  return requestsuper(app.listen());
}
describe('测试路由', function () {
  it('点赞', function (done) {
      request()
          .get('/index/update')
          .expect(200)
          .end(function (err, res) {
              if (res.data == 1) 
                  return done(err);
              done();
          })
  });
});
