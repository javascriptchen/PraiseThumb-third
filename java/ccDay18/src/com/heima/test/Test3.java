package com.heima.test;

import java.util.ArrayList;
import java.util.HashMap;

public class Test3 {

	public static void main(String[] args) {
		String[] num = { "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2" };
		String[] color = { "红桃", "黑桃", "方片", "梅花" };
		HashMap<Integer, String> hm = new HashMap<>();
		ArrayList<Integer> list = new ArrayList<>();
		int index = 0;

		for (String s1 : num) {
			for (String s2 : color) {
				hm.put(index, s1.concat(s2));
				index++;
			}
		}
		System.out.println(index);
	}

}
