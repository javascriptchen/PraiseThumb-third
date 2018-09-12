package com.heima.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import com.heima.bean.Person;

public class Demo5_Method {

	public static void main(String[] args) throws Exception {
		Class clazz = Class.forName("com.heima.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("张三",23);
		
		Method m = clazz.getMethod("eat");
		m.invoke(p);
		
		Method m2 = clazz.getDeclaredMethod("eat", int.class);
		m2.invoke(p, 10);
	}

}
