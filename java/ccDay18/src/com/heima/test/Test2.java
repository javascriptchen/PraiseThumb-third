package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;

public class Test2 {

	public static void main(String[] args) {
		String[] num = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
		String[] color = { "红桃", "黑桃", "方片", "梅花" };
		ArrayList<String> poker = new ArrayList<>();
		for (String s1 : color) {
			for (String s2 : num) {
				poker.add(s1.concat(s2));
			}
		}
		poker.add("小王");
		poker.add("大王");
		Collections.shuffle(poker);
		ArrayList<String> gaojin = new ArrayList<>();
		ArrayList<String> longwu = new ArrayList<>();
		ArrayList<String> me = new ArrayList<>();
		ArrayList<String> dipai = new ArrayList<>();
		for (int i = 0; i < poker.size(); i++) {
			if (i >= poker.size() - 3) {
				dipai.add(poker.get(i));
			} else if (i % 3 == 0) {
				gaojin.add(poker.get(i));
			} else if (i % 3 == 1) {
				longwu.add(poker.get(i));
			} else {
				me.add(poker.get(i));
			}
		}

		System.out.println(me);
		System.out.println(gaojin);
		System.out.println(longwu);
		System.out.println(dipai);

	}

}
