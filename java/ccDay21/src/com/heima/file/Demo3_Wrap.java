package com.heima.file;

public class Demo3_Wrap {

	public static void main(String[] args) {
		HeiMa hm = new HeiMa(new Student());
		hm.code();
	}

}

interface Coder {
	public void code();
}

class Student implements Coder {

	@Override
	public void code() {
		System.out.println("javase");
		System.out.println("javaweb");
	}
}

class HeiMa implements Coder {
	private Student s;

	public HeiMa(Student s) {
		this.s = s;
	}

	@Override
	public void code() {
		s.code();
		System.out.println("ssh");
		System.out.println("数据库");
		System.out.println("大数据");
		System.out.println("...");
	}

}