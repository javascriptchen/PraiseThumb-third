package chouxiang;

public class chouxiang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat c = new Cat("小花",5);
		System.out.println(c.getName()+c.getAge());
		c.eat();
		c.catchMouse();
		
		Dog d = new Dog("小八",20);
		System.out.println(d.getName()+d.getAge());
		d.eat();
		d.lookHome();
	}

}

abstract class Animal {
	private String name;
	private int age;

	public Animal() {
	}

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	public abstract void eat();
}

class Cat extends Animal {

	public Cat() {}

	public Cat(String name, int age) {
		super(name,age);
	}

	@Override
	public void eat() {
		System.out.println("猫吃鱼");
	}
	
	public void catchMouse() {
		System.out.println("捉老鼠");
	}

}

class Dog extends Animal {

	public Dog() {}

	public Dog(String name, int age) {
		super(name,age);
	}

	@Override
	public void eat() {
		System.out.println("狗吃肉");
	}
	
	public void lookHome() {
		System.out.println("看家");
	}

}