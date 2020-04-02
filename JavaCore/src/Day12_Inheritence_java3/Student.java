package Day12_Inheritence_java3;

public class Student extends Person {

	String major;
	int id = 1002; // 學號
	
	public Student() {
		
	}
	
	public Student(String major) {
		this.major = major;
	}
	
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;
	}
	
	@Override
	public void eat() {
		System.out.println("学生：多吃有营养的食物");
		super.eat();
	}
	
	public void study() {
		System.out.println("學生，學習知識");
	}
	
	public void show() {
		System.out.println("name = " + this.name + ", age = " + super.age);
		System.out.println("id = " + this.id);
		System.out.println("id = " + super.id);
		
	}
}
