package com.heima.set;

import java.util.HashSet;
import java.util.Iterator;

import com.heima.bean.Person;


public class Demo1_HashSet {

	public static void main(String[] args) {
//		demo1();
		HashSet<Person> hs = new HashSet<>();
		hs.add(new Person("张三", 23));
		hs.add(new Person("张三", 23));
		hs.add(new Person("李四", 24));
		hs.add(new Person("李四", 24));
		hs.add(new Person("李四", 24));
		hs.add(new Person("李四", 24));
		
		//System.out.println(hs.size());
		System.out.println(hs);
	}

	private static void demo1() {
		HashSet<String> hs = new HashSet<>();
		hs.add("a");
		hs.add("a");
		hs.add("b");
		System.out.println(hs);
		Iterator<String> it = hs.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for (String string : hs) {
			System.out.println(string);
		}
	}

}
