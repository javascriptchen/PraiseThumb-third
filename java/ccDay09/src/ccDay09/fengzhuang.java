package ccDay09;

public class fengzhuang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person();
		p.name = "马云";
		p.setAge(20);
		System.out.println(p.getAge());
		p.say();
		
	}

}

class Person {
	String name;
	private int age;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int myAge) {
		if(myAge > 0 && myAge <150) {
			age = myAge;
		}else {
			System.out.println("请输入正确的年龄");
		}
	}
	
	public void say() {
		System.out.println("我的名字是：" + name + "我的年龄是：" + age);
	}
}