package com.heima.test;

import java.util.Arrays;

public class Test10 {

	public static void main(String[] args) {
		int[] stringArray = { 3, 4, 2, 1, 0 }; // false
//		Integer[] stringArray = { 3, 4, 2, 1, 0 }; // true
		boolean b = Arrays.asList(stringArray).contains(1);
		System.out.println(b);
	}

}
