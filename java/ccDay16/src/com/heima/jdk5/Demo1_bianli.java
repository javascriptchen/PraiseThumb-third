package com.heima.jdk5;

import java.util.ArrayList;

public class Demo1_bianli {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("d");
		for (String string : list) {
			System.out.println(string);
		}
	}

}
