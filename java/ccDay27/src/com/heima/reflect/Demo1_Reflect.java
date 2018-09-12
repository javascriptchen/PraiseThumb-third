package com.heima.reflect;

import com.heima.bean.Person;

public class Demo1_Reflect {

	public static void main(String[] args) throws ClassNotFoundException {
		Class clazz1 = Class.forName("com.heima.reflect.Person");
		Class clazz2 = Person.class;
		Person p = new Person();
		Class clazz3 = p.getClass();
	}

}
