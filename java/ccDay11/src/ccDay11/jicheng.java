package ccDay11;

public class jicheng {

	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.say();
	}

}

class Animal {
	String name;
	int age;

	public Animal() {
		this(name, age);
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void say() {
		System.out.println("我是：" + name + " 我年龄是：" + age);
	}
}

class Cat extends Animal {
	String name = "xiaohei";
	public Cat(String name, int age) {
		super(name, age);
	}
	public Cat() {
		super(); 
	}
}
