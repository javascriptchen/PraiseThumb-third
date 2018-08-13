package Test_Jump;

public class Test_Jump {

	public static void main(String[] args) {
		Jump_Cat jump = new Jump_Cat("jiafei",8);
		jump.sleep();
		jump.eat();
		jump.jump();
		
		Cat c = new Cat("普通",1);
		c.sleep();
		c.eat();
	}

}

abstract class Animal {
	String name;
	int age;

	public  Animal() {
	}

	public  Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public abstract void sleep();

	public abstract void eat();
}

interface JumpCat{
	public void jump();
}

class Cat extends Animal {

	public  Cat() {
	}

	public  Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void sleep() {
		System.out.println("毛睡觉");
	}

	@Override
	public void eat() {
		System.out.println("毛吃鱼");
	}
}

class Jump_Cat extends Cat implements JumpCat{

	public Jump_Cat(String name, int age) {
		super(name , age);
	}

	@Override
	public void jump() {
		System.out.println("毛tiaogao");
	}
	
}