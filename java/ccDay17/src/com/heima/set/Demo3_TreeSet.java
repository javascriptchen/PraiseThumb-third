package com.heima.set;

import java.util.Comparator;
import java.util.TreeSet;

import com.heima.bean.Person;

public class Demo3_TreeSet {

	public static void main(String[] args) {
//		demo1();
//		demo2();
//		demo3();
//		demo4();
		TreeSet<String> ts = new TreeSet<>(new CompareByLen());
		ts.add("aaaaaaaa");
		ts.add("z");
		ts.add("wc");
		ts.add("nba");
		ts.add("cba");

		System.out.println(ts);
	}

	private static void demo4() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("zhangsan", 23));
		ts.add(new Person("lisi", 13));
		ts.add(new Person("wangwu", 33));
		ts.add(new Person("zhaoliu", 43));
		ts.add(new Person("aaaa", 53));

		System.out.println(ts);
	}

	private static void demo3() {
		TreeSet<Person> ts = new TreeSet<>();
		ts.add(new Person("张三", 23));
		ts.add(new Person("李四", 13));
		ts.add(new Person("周七", 13));
		ts.add(new Person("王五", 43));
		ts.add(new Person("赵六", 33));

		System.out.println(ts);
	}

	public static void demo2() {
		demo3();
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

class CompareByLen implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		int num = o1.length() - o2.length();
		return num == 0 ? o1.compareTo(o2) : num;
	}

}
