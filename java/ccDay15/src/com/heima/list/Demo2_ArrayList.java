package com.heima.list;

import java.util.ArrayList;
import java.util.Iterator;

import com.heima.bean.Person;

public class Demo2_ArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(new Person("张三", 23));
		list.add(new Person("张三", 23));
		list.add(new Person("李四", 24));
		list.add(new Person("李四", 24));
		list.add(new Person("李四", 24));
		list.add(new Person("李四", 24));
		System.out.println(getSingle(list));
	}
	
	public static ArrayList getSingle(ArrayList list) {
		ArrayList newList = new ArrayList();
		Iterator it = list.iterator();
		while (it.hasNext()) {
			Object obj = it.next();
			if (!newList.contains(obj)) {
				newList.add(obj);
			}
		}

		return newList;

	}
}
