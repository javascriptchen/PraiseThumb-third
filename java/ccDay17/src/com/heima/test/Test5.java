package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入字符串：");
		String line = sc.nextLine();
		char[] arr = line.toCharArray();
		TreeSet<Character> ts = new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character s1, Character s2) {
				int num = s1.compareTo(s2);
				return num == 0 ? 1 : num;
			}
		});
		
		for (Character character : arr) {
			ts.add(character);
		}
		for (Character character : ts) {
			System.out.print(character);
		}
	}

}
