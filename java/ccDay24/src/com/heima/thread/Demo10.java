package com.heima.thread;

public class Demo10 {

	public static void main(String[] args) {
		Printer2 p = new Printer2();
		new Thread() {
			public void run() {
				while (true) {
					p.print1();
				}
			}
		}.start();
		new Thread() {
			public void run() {
				while (true) {
					p.print2();
				}
			}
		}.start();
	}

}

class Printer2 {
	Demo d = new Demo();

	public static synchronized void  print1() {
			System.out.print("黑");
			System.out.print("马");
			System.out.print("程");
			System.out.print("序");
			System.out.print("员");
			System.out.print("\r\n");
	}

	public void print2() {
		synchronized (Printer2.class) {
			System.out.print("传");
			System.out.print("智");
			System.out.print("播");
			System.out.print("客");
			System.out.print("\r\n");
		}
	}
}