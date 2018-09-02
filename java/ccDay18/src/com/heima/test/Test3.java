package com.heima.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

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
				list.add(index);
				index++;
			}
		}
		hm.put(index, "小王");
		list.add(index);
		index++;
		hm.put(index, "大王");
		list.add(index);
		Collections.shuffle(list);
		TreeSet<Integer> gaojin = new TreeSet<>();
		TreeSet<Integer> longwu = new TreeSet<>();
		TreeSet<Integer> me = new TreeSet<>();
		TreeSet<Integer> dipai = new TreeSet<>();
		for (int i = 0; i < list.size(); i++) {
			if (i >= list.size() - 3) {
				dipai.add(list.get(i));
			} else if (i % 3 == 0) {
				gaojin.add(list.get(i));
			} else if (i % 3 == 1) {
				longwu.add(list.get(i));
			} else {
				me.add(list.get(i));
			}
		}
		lookPoker(hm, gaojin, "高进");
		lookPoker(hm, longwu, "龙五");
		lookPoker(hm, me, "冯佳");
		lookPoker(hm, dipai, "底牌");
	}

	public static void lookPoker(HashMap<Integer, String> hm, TreeSet<Integer> list, String name) {
		System.out.print(name + "的牌是：");
		for (Integer index : list) {
			System.out.print(hm.get(index) + " ");
		}
		System.out.println();
	}
}
