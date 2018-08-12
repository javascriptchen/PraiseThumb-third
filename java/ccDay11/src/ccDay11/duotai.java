package ccDay11;

public class duotai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method(new bigCat());
		method(new Dog());
	}
	
	public static void method(Dongwu a) {
		if(a instanceof bigCat) {
			bigCat c = (bigCat)a;
			c.eat();
			c.catchMouse();
		}else if(a instanceof Dog) {
			Dog d = (Dog)a;
			d.eat();
			d.lookHome();
		}else {
			a.eat();
		}
		
	}

}

class Dongwu {
	public void eat() {
		System.out.println("吃饭");
	}
}

class bigCat extends Dongwu {
	public void eat() {
		System.out.println("猫吃鱼");
	}

	public void catchMouse() {
		System.out.println("猫捉老鼠");
	}
}

class Dog extends Dongwu{
	public void eat() {
		System.out.println("狗吃肉");
	}

	public void lookHome() {
		System.out.println("狗看门");
	}
}
