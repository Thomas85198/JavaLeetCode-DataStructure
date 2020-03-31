package Day09_Class_java1;
/**
 * 方法的重載（overload) loading...
 * 
 * 1. 定義：在同一類中，允許存在一個以上的同名方法，只要他們的參數個數或參數類型不同即可。
 * 
 * 		   ”兩同一不同“：同一個類、相同方法名
 * 					   參數列表不同：參數個數不同，參數類型不同
 * 2. 舉例：
 * 	  Arrays類中重載的sort() / binarySearch()
 * 
 * 3. 判斷是否是重載：
 * 	  跟方法的權限修飾符、返回值類型、形參變量體、方法體都沒有關係。
 * 
 * 4. 再通過對象調用方法時，如何確定某一個指定的方法：
 * 	  方法名 ---> 參數列表
 * @author thomas
 *
 */
public class OverloadTest {
	public static void main(String[] args) {
		OverloadTest test = new OverloadTest();
		test.getSum(1, 2);
	}
	// 如下的4個方法構成了重載
	public void getSum(int i, int j) {
		System.out.println(i + j);
	}
	
	public void getSum(double d1, double d2) {
		System.out.println("1");
	}
	
	public void getSum(String s, int i) {
		System.out.println("2");
	}
	
	public void getSum(int i, String s) {
		System.out.println("3");
	}
	
//	public int getSum(int i, int j) {
//		return 0;
//	}
	
//	public void getSum(int m, int n) {
//		
//	}
	
//	private void getSum(int i, int j) {
//		
//	}
}
