package Day09_Class_java1;
/**
 * 可變個數形參的方法
 * 
 * 1. java 5.0新增的內容
 * 2. 具體使用：
 * 	  2.1 可變個數形參的格式：數據類型... 變量名 
 * 	  2.2 當調用可變個數形參的方法時，傳入的參數個數可以是：0個，1個，2個...
 * 	  2.3 可變個數形參的方法與本類中方法名相同，形參不同的方法之間構成重載
 * 	  2.4 可變個數形參的方法與本類中方法名相同，形參類型也相同的數組之間不構成重載。換句話說，二者不能共存。
 * 	  2.5 可變個數形參在方法的形參中，必須聲明在末尾
 * 	  2.6 可變個數形參在方法的形參中，最多只能聲明一個可變形參。
 * @author thomas
 */
public class MethodArgsTest {
	
	public static void main(String[] args) {
		
		MethodArgsTest test = new MethodArgsTest();
		test.show(12);
		test.show("hello");
		test.show("");
		
		test.show(new String[] {"aa","bb","cc"});
		
	}
	
	public void show(int i) {
		
	}
	
	public void show(String s) {
		System.out.println("show(String s)");
	}
	
	public void show(String ... strs) {
		System.out.println("show(String ... strs)");
		for(int i = 0; i < strs.length; i++) {
			System.out.println(strs[i]);
		}
	}
	
	// 這種跟可變動形參是一樣的...
	// 不能互存
//	public void show(String[] strs) {
//		
//	}
//	public void show(String...strings, int i) {
//		
//	}
}
