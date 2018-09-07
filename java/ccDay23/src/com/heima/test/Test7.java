package com.heima.test;

import java.util.ArrayList;

public class Test7 {

	public static void main(String[] args) {
		System.out.println(luckyNum(8));
	}

	public static int luckyNum(int num) {
		ArrayList<Integer> list = new ArrayList<>();
		for (int i = 1; i <= num; i++) {
			list.add(i);
		}
		int count = 1;
		for (int i = 0; 1 != list.size(); i++) {
			if (i == list.size()) {
				i = 0;
			}
			if (count % 3 == 0) {
				list.remove(i--);
			}
			count++;
		}
		return list.get(0);
	}

}
