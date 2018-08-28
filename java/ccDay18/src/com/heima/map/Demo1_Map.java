package com.heima.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Demo1_Map {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("张三", 23);
		map.put("张4", 24);
		map.put("张5", 25);
		Collection<Integer> c = map.values();
		System.out.println(c);
		System.out.println(map.size());
	}
}
