package com.heima.test;

import java.io.File;
import java.util.Scanner;

public class Demo1 {

	public static void main(String[] args) {
		File dir = getFile();
		System.out.println(getFileLength(dir));
	}

	private static long getFileLength(File dir) {
		long num = 0;
		File[] subFiles = dir.listFiles();
		for (File subFile : subFiles) {
			if (subFile.isFile()) {
				num += subFile.length();
			} else {
				num = num + getFileLength(subFile);
			}
		}
		return num;
	}

	public static File getFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个文件夹路径：");
		while (true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if (!dir.exists()) {
				System.out.println("您录入的文件夹路径不存在,请输入一个文件夹路径:");
			} else if (dir.isFile()) {
				System.out.println("您录入的是文件路径,请输入一个文件夹路径:");
			} else {
				return dir;
			}
		}
	}
}
