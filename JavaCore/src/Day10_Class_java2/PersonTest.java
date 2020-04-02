package Day10_Class_java2;

/**
 * 
 * this關鍵字的使用
 * 1. this可以用來修飾：屬性、方法、構造器
 * 
 * 2. this修飾屬性和方法：
 * 	  this理解為：當前對象 或 當前正在創建的對象
 * 
 * 2.1 在類的方法中：我們可以使用"this.屬性"或"this.方法"的方式，調用當前對象屬性或方法。但是，
 * 	  通常情況下，我們都選擇省略“this.”。特殊情況下，如果方法的形參和類的屬性同名時，我們必須顯示
 * 	  的使用“this.變量”的方式，表明此變量是屬性，而非形參。
 * 
 * 2.2 在類的方法中：我們可以使用"this.屬性"或"this.方法"的方式，調用正在正在創建的對象屬性或方法。但是，
 * 	  通常情況下，我們都選擇省略“this.”。特殊情況下，如果方法的形參和類的屬性同名時，我們必須顯示
 * 	  的使用“this.變量”的方式，表明此變量是屬性，而非形參。
 * 
 * 3. this調用構造器
 *    1) 我們在類中構造器中，可以顯示的使用”this(形參列表）“的方式，調用本類中指定的其他構造器
 *    2) 構造器中不能通過”this(形參列表)”方式調用自己。
 *    3) 如果一個類中有n個構造器，則最多有n-1構造器中使用了“this（形參列表）”
 *    4) 規定：“this(形參列表)“必須聲明在當前構造器的首行
 *    5) 構造器內部，最多只能聲明一個“this(形參列表)“，用來調用其他的構造器
 * 
 * @author thomas
 *
 */
public class PersonTest {
	public static void main(String[] args) {

		Person p1 = new Person();
		
		p1.setAge(1);
		
		System.out.println(p1.getAge());
		p1.eat();
		
		Person p2 = new Person(30);
		
		System.out.println(p2.getAge());
		
	}
}

class Person {

	private String name;
	private int age;
	
	public Person() {
		this.eat();
		String info = "Person初始化時，需要考慮如下的1,2,3,4...（共40行代碼）";
		System.out.println(info);
	}
	
	public Person(String name, int age) {
		this(age); 
		this.name = name;
	}
	
	public Person(int age) {
		this();
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public void eat() {
		System.out.println("人吃飯");
		study();
	}
	
	public void study() {
		System.out.println("人學習");
	}

}
