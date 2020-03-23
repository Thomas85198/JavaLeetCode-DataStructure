package com.luchienlin.algorithm;

public class loopCount {

	public static void main(String[] args) {
	
		int i, k = 0, count = 0;
		for(i = 1; i<=99; i++) {
			count = 0;
			k=i+1;
			do {
				count++;
				System.out.printf("i=%d, count=%d\n", i, count);
			}while(k++<=99);
		}

	}

}
