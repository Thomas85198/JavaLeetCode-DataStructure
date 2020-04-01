package Day09_Class_java2;

/**
 * 
 * 遞歸方法的使用（了解）
 * 1. 遞歸方法：一個方法體內調用它自身
 * 2. 方法遞歸包含了一種隱式的循環，重複執行某段代碼，但這種重複執行無需循環控制。
 * 遞歸一定要向自己知方向遞歸，否則這種遞歸就變成了無窮遞歸，類斯於死循環
 * 
 * @author thomas
 *
 */
public class RecursionTest {

	public static void main(String[] args) {
		
		// 例 1：計算1-100之間所有自然數的和
		// 方式一：
//		int sum = 0;
//		for(int i = 0; i<= 100; i++) {
//			sum+=i;
//		}
		// 方式二：	
		RecursionTest test = new RecursionTest();
		int sum1 = test.getSum(100);
		System.out.println(sum1);
		
		System.out.println("******************");
		int value = test.f(10);
		System.out.println(value);
		System.out.println("*******************");
		System.out.println(test.Fibonacci(5));
	}
	// 例1：計算1-n之間所有自然數的和
	public int getSum(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n + getSum(n-1);
		}
	}
	// 例2：計算1-n之間所有自然數的成績，n的階層，n!
	public int getSum1(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n * getSum1(n-1);
		}
	}
	
	// 例3：已知有一個數列：f(0) = 1, f(1) = 4, f(n+2)=2*f(n+1) + f(n),
	// 其中n是大於0的整數，求f(10)的值
	public int f(int n) {
		if(n == 0) {
			return 1;
		}else if(n == 1) {
			return 4;
		}else {
			// return f(n + 2) - 2 * f(n + 1); 這會發生StackOverflow
			return 2*f(n-1) + f(n-2);
		}
	}
	
	// 例4：費波納希數列
	public int Fibonacci(int n) {
		if(n == 0 || n == 1) {
			return 1;
		}else {
			return Fibonacci(n-1) + Fibonacci(n-2); 
		}
	}
	
	// 例5：盒內塔問題
	
	// 例6：快排
}
