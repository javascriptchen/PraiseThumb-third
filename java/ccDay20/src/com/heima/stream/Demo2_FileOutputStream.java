package com.heima.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2_FileOutputStream {

	public static void main(String[] args) throws IOException {
		FileOutputStream fos = new FileOutputStream("yyy.txt",true);
		fos.write(97);
		fos.write(98);
		fos.close();
	}

}
