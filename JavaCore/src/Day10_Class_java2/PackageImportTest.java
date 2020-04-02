package Day10_Class_java2;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;

import Day10_Class_exer4.Bank;

import static java.lang.System.*;
import static java.lang.Math.*;

/**
 * 
 * 
 * ㄧ、package關鍵字的使用
 * 1. 為了更好地實現項目中類的管理，提供包的概念
 * 2. 使用package聲明類或街口所屬的包，聲明在原文件的首行
 * 3. 包，屬於標示符，諄巡標示符的命名規則、規範（xxxyyyzzz）、“見名知意”
 * 4. 每“.”一次，就代表一層文件目錄
 * 
 * 補充：同一個包下，不能夠命名同名的接口、類。
 * 		不同的包下，可以命名同名的接口、類。
 * 
 * 二、import關鍵字的使用
 * import：導入
 * 1. 在原文件中顯示的使用import結構導入指定包下的類、接口
 * 2. 聲明在包的聲明和類的聲明之間
 * 3. 如果要導入多個結構，則並列寫出即可
 * 4. 可以使用"xxx.*"的方式，表示可以導入xxx的包下所有結構
 * 5. 如果使用的類或接口是java.lang包下定義的，則可以省略import結構
 * 6. 如果使用的類或接口是本包下定義的，則可以省略import結構
 * 7. 如果在原文件中，使用了不同包下的同類名稱，則必須至少有一個類需要以全類名的方式顯示
 * 8. 如果使用"xxx.*"方式表明可以調用xxx包下的所有結構。但是如果使用是xxx子包的結構，則仍然需要顯示
 * 
 * 9. import static: 導入指定類或接口中的靜態結構：屬性或方法。
 * 
 * 
 * @author thomas
 *
 *
 *
 */
public class PackageImportTest {
	public static void main(String[] args) {
		String info = Arrays.toString(new int[]{1,2,3,4});
		
		// Bank bank = new Bank();
		
		ArrayList list = new ArrayList();
		HashMap map = new HashMap();
		
		Scanner s = null;
		
		System.out.println("hello!");
		
		Person p = new Person();
		// 全類名的方式顯示
		// Day10_Class_java3.Account acct1 = new Day10_Class_java3.Account();
		
		Date r = new Date();
		java.sql.Date date1 = new java.sql.Date(52333333L);
		
		Dog dog = new Dog();
		
		Field field = null;
		
		out.println("hello");
		
		Math.round(1234.56);
		
	
		
		
	}
}
