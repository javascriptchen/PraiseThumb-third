let f = '';

class PraiseButton {
  constructor(num, ele) {
    this.num = num;
    this.ele = ele;
  }
  clickAddNum() {
    this.ele.click(() => {
      if (f) {
        clearTimeout(f);
      }
      f = setTimeout(() => {
        if (this.num < 10) {
          this.ele.css("-webkit-filter", "grayscale(0)")
          $('#animation').addClass('num');
          this.num = add(this.num);
          setTimeout(() => {
            $('#animation').removeClass('num');
          }, 1000)
        } else {
          this.ele.css("-webkit-filter", "grayscale(1)")
          this.num = 0;
        }
        axios.get('/index/update')
          .then(function (response) {
            console.log(response);
          })
          .catch(function (error) {
            console.log(error);
          })
        console.log(this.num);
      }, 800);
    })
  }
}

class Thumb extends PraiseButton {
  constructor(num, ele) {
    super(num, ele);
  }
}

export default {
  Thumb
}