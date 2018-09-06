package com.heima.test;

import java.io.File;

public class Test2 {

	public static void main(String[] args) {
		File dir = Demo1.getFile();
		deleteFile(dir);
	}
	public static void deleteFile(File dir) {
		File[] subFiles = dir.listFiles();
		for (File subfile : subFiles) {
			if(subfile.isFile()) {
				subfile.delete();
			}else {
				deleteFile(subfile);
			}
		}
		dir.delete();
	}
}
