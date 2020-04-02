package Day12_Inheritence_java1;

public class Student extends Person {

	
	String major;

	public Student() {
		
	}

	public Student(String major) {
		
		this.major = major;
	}
	
	public void study() {
		System.out.println("學習，專業是：" + major);
	}
	
	// 對父類中進行重寫
	@Override
	public void eat() {
		
	}
	
	public String obj() {
		return null;
	}
	
	
	
	
	
	
}
