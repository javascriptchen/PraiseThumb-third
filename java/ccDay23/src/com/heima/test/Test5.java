package com.heima.test;

public class Test5 {

	public static void main(String[] args) {
		// demo1();
		System.out.println(fun(8));
	}

	private static int fun(int i) {
		if (i == 1 || i == 2) {
			return 1;
		} else {
			return fun(i - 2) + fun(i - 1);
		}

	}

	private static void demo1() {
		int[] arr = new int[8];
		arr[0] = 1;
		arr[1] = 1;
		for (int i = 2; i < arr.length; i++) {
			arr[i] = arr[i - 1] + arr[i - 2];
		}
		System.out.println(arr[arr.length - 1]);
	}

}
