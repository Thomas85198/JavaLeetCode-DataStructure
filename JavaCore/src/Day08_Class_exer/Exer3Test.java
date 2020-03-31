package Day08_Class_exer;
/*
 * 
 * 
 * 3.1 編寫程序，聲明一個method方法，在方法中打印一個10*8的*矩形，在main方法中調用方法。
 * 3.2 修改上一個程序，在method方法中，除打印一個10*8的*型矩形外，在計算該矩形的面積。
 * 並將其作為方法返回值。在main方法中調用該方法，接受返回的面積值並打印。
 * 
 * 3.3 修改上一個程序，在method方法提供m和n兩個參數，方法中打印一個m*n的*型矩形，
 * 並計算該矩形的面積，將其作為法返回值。在main方法中調用該方法，接收返回的面積並打印。
 * 
 * 
 */
public class Exer3Test {
	public static void main(String[] args) {
		Exer3Test test = new Exer3Test();
		
		// 3.1
		// test.method();
		
		// 3.2
		// 方式一
//		int area = test.method();
//		System.out.println("面積為: " + area);
		
		// 方式二
//		System.out.println(test.method());
		
		// 3.3
		int area = test.method(12, 10);
		System.out.println("面積為: " + area);
	}
	// 3.1
//	public void method() {
//		for(int i=0; i< 10; i++) {
//			for(int j=0; j< 8; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//	}
	
	// 3.2
//	public int method() {
//		for(int i=0; i< 10; i++) {
//			for(int j=0; j< 8; j++) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
//		
//		return 10 * 8;
//	}
	
	// 3.3
	public int method(int m, int n) {
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		return m * n;
	}
}
