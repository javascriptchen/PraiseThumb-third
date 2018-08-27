package com.heima.test;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class Test6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		TreeSet<Integer> ts = new TreeSet<>(new Comparator<Integer>() {

			@Override
			public int compare(Integer i1, Integer i2) {
				int num = i2 - i1;
				return num == 0 ? 1 : num;
			}
		});
		while(true) {
			String line = sc.nextLine();
			if (line.equals("quit")) {
				break;
			}
			Integer i = Integer.parseInt(line);
			ts.add(i);
		}
		
		for (Integer integer : ts) {
			System.out.println(integer);
		}
	}

}
