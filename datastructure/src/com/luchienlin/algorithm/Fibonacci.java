package com.luchienlin.algorithm;

/**
 * 目的：遞迴方式實作費氏數列，遞回與非遞回方式
 * @author chienlin
 *
 */
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 遞回方式
	public static int Fibonacci(int n) {
		// 1) 因為 n 要 >= 2，所以 n = 0 與 1 都直接 return
		if (n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			// 2) 2以上 n-1 位 + n-2 位
			return(Fibonacci(n-1) + Fibonacci(n-2));
		}
	}
	
	public static int Fibonacci2(int n) {
		
		int prev1, prev2, item = 0, i;
		// 1) 因為 n 要 >= 2，所以 n = 0 與 1 都直接 return
		if (n == 0) {
			return 0;
		}else if(n == 1) {
			return 1;
		}else {
			prev2 = 0;
			prev1 = 1;
			for(i = 2; i <= n; i++) {
				// 一樣維持前一位加後一位
				item = prev1 + prev2;
				prev2 = prev1;
				prev1 = item;
			}
			
			return item;
		}
		
		
		
		
		
		
	}
}
