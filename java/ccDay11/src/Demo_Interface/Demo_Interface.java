package Demo_Interface;

public class Demo_Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo demo = new Demo();
		demo.print();
	}

} 

interface Inter {
	int num = 10;
}

class Demo implements Inter{
	public void print() {
		System.out.println(num);
	}
}
