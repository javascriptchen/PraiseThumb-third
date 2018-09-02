package com.heima.map;

import java.util.ArrayList;

import com.heima.bean.BaseStudent;
import com.heima.bean.Student;

public class Demo_Genric {

	public static void main(String[] args) {
		ArrayList<Student> list1 = new ArrayList<>();
		list1.add(new Student("张三", 23));
		list1.add(new Student("李四", 24));
		ArrayList<BaseStudent> list2 = new ArrayList<>();
		list2.add(new BaseStudent("王五", 25));
		list2.add(new BaseStudent("赵六", 26));

		list1.addAll(list2);
	}

}
