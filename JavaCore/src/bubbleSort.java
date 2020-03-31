import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

		int[] a = { 8, 3, 1, 5, 7, 9, 100 };

		// 1) 沒 -1 也不會錯，就是最後一個跟自己比
		for (int i = 0; i < a.length; i++) {
			// 2) 舉例子：相鄰的兩個
			// i=0 比較arr.length - 1次
			// i=1 比較arr.length - 1 - i
			for (int j = 0; j < a.length - 1 - i; j++) {
				// 3) 如果右邊比左邊大，交換
				if (a[j] > a[j + 1]) {
					int temp;
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}

		}

		for(int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}

	}

}
