package com.heima.thread;

public class Demo11 {
	public static void main(String[] args) {
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
		new Ticket().start();
	}
}

class Ticket extends Thread {
	private static int ticket = 100;

	public void run() {
		while (true) {
			synchronized (Ticket.class) {
				if (ticket <= 0) {
					break;
				}
				try {
					Thread.sleep(10);
				} catch (InterruptedException e) {

					e.printStackTrace();
				}
				System.out.println(getName() + "这是第" + ticket-- + "张票");
			}
		}
	}
}