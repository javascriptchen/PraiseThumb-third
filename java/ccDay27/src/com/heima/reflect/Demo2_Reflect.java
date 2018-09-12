package com.heima.reflect;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Demo2_Reflect {

	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException {
		Juicer j = new Juicer();
		BufferedReader br = new BufferedReader(new FileReader("config.properties"));
		Class clazz = Class.forName(br.readLine());
		Fruit f = (Fruit) clazz.newInstance();
		j.run(f);
	}

}

interface Fruit {
	public void squeeze();
}

class Apple implements Fruit {

	@Override
	public void squeeze() {
		System.out.println("苹果");
	}

}

class Orange implements Fruit {

	@Override
	public void squeeze() {
		System.out.println("橘子");
	}

}

class Juicer{
	public void run(Fruit f) {
		f.squeeze();
	}
}