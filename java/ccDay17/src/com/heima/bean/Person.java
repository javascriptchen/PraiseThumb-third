package com.heima.bean;

public class Person implements Comparable<Person> {
	private String name;
	private int age;

	public Person() {
		super();

	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

//	@Override
//	public int compareTo(Person o) {
//		int num = this.age - o.age;
//		return num == 0 ? this.name.compareTo(o.name) : num;
//	}

	@Override
	public int compareTo(Person o) {
		int length = this.name.length() - o.name.length();
		int num = length == 0 ? this.name.compareTo(o.name) : length;
		return num == 0 ? this.age - o.age : num;
	}

}
