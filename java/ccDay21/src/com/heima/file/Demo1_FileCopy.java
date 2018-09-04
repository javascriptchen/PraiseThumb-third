package com.heima.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1_FileCopy {

	public static void main(String[] args) throws IOException {
		//demo1();
		FileReader fr = new FileReader("aaa.txt");
		FileWriter fw = new FileWriter("bbb.txt");
		
		char[] arr = new char[1024*8];
		int len;
		while((len = fr.read(arr)) != -1) {
			fw.write(arr,0,len);
		}
		fr.close();
		fw.close();
	}

	private static void demo1() throws FileNotFoundException, IOException {
		FileReader fr = new FileReader("aaa.txt");
		FileWriter fw = new FileWriter("bbb.txt");
		int b;
		while((b = fr.read()) != -1) {
			fw.write(b);
		}
		fr.close();
		fw.close();
	}

}
