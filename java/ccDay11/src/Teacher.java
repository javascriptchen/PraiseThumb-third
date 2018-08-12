
public class Teacher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestTeacher t = new TestTeacher("hehe",12);
		t.teach();
	}

}

abstract class BaseTeacher{
	private String name;
	private int age;

	public BaseTeacher() {
	}

	public BaseTeacher(String name, int age) {
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

	public abstract void teach();
}

class TestTeacher extends BaseTeacher{
	public TestTeacher() {
	}

	public TestTeacher(String name, int age) {
		super(name,age);
	}

	@Override
	public void teach() {
		System.out.println(this.getName()+this.getAge()+"讲课");
	}
}