package com.heima.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.heima.bean.Person;

public class Demo3_Constructor {

	public static void main(String[] args) throws Exception  {
		Class clazz = Class.forName("com.heima.bean.Person");
		Constructor c = clazz.getConstructor(String.class,int.class); 
		Person p = (Person) c.newInstance("张三",23);
		System.out.println(p);
	}

}
