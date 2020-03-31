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
 * 如果參數是引用數據類型，此時實參賦給形參的事實參存儲數據的地址值。
 * 
 * 
 * @author thomas
 *
 */
public class ValueTransferTest2 {

	public static void main(String[] args) {
		
		Data data = new Data();
		
		data.m = 10;
		data.n = 20;
		
		System.out.println("m = " + data.m + ", n = " + data.n );
		
		// 交換 m 與 n 的值
//		int temp = data.m;
//		data.m = data.n;
//		data.n = temp;
		
		ValueTransferTest2 test = new ValueTransferTest2();
		test.swap(data);
		
		System.out.println("m = " + data.m + ", n = " + data.n );
		
	}
	
	
	public void swap(Data data) {
		int temp = data.m;
		data.m = data.n;
		data.n = temp;
	}
	
}

class Data{
	int m;
	int n;
}
