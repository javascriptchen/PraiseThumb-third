package com.heima.gongchang;

public class Test {

	public static void main(String[] args) {
		Animal d = AnimalFactory.creatAnimal("dog");
		Animal c = AnimalFactory.creatAnimal("cat");
		d.eat();
		c.eat();
	}

}
