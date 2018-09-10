package com.heima.thread;

public class Demo12 {

	public static void main(String[] args) {
		MyTicket mt = new MyTicket();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
		new Thread(mt).start();
	}

}

class MyTicket implements Runnable{

	private  int ticket = 100;
	@Override
	public void run() {
		while (true) {
			synchronized (this) {
				if (ticket <= 0) {
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println(Thread.currentThread().getName() + "这是第" + ticket-- + "张票");
			}
		}
	}
	
}