package Day08_Class;

/**
 * 
 * 類中屬性的使用
 * 
 * 屬性（成員變量）vs 局部變量
 * 1. 相同點：
 * 		1.1 定義變量的格式：數據類型 變量名＝變量值
 * 		1.2 先聲明，後使用
 * 		1.3 變量都有其對應的作用域
 * 
 * 
 * 2. 不同點：
 * 		2.1 在類中聲明的位置的不同
 * 		屬性：直接定義在類的一對{}內
 * 		局部變量：聲明在法內、方法形參、代碼塊內、構造氣形參、構造氣內部的變量
 * 
 * 		2.2 關於全縣修飾符的不同
 * 		屬性：可以在聲明的屬性時，指名其權限，使用權限修飾符
 * 			 常用的權限修飾符：private、public、缺省、protected --> 封裝性
 * 			 目前，大家聲明屬性時，都使用缺省就可以了
 * 		局部變量：不可以使用權限修飾符
 * 
 * 		2.3 默認初始化值的情況：
 * 		屬性：類的屬性，根據其類型，都有默認初始化值
 * 			 整型（byte、short、int、long）：0
 * 			 浮點型（float、double）：0.0
 * 			 字符型（char）：0（或'\u0000'）
 * 			 布靈型（boolean）：false
 * 
 * 			 引用數據類型（類、數組、接口）：null
 * 
 * 		局部變量：沒有默認初始化值
 * 			意味著，我們在調用局部變量之前，一定要顯示賦值
 * 			特別地：形參在調用時，我們賦值即可。
 * 
 * 		2.4 在內存中加仔的位置：
 * 		屬性：加載到堆空間中（非static）
 * 		局部變量：加載到棧
 * 		
 * 
 * 
 * 			
 * @author thomas
 *
 */
public class UserTest {
	public static void main(String[] args) {
		User u1 = new User();
		System.out.println(u1.name);
		System.out.println(u1.age);
		System.out.println(u1.isMale);
		
		u1.talk("韓語");
		
		u1.eat();
	}
}

class User{
	// 屬性（或成員變量）
	String name;
	public int age;
	boolean isMale;
	
	public void talk(String language) { // language：形參，也是局部變量
		System.out.println("我們使用" + language + "進行交流");
	}
	
	public void eat() {
		String food = "烙餅"; // 局部變量，這個不能沒有賦值
		System.out.println("北方人喜歡吃：" + food);
	}
}