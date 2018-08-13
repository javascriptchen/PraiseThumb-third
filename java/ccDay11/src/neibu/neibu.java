package neibu;

public class neibu {

	public static void main(String[] args) {
//		Outer.Inner oi = new Outer().new Inner();
//		oi.print();
		Outer outer = new Outer();
		outer.method();
	}

}

class Outer{
	private int num = 10;
	private class Inner{
		public void print() {
			System.out.println(num);
		}
	}
	public void method() {
		Inner inner = new Inner();
		inner.print();
	}
	
}
