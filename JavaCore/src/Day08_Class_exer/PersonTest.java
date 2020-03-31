package Day08_Class_exer;

/*
 * 要求：
 * (1) 創建Person類的對象，設置該對象的name、age和sex屬性，調用study方法，
 * 輸出字串符“studying”，調用showAge()方法顯示age值
 * 調用addAge()方法給對象的age屬性值增加2歲
 * (2)創建第二個對象，執行上述操作，體會同一個類的不同對象的關係。
 */
public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.name = "Tom";
		p1.age = 18;
		p1.sex = 1;
		
		p1.study();
		
		p1.showAge(); 
		
		int newAge = p1.addAge(2);
		System.out.println(p1.name + " 的年齡為：" + newAge);
		
		System.out.println(p1.age); // 20
		
		//**************************
		Person p2 = new Person();
		p2.showAge(); // 0
		p2.addAge(20);
		p2.showAge(); // 20
		
	}
}
