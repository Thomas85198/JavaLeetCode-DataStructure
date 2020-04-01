package Day10_Class;

/**
 * 
 * 
 * 面向對象的特徵一：封裝與隱藏
 * 一、問題的引入：
 * 	  當我們創建一個類的對象以後，我們可以通過”對象.屬性”的方式，對對象的屬性進行賦值。這裡，賦值操作要受到
 * 	  屬性的數據類型和存儲範圍的制約。除此之外，沒有其他制約條件。但是，在實際問題中，我們往往需要給屬性賦值
 * 	  加入額外的限制條件。這個條件就不能再屬性聲明時體現，我們只能通過方法去進行限制條件的添加。（比如：setLengths)
 * 	  同時，我們需要避免用戶再使用“對象.屬性”的方式對屬性進行賦值。則需要將屬性聲明為私有的(private)
 * 	  -->此時，針對屬性就體現了封裝性。
 * 
 * 二、封裝性的體現：
 * 我們將類的屬性私有化(private)，同時，提供公共的(public)方法來獲取(getXxx)和設置(setXxx)此屬性的值
 * 
 * 	拓展：封裝性的體現：1) 如上 2) 不對外暴露的私朽的方法 3) 單例模式 ...
 * 
 * 三、封裝性的體現，需要權限修飾符來配合。
 * 1) Java 規定的4種權限（從小到大排列）：private、缺省、protected、public 
 * 2) 4種權限可以用來修飾類及類的內部結構：屬性，方法，構造器，內部類
 * 3) 具體的，4種權限都可以用來修飾類的內部結構：屬性，方法，構造器，內部類
 * 			修飾類的話，只能使用:缺省、public
 * 
 * 總結封裝性：Java提供了4種全縣修飾符來修飾類及類的內部結構，體現類及類的內部結構在被調用時可見性的大小。
 * @author thomas
 *
 *
 *
 */
public class AnimalTest {
	public static void main(String[] args) {
		Animal a = new Animal();
		a.name = "大黃";
		// a.age = 1;
		// a.legs = 4; // The field Animal.legs is not visible
		
		a.show();
		
		a.setLegs(-6);
		// a.legs = -4;
		
		a.show();
		
		System.out.println(a.name);
	}
}

class Animal{
	
	String name;
	private int age;
	private int legs; // 腿的個數
	
	// 對屬性的設置
	// 為了增加邏輯判斷腿個數
	public void setLegs(int l) {
		if(l >= 0 && l%2 == 0) {
			legs = l;
		}else {
			legs = 0;
			// 拋出一個異常（暫時還沒講）
		}
	}
	
	// 對屬性的獲取
	public int getLegs() {
		return legs;
	}
	
	public void eat() {
		System.out.println("動物進食");
	}
	
	public void show() {
		System.out.println("name = " + name + ",age = " + age +  ",slegs = " + legs );
	}
	
	// 提供關於屬性age的get和set方法
	public int getAge() {
		return age;
	}
	
	public void setage(int a) {
		age = a;
	}
}