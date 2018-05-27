import css from '../css/index.css';
let f = '';

class PraiseButton {
  constructor() {}
  clickAddNum() {
    axios.get('/index/update')
      .then(function (response) {
        console.log(response);
      })
      .catch(function (error) {
        console.log(error);
      })
  }
}

export default PraiseButton;