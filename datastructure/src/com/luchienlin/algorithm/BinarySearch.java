package com.luchienlin.algorithm;

/**
 * 目的：實踐二元搜尋法（Binary Search)
 * 時間複雜度：O(log₂n)
 * @author chienlin
 *
 */
public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = { 1, 4, 5, 6, 8, 10 };
		BinarySearch.binsrch(arr, arr.length-1, 8, 2);
	}

	/**
	 * 
	 * @param A：查詢的陣列
	 * @param n：陣列最末位索引值
	 * @param x：目標數字
	 * @param j：結果索引值
	 */
	public static void binsrch(int A[], int n, int x, int j) {
		// 1) 先訂定一個 lower 的索引值
		int lower = 1;
		// 2) 再訂一個 upper 的索引值和中間值
		int upper = A.length - 1, mid;

		// 3) 只要符合 lower <= upper 則繼續
		while (lower <= upper) {
			// 4) 因為有排序先砍半
			mid = (lower + upper) / 2;
			/*
			 * 5) 做判斷 
			 * 	5.1 如果 x > mid，則數字在右邊 lower = mid + 1; 
			 * 	5.2 如果 x < mid，則數字在左邊 upper = mid - 1; 
			 *  5.3 如果 x = mid，則為答案
			 */
			if (x > A[mid]) {
				lower = mid + 1;
			} else if (x < A[mid]) {
				upper = mid - 1;
			} else {
				j = mid;
				System.out.println("找到答案，" + x + "是在第" + mid + "個位置");
				break;
			}

		}

	}

}
