package com.heima.file;

import java.io.File;
import java.io.IOException;

public class Demo1_FileMethod {

	public static void main(String[] args) throws IOException {
		File file = new File("yyy.txt");
		System.out.println(file.createNewFile());
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());
		File dir2 = new File("ccc/bbb");
		System.out.println(dir2.mkdirs());
	}

}
