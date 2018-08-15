package com.hei;

import com.hei.Person;

public class test1 {

	public static void main(String[] args) {
		Person person = new Person("123", 5);
		System.out.println(person.getName() + "..." + person.getAge());
	}

}
