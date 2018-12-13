class PraiseButton {
	constructor(num, element) {
		this.num = num;
		this.element = element;
	}
	clickAction() {
		this.element.click(
			this.throttle(() => {
				if (this.num < 10) {
					this.element.css("-webkit-filter", "grayscale(0)");
					$("#animation").addClass("num");
					this.num = window.add(this.num);
					setTimeout(() => {
						$("#animation").removeClass("num");
					}, 1000);
					axios.get("/index/update")
						.then(res => {

						})
						.catch(err => {

						});
				} else {
					this.element.css("-webkit-filter", "grayscale(1)");
					this.num = 0;
				}
				console.log(this.num);
			}, 500)
		);
	}

	throttle(fn, wait) {
		var timer;
		return (...args) => {
			timer = setTimeout(() => timer = null, wait);
			return fn.apply(this, args);
		};
	}
}

class Thumb extends PraiseButton {
	constructor(num, element) {
		super(num, element);
	}
}

export default {
	Thumb
};