package com.heima.list;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo1_ArrayList {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("a");
		list.add("c");
		list.add("c");
		list.add("a");
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
