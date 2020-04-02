package Day12_Inheritence_java4;

/**
 * 面向對象特徵多態性：
 * 1. 理解多態性：可以理解為一個事物的多種型態。
 * 2. 何為多態性：
 * 	  對象的多態性：父類的引用指向子類的對象（或子類的對象賦給父類引用）
 * 
 * 
 * 3. 多態的使用：虛擬方法的調用
 * 	  有了對象的多態性以後，我們在編譯期，只能調用父類中聲明的方法，但在執行期，我們實際執行的是子類重寫父類的方法。
 * 	  總結：編譯：看左邊，運行：看右邊
 * 
 * 4. 多態性的使用前提：1) 要有類的繼承關係 2) 要有方法的重寫
 * 
 * 5. 對象的多態性，只適用於方法，不適用於屬性（編譯和運行都看左邊）
 * 
 * @author thomas
 *
 */
public class PersonTest {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.eat();
		
		Man man = new Man();
		man.eat();
		man.age = 25;
		man.earnMoney();
		// ********************************
		// 對象的多態性：父類引用指向子類的對象
		Person p2 = new Man();
		p2.eat(); // 調的是子類重寫父類的方法
		p2.walk(); // 多態的使用：調用子父類同名同參數的方法時，實際執行的是子類重寫父類的方法---虛擬方法調用
		System.out.println(p2.id); // 1001
		Person p3 = new Woman();
		
		
		
	}
}
