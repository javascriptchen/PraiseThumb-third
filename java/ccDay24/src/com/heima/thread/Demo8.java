package com.heima.thread;

public class Demo8 {
	public static void main(String[] args) {
		final Thread t1 = new Thread() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					System.out.println(getName() + "...aaaaaaaaaaaaa");
				}
			}
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for(int i = 0; i < 10; i++) {
					if(i == 2) {
						try {
							//t1.join();
							t1.join(2);					//���ָ����ʱ��,����ָ��ʱ���,�����߳̽���ִ��
						} catch (InterruptedException e) {
							
							e.printStackTrace();
						}
					}
					System.out.println(getName() + "...bb");
				}
			}
		};
		
		t1.start();
		t2.start();
	}
}
