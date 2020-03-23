package com.luchienlin.algorithm;

public class ArrayTotal {

	public static void main(String[] args) {
		// sum
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		System.out.println(ArrayTotal.sum(arr, 5));
		
		// add
		int[][] arr1 = {{5,6},{7,8}};
		int[][] arr2 = {{2,3},{3,4}};
		int[][] arr3 = {{7,9},{10,12}};
		ArrayTotal.add(arr1, arr2, arr3, 10);
	}
	
	/*
	 * 目的：陣列總和
	 * 執行次數 2n+3 次
	 */
	public static int sum(int arr[], int n) {
		
		// 1) 設定變數
		int i, total=0; // 執行 1 次
		
		// 2) for 迴圈算總和
		for(i=0; i<n; i++) { // 執行 n+1 次 發現 n = 5 時發現超過跳出
			total += arr[i]; // 執行 n 次 因為 n = 5 不會進去
		}
		
		// return 
		return total; // 執行 1 次
		
	}
	
	public static void add(int a[][], int b[][], int c[][], int n) {
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
	}

}
