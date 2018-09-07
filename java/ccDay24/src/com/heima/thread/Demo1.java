package com.heima.thread;

public class Demo1 {

	public static void main(String[] args) {
		for (int i = 0; i < 1000000; i++) {
			new Demo();
		}
		for (int i = 0; i < 10000; i++) {
			System.out.println("我是主线程");
		}
	}
}

class Demo {

	@Override
	protected void finalize() throws Throwable {

		System.out.println("垃圾北清扫了");
	}

}
