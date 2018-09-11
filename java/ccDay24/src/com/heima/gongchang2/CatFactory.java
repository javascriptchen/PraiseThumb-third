package com.heima.gongchang2;

public class CatFactory implements Factory {

	@Override
	public Animal createAnimal() {

		return new Cat();
	}

}
