package com.heima.test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("config.txt"));
		String line = br.readLine();
		int num = Integer.parseInt(line);
		br.close();
		if(num > 0) {
			System.out.println("您还有" + num-- + "次试用机会");
			FileWriter fw = new FileWriter("config.txt");
			fw.write(num + "");
			fw.close();
		}else {
			System.out.println("请购买正版");
		}
	}

}
