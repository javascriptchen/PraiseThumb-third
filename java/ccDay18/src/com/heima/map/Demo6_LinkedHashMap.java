package com.heima.map;

import java.util.HashMap;

public class Demo6_LinkedHashMap {

	public static void main(String[] args) {
		String s = "aaaaasssssvvvvvvvvv";
		char[] arr = s.toCharArray();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (char c : arr) {
			/*
			 * if (!hm.containsKey(c)) { hm.put(c, 1); } else { hm.put(c, hm.get(c) + 1); }
			 */
			hm.put(c, hm.containsKey(c) ? hm.get(c) + 1 : 1);
		}
		// System.out.println(hm);
		for (Character key : hm.keySet()) {
			System.out.println(key + "=" + hm.get(key));
		}
	}
}
