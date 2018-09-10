package com.heima.thread;

public class Demo5 {
	public static void main(String[] args) {
		new Thread("哈哈") {
			public void run() {
				System.out.println(getName() + "...aaa");
			}
		}.start();
		
		new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName() + "...aaa");
			}
			
		}).start();
		
		Thread.currentThread().setName("main");
		System.out.println(Thread.currentThread().getName());
	}
}
