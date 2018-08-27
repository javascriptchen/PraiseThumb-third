package com.heima.test;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Test3 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
		list.add("c");
		getSingle(list);
		System.out.println(list);
	}

	public static void getSingle(ArrayList<String> list) {
		LinkedHashSet<String> lhs = new LinkedHashSet<>();
		lhs.addAll(list);
		list.clear();
		list.addAll(lhs);
	}

}
