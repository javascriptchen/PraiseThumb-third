package com.heima.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo3_Copy {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("双元.jpg");
		FileOutputStream fos = new FileOutputStream("copy.jpg");
		int b;
		while((b = fis.read()) != -1) {
			fos.write(b);
		}
		
		fis.close();
		fos.close();
	}

}
