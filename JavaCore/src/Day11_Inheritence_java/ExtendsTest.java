package Day11_Inheritence_java;
/**
 * 
 * 
 * 面向對象的特徵之二：繼承性 why?
 * 
 * 一、繼承性的好處：
 * 1) 減少了代碼的冗余，提高了代碼的復用性
 * 2) 便於功能的擴展
 * 3) 為了多態性的使用，提供了前提
 * 
 * 二、繼承性的格式：class A extends B{}
 * 	  A：子類、派生類、subclass
 * 	  B：父類、超類、基類、superclass
 *    
 *    2.1 體現：一旦子類A繼承父類B以後，子類A終究獲取了父類B中聲明的所有的屬性、方法。
 *    	特別的，賦類中聲明為private的屬性或方法，子類繼承賦類之後，仍然認為獲取了賦類中私有的結構
 *    只是因為封裝性的影響，使得子類不能直接調用賦類的結構而已。
 * 	  2.2 子類繼承父類之後，還可以聲明自己特有的屬性或方法：實現功能的拓展。
 * 	  子類和父類的關係，不同於子集合和集合的關係。
 * 	  
 * 三、Java中關於繼承性的規定：
 * 	  1. 一個類可以被多個子類繼承。
 *    2. Java中類的單繼承性：一個類只能有一個父類
 *    3. 子賦類是相對的繼承。
 *    4. 子類直接繼承的父類，成為：直接父類。間接繼承的父類稱為：間接父類
 *	  5. 子類繼承父類之後，就獲取了直接賦類以及所有間接賦類中聲明的屬性和方法。
 * 
 * 四、 
 *     1. 如果我們沒有顯示的聲明一個類的父類的話，則此類繼承於java.lang.Object類
 *     2. 所有java類(除java.lang.Object類之外)都直接或間接的繼承於Java.lang.Object類
 *     3. 意味著，所有的java類都具有java.lang.Object類聲明的功能。
 * 
 * @author thomas
 *
 */
public class ExtendsTest {
	public static void main(String[] args) {
		
		Person p1 = new Person();
//		p1.age = 1;
		p1.eat();
		System.out.println("**************");
		
		Student s1 = new Student();
		s1.eat();
//		s1.sleep();
		s1.name = "Tom";
		s1.setAge(10);
		System.out.println(s1.getAge());
		s1.name = "Thomas";
		
		Creature c1 = new Creature();
		System.out.println(c1.toString());
		
		
	}
}
