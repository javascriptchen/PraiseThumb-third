package com.heima.test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数据");
		FileOutputStream fos = new FileOutputStream("test.txt");
		while(true) {
			String line = sc.nextLine();
			if(line.equals("quit")) {
				break;
			}else {
				fos.write(line.getBytes());
				fos.write("\r\n".getBytes());
			}
		}
		fos.close();
	}

}
