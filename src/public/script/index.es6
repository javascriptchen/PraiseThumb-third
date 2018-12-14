import css from "../css/index.css";

class PraiseButton {
	constructor() {}
	clickAction() {
		this.element.click(
			axios.get("/index/update")
				.then(res => {

				})
				.catch(err => {

				})
		);
	}
}

export default PraiseButton;