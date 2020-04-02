package Day12_Inheritence_java1;

public class Person {

	String name;
	int age;

	public Person() {

	}

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public void eat() {
		System.out.println("吃飯");
	}
	
	public void walk(int distance) {
		System.out.println("走路，走的距離：" + distance + "公里");
	}
	
	public Object obj() {
		return null;
	}
}
