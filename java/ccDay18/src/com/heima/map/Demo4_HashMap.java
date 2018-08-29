package com.heima.map;

import java.util.HashMap;

import com.heima.bean.Student;

public class Demo4_HashMap {

	public static void main(String[] args) {
		HashMap<Student, String> hm = new HashMap<>();
		hm.put(new Student("张三", 23), "北京");
		hm.put(new Student("张三", 23), "上海");
		hm.put(new Student("李四", 24), "广州");
		hm.put(new Student("王五", 25), "深圳");
		System.out.println(hm);
	}

}
