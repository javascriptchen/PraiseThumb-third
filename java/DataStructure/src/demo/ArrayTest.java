package demo;

import array.Array;

public class ArrayTest {

	public static void main(String[] args) {
		Array arr = new Array(30);
		for (int i = 0; i < 10; i++) {
			arr.addLast(i);
		}
		System.out.println(arr);
		arr.add(1, 100);
		System.out.println(arr);
		arr.addFirst(-1);
		System.out.println(arr);
	}

}
