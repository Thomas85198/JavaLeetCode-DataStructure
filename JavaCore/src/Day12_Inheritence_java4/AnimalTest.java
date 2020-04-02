package Day12_Inheritence_java4;

import java.sql.Connection;

// 多態性的使用舉例一：
public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.func(new Animal());
		test.func(new Cat());
		
	}
	public void func(Animal animal) { // 聲明是Animal animal = new Dog()
		System.out.println(animal);
	}
	// 如果沒有多態性
	public void func(Dog dog) {
		dog.eat();
		dog.shout();
	}
	public void func(Cat cat) {
		cat.eat();
		cat.shout();
	}
}

class Animal{
	
	public void eat() {
		System.out.println("動物：進食");
	}
	
	public void shout() {
		System.out.println("動物：叫");
	}
}

class Dog extends Animal{
	public void eat() {
		System.out.println("狗吃骨頭");
	}
	public void shout() {
		System.out.println("旺旺旺");
	}
}

class Cat extends Animal{
	public void eat() {
		System.out.println("貓吃魚");
	}
	public void shout() {
		System.out.println("貓貓貓");
	}
}

// 舉例二：

class Order{
	
	public void method(Object obj) {
		
	}
}

// 舉例三：
class Driver{
	
	public void doData(Connection conn) { // 父類 conn = new MySQLConnection()
		// 規範的步驟去操作數據
		
	}
}
