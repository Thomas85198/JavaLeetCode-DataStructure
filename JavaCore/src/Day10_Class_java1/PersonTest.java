package Day10_Class_java1;

/**
 * 
 * 類的結構之三：構造氣（或構造方法、constructor）的使用
 * constructor：建設、建造。construction：CCB constructor：建設者
 * 
 * 一、構造器的作用：
 * 1. 創建對象
 * 2. 初始化對象的屬性
 * 
 * 二、說明：
 * 1. 如果沒有顯示的定義類的構造器的話，則系統默認提供一個空參的構造器
 * 2. 定義構造器的格式：權限修飾符 類名(形參列表){}
 * 3. 一個類中定義的多個構造器，彼此構成了重載
 * 4. 一旦我們顯示的定義了類的構造器之後，系統就不再提供默認的空參構造器
 * 5. 一個類中，至少會有一個構造器。
 * 
 * @author thomas
 *
 */
public class PersonTest {

	public static void main(String[] args) {
		// 創建類的對象：new + 構造器
		Person p = new Person();
		p.eat();
		Person p1 = new Person("Tom");
		p1.study();
		System.out.println(p1.name);
	}
}

class Person{
	// 屬性
	String name;
	int age;
	// 構造器
	public Person() {
		System.out.println("Person()....");
	}
	
	public Person(String n) {
		name = n;
	}
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public void eat() {
		System.out.println("人吃飯");
	}
	
	public void study() {
		System.out.println("人可以學習");
	}
	
}