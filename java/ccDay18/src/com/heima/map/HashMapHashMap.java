package com.heima.map;

import java.util.HashMap;

import com.heima.bean.Student;

public class HashMapHashMap {

	public static void main(String[] args) {
		HashMap<Student, String> hm88 = new HashMap<>();
		hm88.put(new Student("张三", 23), "北京");
		hm88.put(new Student("李四", 24), "北京");
		hm88.put(new Student("王五", 25), "上海");
		hm88.put(new Student("赵六", 26), "广州");
		// 定义99期基础班
		HashMap<Student, String> hm99 = new HashMap<>();
		hm99.put(new Student("唐僧", 1023), "北京");
		hm99.put(new Student("孙悟空", 1024), "北京");
		hm99.put(new Student("猪八戒", 1025), "上海");
		hm99.put(new Student("沙和尚", 1026), "广州");
		
		HashMap<HashMap<Student, String>, String> hm = new HashMap<>();
		hm.put(hm88, "第88期基础班");
		hm.put(hm99, "第99期基础班");
		
		for (HashMap<Student, String> s : hm.keySet()) {
			String value = hm.get(s);
			for(Student key : s.keySet()) {
				String value2 = s.get(key);
				System.out.println(key+"="+value2+"="+value);
			}
			
		}
	}

}
