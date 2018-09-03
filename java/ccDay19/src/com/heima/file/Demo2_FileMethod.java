package com.heima.file;

import java.io.File;
import java.io.FilenameFilter;

public class Demo2_FileMethod {

	public static void main(String[] args) {
		File dir = new File("/Users/chenchen/Downloads");
//		String[] arr = dir.list();
//		for (String string : arr) {
//			System.out.println(string);
//		}
//		File[] subfile = dir.listFiles();
//		for (File file : subfile) {
//			if(file.isFile()&&file.getName().endsWith(".mkv")) {
//				System.out.println(file);
//			}
//		}
		String[] arr = dir.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				File file = new File(dir,name);
				return file.isFile()&&file.getName().endsWith(".mkv");
			}
		});
		
		for (String string : arr) {
			System.out.println(string);
		}
	}

}
