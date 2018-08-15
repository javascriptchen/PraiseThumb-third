package com.heima.debug;

import com.heima.animal.Cat;

public class test {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			sum++;
		}
		System.out.println(sum);
		Cat cat = new Cat();
		cat.toString();
	}
	
	@Override
	public  String toString() {
		return "大家好";
		
	}

}
