import css from "../css/index.css";

class PraiseButton {
	constructor() {}
	clickAction() {
		axios.get("/index/update")
			.then(res => {

			})
			.catch(err => {

			});
	}
}

export default PraiseButton;