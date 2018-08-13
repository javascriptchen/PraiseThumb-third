package neibu;

public class nimingjiekou {

	public static void main(String[] args) {
		Outer1 outer = new Outer1();
		outer.method();
	}

}

interface Inter{
	public void show();
}

class Outer1{
	public void method() {
		new Inter() {
			public void show() {
				System.out.println("show");
			}
		}.show();
	}
}