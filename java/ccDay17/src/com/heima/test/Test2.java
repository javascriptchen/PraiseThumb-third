package com.heima.test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一段字符串：");
		LinkedHashSet<Character> lhs = new LinkedHashSet<>();
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		for (char c : arr) {
			lhs.add(c);
		}
		Iterator<Character> it = lhs.iterator();
		while(it.hasNext()) {
			System.out.print(it.next());
		}
	}
}