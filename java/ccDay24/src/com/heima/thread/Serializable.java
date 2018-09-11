package com.heima.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Serializable {

	public static void main(String[] args) {

	}

}

class Printer2 {
	private ReentrantLock r = new ReentrantLock();
	private Condition c1 = r.newCondition();
	private Condition c2 = r.newCondition();
	private Condition c3 = r.newCondition();
	private int flag = 1;

	public void print1() throws InterruptedException {
		r.lock();
		if (flag != 1) {
			c1.await(); // 当前线程等待
		}
		System.out.print("黑");
		System.out.print("马");
		System.out.print("程");
		System.out.print("序");
		System.out.print("员");
		System.out.print("\r\n");
		flag = 2;
		c2.signal();
		r.unlock();
	}

	public void print2() throws InterruptedException {
		r.lock();
		if (flag != 2) {
			c2.await(); // 线程2在此等待
		}
		System.out.print("传");
		System.out.print("智");
		System.out.print("播");
		System.out.print("客");
		System.out.print("\r\n");
		flag = 3;
		c3.signal();
		r.unlock();
	}

	public void print3() throws InterruptedException {
		r.lock();
		if (flag != 3) {
			c3.await(); // 线程3在此等待,if语句是在哪里等待,就在哪里起来
							// while循环是循环判断,每次都会判断标记
		}
		System.out.print("i");
		System.out.print("t");
		System.out.print("h");
		System.out.print("e");
		System.out.print("i");
		System.out.print("m");
		System.out.print("a");
		System.out.print("\r\n");
		flag = 1;
		c1.signal();
		r.unlock();
	}
}
