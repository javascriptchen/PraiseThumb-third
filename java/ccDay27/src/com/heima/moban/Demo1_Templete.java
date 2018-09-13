package com.heima.moban;

public class Demo1_Templete {

	public static void main(String[] args) {
		Demo d = new Demo();
		System.out.println(d.getTime());
	}

}

abstract class GetTime{
	public final long getTime() {
		long start = System.currentTimeMillis();
		code();
		long end = System.currentTimeMillis();
		return end - start;
	}

	public abstract void code() ;
}

class Demo extends GetTime{

	@Override
	public void code() {
		int i = 0;
		while(i<100000) {
			System.out.println("x");
			i++;
		}
	}
	
}