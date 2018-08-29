package com.heima.map;

import java.util.HashMap;
import java.util.Map;

public class Iteater {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("张4", 24);
		map.put("张5", 25);
//		Set<String> keySet = map.keySet();
//		Iterator<String> it = keySet.iterator();
//		while (it.hasNext()) {
//			String key = it.next();
//			Integer value = map.get(key);
//			System.out.println(key + "=" + value);
//		}
		for (String i : map.keySet()) {
			int value = map.get(i);
			System.out.println(i+value);
		}
		
	}

}
