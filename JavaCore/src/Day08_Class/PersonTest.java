package Day08_Class;

/**
 *
 * 一、設計類，其實就是設計類的成員
 *
 * 屬性＝成員變量＝field＝域、字段 方法＝成員方法＝函數＝method
 *
 * 創建類的對象＝類的實例化＝實例化類
 * 
 * 二、類和對象的使用（面向對象思想落地的實現） 1. 創建類，設計類的成員 2. 創建類的對象 3. 通過”對象.屬性“或”對象.方法“調用對象的結構
 *
 * 三、如果創建一個類的多個對象，則每個對象都獨立擁有一套類的屬性。（非static的） 意味著：如果我們修改一個對象的屬性a，則不影響另一個對象屬性a的值。
 * 
 * 四、對象的內存解析：
 * 
 * @author thomas
 */
public class PersonTest {

	public static void main(String[] args) {

		// 2. 創建Person類的對象
		Person p1 = new Person();

		// 調用對象的結構：屬性、方法
		// 調用屬性：“對象.屬性”
		p1.name = "Tom";
		p1.isMale = true;
		System.out.println(p1.name);

		// 調用方法：“對象.方法”
		p1.eat();
		p1.sleep();
		p1.talk("Chinese");

		// ************************
		Person p2 = new Person();
		System.out.println(p2.name); // null
		System.out.println(p2.isMale); // false
		// ************************
		// 將p1變量保存的對象地址值賦給p3，導致p1和p3指向了堆空間中的同一個對象實體。
		Person p3 = p1;
		System.out.println(p3.name); // Tom
		
		p3.age = 10;
		System.out.println(p1.age); // 10

	}

}

// 1. 創建類
class Person {

	// 屬性
	String name;
	int age = 1;
	boolean isMale;

	// 方法
	public void eat() {
		System.out.println("人可以吃飯");
	}

	public void sleep() {
		System.out.println("人可以睡覺");
	}

	public void talk(String language) {
		System.out.println("人可以說話，使用的是：" + language);
	}

}
