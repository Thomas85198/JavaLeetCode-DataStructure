package Day09_Class_java1;

/**
 * 
 * 方法的形參的傳遞機制：值傳遞
 * 
 * 1. 形參：方法定義時，聲明小括弧內的參數
 *    實參：方法調用時，實際傳遞給形參的數據
 * 
 * 2. 值傳遞機制：
 * 如果參數是基本數據類型，此時實參賦給形參的是實參真實存儲的數據值。
 * 
 * 
 * 
 * @author thomas
 *
 */
public class ValueTransferTest1 {
	public static void main(String[] args) {
		// 交換兩個變量的值的操作
		int m = 10;
		int n = 20;
		System.out.println("m = " + m + ", n = " + n);
		// 交換兩個變量的值的操作
//		int temp = m;
//		m = n;
//		n = temp;
		
		ValueTransferTest1 test = new ValueTransferTest1();
		test.swap(m, n);
		System.out.println("m = " + m + ", n = " + n); // m 與 n 在上面方法執行完就銷毀了，所以這個printout不會換
	}
	
	public void swap(int m, int n) {
		int temp = m;
		m = n;
		n = temp;
		
	}
	
	
}
