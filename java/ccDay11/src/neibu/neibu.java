package neibu;

public class neibu {

	public static void main(String[] args) {
		Outer.Inner oi = new Outer().new Inner();
		oi.print();
	}

}

class Outer{
	private int num = 10;
	class Inner{
		public void print() {
			System.out.println(num);
		}
	}
}
