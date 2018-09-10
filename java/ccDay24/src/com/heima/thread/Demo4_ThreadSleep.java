package com.heima.thread;

public class Demo4_ThreadSleep {

	public static void main(String[] args) {
		new Thread("哈哈") {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(getName()+"...aaa");
				}
			}
		}.start();
		
		new Thread("呵呵") {
			public void run() {
				for (int i = 0; i < 1000; i++) {
					System.out.println(getName()+"...b");
				}
			}
		}.start();
	}

}
