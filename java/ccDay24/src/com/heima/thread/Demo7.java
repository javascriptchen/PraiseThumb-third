package com.heima.thread;

public class Demo7 {
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 2; i++) {
					System.out.println(getName() + "...aaaaaaaaaaaaaaaaaaaa");
				}
			}
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 50; i++) {
					System.out.println(getName() + "...bb");
				}
			}
		};

		t1.setDaemon(true); // ����Ϊ�ػ��߳�

		t1.start();
		t2.start();
	}
}
