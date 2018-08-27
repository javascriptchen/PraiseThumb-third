package com.heima.test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Test1 {

	public static void main(String[] args) {
		Random r = new Random();
		HashSet<Integer> hs = new HashSet<>();
		while (hs.size() < 10) {
			hs.add(r.nextInt(20) + 1);
		}
		Iterator<Integer> it = hs.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
