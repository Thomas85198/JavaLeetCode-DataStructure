package Day08_Class_exer;

public class Person {
	
	String name;
	int age;
	/**
	 * sex: 1 表明為男性
	 * sex: 2 表明為女性
	 */
	int sex;
	
	public void study() {
		System.out.println("studying");
	}
	
	public void showAge() {
		System.out.println("age" + age);
	}
	
	public int addAge(int i) {
		age += i;
		return age;
	}
}
