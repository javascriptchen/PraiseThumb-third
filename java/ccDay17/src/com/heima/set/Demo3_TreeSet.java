package com.heima.set;

import java.util.TreeSet;

import com.heima.bean.Person;

public class Demo3_TreeSet {

	public static void main(String[] args) {
//		demo1();
//		demo2();
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("张三", 23));
		ts.add(new Person("李四", 13));
		ts.add(new Person("周七", 13));
		ts.add(new Person("王五", 43));
		ts.add(new Person("赵六", 33));

		System.out.println(ts);
	}

	public static void demo2() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("张三", 23));
		ts.add(new Person("李四", 13));
		ts.add(new Person("周七", 13));
		ts.add(new Person("王五", 43));
		ts.add(new Person("赵六", 33));

		System.out.println(ts);
	}

	private static void demo1() {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1);
		ts.add(1);
		ts.add(1);
		ts.add(1);
		ts.add(2);
		System.out.println(ts);
	}

}
