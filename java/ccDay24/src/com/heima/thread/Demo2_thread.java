package com.heima.thread;

public class Demo2_thread {

	public static void main(String[] args) {
		MyThread mt = new MyThread();
		mt.start();
		for (int i = 0; i < 1000; i++) {
			System.out.println("b");
		}
	}

}

class MyThread extends Thread{
	public void run() {
		for (int i = 0; i < 1000; i++) {
			System.out.println("aaaaaa");
		}
	}
}