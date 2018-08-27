package com.heima.list;

import java.util.ArrayList;

import com.heima.bean.Person;

public class Demo1_qiantaoArrayList {

	public static void main(String[] args) {
		ArrayList<ArrayList<Person>> list = new ArrayList<>();
		ArrayList<Person> first = new ArrayList<>();
		first.add(new Person("杨幂", 30));
		first.add(new Person("李冰冰", 33));
		first.add(new Person("范冰冰", 20));
		ArrayList<Person> second = new ArrayList<>();
		second.add(new Person("黄晓明", 31));
		second.add(new Person("赵薇", 33));
		second.add(new Person("陈坤", 32));
		list.add(first);
		list.add(second);
		System.out.println(list);
	}

}
