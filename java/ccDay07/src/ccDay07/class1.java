package ccDay07;

public class class1 {

	public static void main(String[] args) {
		
		Student stu1 = new Student();
		stu1.name = "马云";
		stu1.age = 50;
		stu1.gender = '男';
		
//		stu1.study();
//		stu1.sleep();
		stu1.say();
	}
}

//声明一个类
class Student{
	//属性
	String name;
	int age;
	char gender;
	
	//行为
	public void study() {
		System.out.println(name + "学习java");
	}
	
	public void sleep() {
		System.out.println(name + "睡觉");
	}
	
	public void say() {
		System.out.println("大家好，我是" + name);
		System.out.println("我的年龄是" + age);
		System.out.println("我的性别是" + gender);
	}
}