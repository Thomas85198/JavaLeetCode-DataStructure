package Day10_Class;

public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "大黃";
		a.age = 1;
		a.legs = 4;
		
		a.show();
		
		a.legs = -4;
		a.show();
	}
}

class Animal{
	
	String name;
	int age;
	int legs; // 腿的個數
	
	public void eat() {
		System.out.println("動物進食");
	}
	
	public void show() {
		System.out.println("name = " + name + ",age = " + age +  ",slegs = " + legs );
	}
}