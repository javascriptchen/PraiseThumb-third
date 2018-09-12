package com.heima.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import com.heima.bean.Person;

public class Demo4_Field {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, Exception, SecurityException {
		Class clazz = Class.forName("com.heima.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class);
		Person p = (Person) c.newInstance("张三",23);
		
		Field f = clazz.getDeclaredField("name");
		f.setAccessible(true);
		f.set(p, "李四");
		System.out.println(p);
	}

}
