package Day10_Class_exer;
/*
 * 
 * 
 * 1.創建程序，在其中定義兩個類：Person和PersonTest類。定義如下：
 * 用setAge()設置人的合法年齡(0~130)，用getAge()返回人的年齡。
 * 
 * 在PersonTest類中實例化Person類中對象b，調用setAge()方法，體會Java的封裝性
 * 
 * 2.練習2：
 * 2.1. 在前面定義的Person類中添加構造器，利用構造器設置所有的age屬性初始值都為18。
 * 2.2. 修改上提的類和構造器，增加name屬性，使得每次創建Person對象的同時初始化對象的age屬性值和name屬性值
 * 
 */
public class Person {

	private int age;
	private String name;
	
	public Person() {
		age = 18;
	}
	
	public Person(String n, int a) {
		name = n;
		age = a;
	}
	
	public void setAge(int a) {
		if(a < 0 || a > 130) {
			// throw new RuntimeException("傳入的數據非法!）;
			System.out.println("傳入的數據非法!");
			return;
		}
		
		age = a;
	}
	
	public int getAge() {
		return age;
	}
	
	// 絕對不要這樣用
//	public int doAge(int a) {
//		age = a;
//		return age;
//	}
	
	public void setName(String n) {
		name = n;
	}
	public String getName(){
		return name;
	}
	
}
