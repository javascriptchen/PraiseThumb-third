package com.heima.file;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo1_FileMethod {

	public static void main(String[] args) throws IOException {
		File file = new File("yyy.txt");
		System.out.println(file.createNewFile());
		File dir1 = new File("aaa");
		System.out.println(dir1.mkdir());
		File dir2 = new File("ccc/bbb");
		System.out.println(dir2.mkdirs());
		Date d1 = new Date(file.lastModified());
		System.out.println(d1);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
		System.out.println(sdf.format(d1));
	}

}
