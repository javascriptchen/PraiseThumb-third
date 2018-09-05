package com.heima.test;

import java.io.File;
import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		File dir = getFile();
		printJavaFile(dir);
	}

	private static void printJavaFile(File dir) {
		File[] subFile = dir.listFiles();
		
		for (File file : subFile) {
			if(file.isFile() && file.getName().endsWith(".java")) {
				System.out.println(file);
			}else if(file.isDirectory()) {
				printJavaFile(file);
			}
		}
		
	}

	private static File getFile() {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入路径：");
		while (true) {
			String line = sc.nextLine();
			File dir = new File(line);
			if (dir.isFile()) {
				System.out.println("您录入的是文件路径,请重新录入文件夹路径");
			} else if (!dir.exists()) {
				System.out.println("您录入的文件夹路径不存在,请重新录入");
			} else {
				return dir;
			}
		}
	}

}
