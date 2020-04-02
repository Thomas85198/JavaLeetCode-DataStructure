package Day11_Inheritence_java;

public class Student extends Person {

//	String name;
//	int age;
	String major;
	
	public Student() {
		
	}
	
	public Student(String name, int age, String major) {
		this.name = name;
		setAge(age);
		this.major = major;
	}
	
//	public void eat() {
//		System.out.println("吃飯");
//	}
//	
//	public void sleep() {
//		System.out.println("睡覺");
//	}
	
	public void study() {
		System.out.println("name:" + name + ", age:" + getAge());
		
	}
	
	
}
