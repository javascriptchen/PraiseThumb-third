package com.heima.test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;

public class Test4 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("aaa");
		list.add("ccc");
		list.add("ddd");
		list.add("fffffffffff");
		list.add("heima");
		list.add("itcast");
		list.add("bbbb");
		list.add("aaa");
		list.add("aaa");
		System.out.println(list);
		sort(list);
		System.out.println(list);
	}

	public static void sort(ArrayList<String> list) {
		TreeSet<String> ts = new TreeSet<>(new Comparator<String>() {

			@Override
			public int compare(String s1, String s2) {
				int num = s1.compareTo(s2);
				return num == 0 ? 1 : num;
			}
		});
		ts.addAll(list);
		list.clear();
		list.addAll(ts);
	}

}
