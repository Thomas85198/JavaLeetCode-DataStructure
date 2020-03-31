package Day09_Class_java1;
/**
 * 
 * 
 * 關於變量的賦值
 * 
 * 	如果變量是基本數據類型，此時賦值的是變量所保存的數據值。
 * 	如果變量是引用數據類型，此時賦值的是變量所保存的數據的地址值。
 * 
 * 
 * 
 * @author thomas
 *
 */
public class ValueTransferTest {

	public static void main(String[] args) {
		
		System.out.println("************基本數據類型：**********");
		
		int m = 10;
		int n = m;
		
		System.out.println("m = " + m + ", n = " + n);
		
		n = 20;
		
		System.out.println("m = " + m + ", n = " + n);
		
		System.out.println("************引用數據類型：********");
		
		Order o1 = new Order();
		
		o1.orderId = 1001;
		
		Order o2 = o1; // 賦值以後，o1和o2的地址值相同，都指向了堆空間中同一個對象實體。
		
		System.out.println("o1.orderId = " + o1.orderId + ", o2.orderId = " + o2.orderId);
		
		o2.orderId = 1002;
		
		System.out.println("o1.orderId = " + o1.orderId + ", o2.orderId = " + o2.orderId);
		
	}
}

class Order{
	
	int orderId;
	
	
	
}