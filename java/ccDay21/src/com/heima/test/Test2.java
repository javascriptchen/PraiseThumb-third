package com.heima.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Test2 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("aaa.txt"));
		HashMap<Character, Integer> hm = new HashMap<>();
		int c;
		while ((c = br.read()) != -1) {
			char ch = (char) c;
			if (!hm.containsKey(ch)) {
				hm.put(ch, 1);
			} else {
				hm.put(ch, hm.get(ch) + 1);
			}
			hm.put(ch, hm.containsKey(ch) ? hm.get(ch) + 1 : 1);
		}
		br.close();
		BufferedWriter bw = new BufferedWriter(new FileWriter("test.txt"));
		for (Character ch : hm.keySet()) {
			switch (ch) {
			case '\n':
				bw.write("\\n" + "=" + hm.get(ch));
				break;
			case '\r':
				bw.write("\\r" + "=" + hm.get(ch));
				break;
			case '\t':
				bw.write("\\t" + "=" + hm.get(ch));
				break;

			default:
				bw.write(ch + "=" + hm.get(ch));
				break;
			}
			
			bw.newLine();
		}
		bw.close();
	}

}
