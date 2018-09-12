package com.heima.test;

import java.lang.reflect.Method;
import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) throws Exception {
		ArrayList<Integer> arr = new ArrayList<>();
		arr.add(1);
		arr.add(2);
		
		Class clazz = Class.forName("java.util.ArrayList");
		Method m = clazz.getMethod("add", Object.class);
		m.invoke(arr, "abc");
		System.out.println(arr);
	}

}
