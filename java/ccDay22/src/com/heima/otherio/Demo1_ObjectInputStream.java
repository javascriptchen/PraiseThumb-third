package com.heima.otherio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.heima.bean.Person;

public class Demo1_ObjectInputStream {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		// demo1();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
		ArrayList<Person> list = (ArrayList<Person>) ois.readObject();
		ois.close();
		for (Person p : list) {
			System.out.println(p);
		}

	}

	private static void demo1() throws IOException, FileNotFoundException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("e.txt"));
		Person p1 = (Person) ois.readObject();
		Person p2 = (Person) ois.readObject();
		System.out.println(p1);
		System.out.println(p2);
		ois.close();
	}

}
