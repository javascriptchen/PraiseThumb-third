package neibu;

import org.omg.CORBA.PUBLIC_MEMBER;

public class mianshi {

	public static void main(String[] args) {
		Outer2.method().show();
	}

}

interface Inter2 {
	public void show();
}

class Outer2 {
	public static Inter2 method() {
		return new Inter2() {public void show() {System.out.println("hello world");}};
	}
}