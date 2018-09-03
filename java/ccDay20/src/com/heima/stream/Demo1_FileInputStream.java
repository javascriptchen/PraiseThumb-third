package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Demo1_FileInputStream {

	public static void main(String[] args) throws IOException {
		//demo1();
		FileInputStream fis = new FileInputStream("aaa");
		int b ;
		while((b = fis.read()) != -1) {
			System.out.println(b);
		}
		
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileInputStream fis = new FileInputStream("aaa");
		int x = fis.read();
		System.out.println(x);
		fis.close();
	}

}
