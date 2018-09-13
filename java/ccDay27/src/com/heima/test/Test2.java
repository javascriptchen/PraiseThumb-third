package com.heima.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Constructor;

public class Test2 {

	public static void main(String[] args) throws Exception, IOException {
		BufferedReader br = new BufferedReader(new FileReader("xxx.properties"));
		Class clazz = Class.forName(br.readLine());
		DemoClass dc = (DemoClass) clazz.newInstance();
		System.out.println(dc);
		dc.run();
	}

}
