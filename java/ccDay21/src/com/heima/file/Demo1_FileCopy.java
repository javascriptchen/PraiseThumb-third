package com.heima.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Demo1_FileCopy {

	public static void main(String[] args) throws IOException {
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
