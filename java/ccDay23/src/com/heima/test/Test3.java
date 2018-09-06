package com.heima.test;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {
		File src = Demo1.getFile();
		File dest = Demo1.getFile();
		if (src.equals(dest)) {
			System.out.println("目标文件夹是原文件夹的子文件夹");
		} else {
			copy(src, dest);
		}

	}

	public static void copy(File src, File dest) throws IOException {
		File newDir = new File(dest, src.getName());
		newDir.mkdir();
		File[] subFiles = src.listFiles();
		for (File subfile : subFiles) {
			if (subfile.isFile()) {
				BufferedInputStream bis = new BufferedInputStream(new FileInputStream(subfile));
				BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(new File(newDir,subfile.getName())));
				int b ;
				while((b = bis.read()) != -1) {
					bos.write(b);
				}
				bis.close();
				bos.close();
			}else {
				copy(subfile,newDir);
			}
		}
	}

}
