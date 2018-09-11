package com.heima.gongchang;

public class AnimalFactory {
	public static Animal creatAnimal(String name) {
		if("dog".equals(name)) {
			return new Dog();
		}else if("cat".equals(name)) {
			return new Cat();
		}else {
			return null;
		}
		
	}
}
