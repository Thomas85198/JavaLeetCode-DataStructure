package Day08_Class;

/**
 * 
 * 類中方法的聲明和使用
 * 
 * 方法：描述類應該具有的功能。 比如：Math類：sqrt()\random()\... Scanner類：nextXxx()...
 * Arrays類：sort()\binearySearch()\toString()\equals()\...
 * 
 * 1. 舉例：
 * public void eat() {}
 * public void sleep(int hour) {}
 * public String getName() {}
 * public String getNation() {}
 * 
 * 2. 方法的聲明：權限修飾符 返回值類型 方法名（形參類表）{
 * 			方法體
 * 
 * }
 * 		注意：static、final、abstract 來修飾的方法，後面再講。
 * 
 * 3. 說明：
 * 		3.1 關於權限修飾符：默認方法的權限修飾符先都使用 public 
 * 			Java 規定的4種全縣修飾符：private、public、缺省、protected --> 封裝性再細說
 * 
 * 		3.2 返回值類型：有返回值 vs 沒有返回值
 * 			3.2.1 如果方法有返回值，則必須再方法聲明時，指定返回值類型。同時，方法中，需要使用
 * 				  return關鍵字來返回指定類型的變量或常量：“return 數據”。
 * 				  如果方法沒有返回值，則方法聲明時，使用void表示。通常，沒有返回值的方法中，就不需要
 * 				  使用return。但是，如果使用的話，只能“return;”表示結束此方法的意思。
 *			3.2.2 我們定義方法該不該有返回值？
 *				  1) 題目要求
 *				  2) 憑經驗：具體問題具體分析
 *		3.3 方法名：屬於標示符，遵循標示符的規則和規範，“見名知意”
 *		3.4 形參列表：方法可以聲明0個，1個或多的形參
 *			3.4.1 格式：數據類型1 形參1，數據類型2 形參2,...
 *			3.4.2 我們定義方法時，該不該定義形參？
 *				  1) 題目要求
 *				  2) 憑經驗：具體問題具體分析
 *		3.5 方法體：方法功能的體現。
 *
 *	4. return關鍵字的使用：
 *		4.1. 使用範圍：使用在方法中
 *		4.2. 作用：1) 結束方法
 *				  2) 針對於有返回值類型的方法，使用“return 數據”方法返回所要的數據
 *		4.3. 注意點：return關鍵字後面不可以聲明執行語句。
 *	
 * 5. 方法的使用中，可以調用當前類的屬性或方法
 * 		特殊的：方法A中又調用方法A：遞歸方法。
 * 		方法中：不可以定義方法。
 *
 *
 *
 *
 * @author thomas
 * 
 */
public class CustomerTest {
	
	public static void main(String[] args) {
		Customer cust1 = new Customer();
		cust1.eat();
		
		cust1.sleep(8);
	}
	
	
	
	
}

// 客戶類
class Customer {

	// 屬性
	String name;
	int age;
	boolean isMale;
	
	// 方法
	public void eat() {
		System.out.println("客戶吃飯");
		return; // return後就結束了
	}
	
	public void sleep(int hour) {
		System.out.println("休息了" + hour + "個小時");
	}
	
	public String getName() {
		if(age > 18) {
			return name;
		}
		return "Tom";
	}
	
	public String getNation(String nation) {
		String info = "我的國籍是：" + nation;
		return info;
	}
	
}