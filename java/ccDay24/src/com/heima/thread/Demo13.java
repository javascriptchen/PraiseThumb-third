package com.heima.thread;

public class Demo13 {

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("我是一个新的线程组");
		MyRunnable1 mr = new MyRunnable1();
		Thread t1 = new Thread(tg,mr, "张三");
		Thread t2 = new Thread(tg,mr, "李四");
		ThreadGroup tg1 = t1.getThreadGroup();
		ThreadGroup tg2 = t2.getThreadGroup();
		System.out.println(tg1.getName());
		System.out.println(tg2.getName());
	}

}

class MyRunnable1 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
	
}