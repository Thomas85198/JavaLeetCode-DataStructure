package Day09_Class_exer;

/*
 * 1. 編寫程序，定義三個重載方法並調用。方法名為mOL。
 * 	  三個方法分別接收一個int參數、兩個int參數、一個字符串參數。
 * 	  分別執行平行運算並輸出結果，相乘並輸出結果，輸出字串訊息。
 * 	  在主類的main()方法中分別用參數區別三個方法。
 * 
 * 2. 定義三個重載max()
 * 	  第一個方法求兩個int值中的最大值，
 *    第二個方法求兩個double值中的最大值，
 *    第三個方法求三個double值中的最大值，
 *    並分別調用三個方法
 * 
 */
public class OverloadExer {

	// 1. 如下三個方法都是構成重載
	public void mOL(int i) {
		System.out.println(i * i);
	}
	
	public void mOL(int a, int b) {
		System.out.println(a * b);
	}
	
	public void mOL(String str) {
		System.out.println(str);
	}
	
	// 2. 如下的三個方法構成重載
	public int max(int i, int j) {
		return (i>j)?i:j;
	}
	
	public double max(double i, double j) {
		return (i>j)?i:j;
	}
	
	public double max(double a, double b, double c) {
		double max = (a > b)?a:b;
		return (max>c)?max:c;
	}
	
	
	
}
