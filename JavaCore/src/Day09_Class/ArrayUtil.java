package Day09_Class;

/**
 * 自定義數組的工具類
 * 
 * @author thomas
 *
 */
public class ArrayUtil {

	
	// 求數組的最大值
	public int getMax(int[] arr) {
		int maxValue = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (maxValue < arr[i]) {
				maxValue = arr[i];
			}
		}
		return maxValue;
	}

	// 求數組的最小值
	public int getMin(int[] arr) {
		int minValue = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (minValue > arr[i]) {
				minValue = arr[i];
			}
		}
		return minValue;
	}

	// 求數組的總和
	public int getSum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}

	// 求數組的平均值
	public int getAvg(int[] arr) {

		return getSum(arr) / arr.length;
	}
	
	// 如下的兩個同名方法構成了重載
	// 反轉數組
	public void reverse(int[] arr) {
		for (int i = 0; i < arr.length / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}
	}
	
	public void reverse(String[] arr) {
		
	}

	// 複製數組
	public int[] copy(int[] arr) {
		int[] arr1 = new int[arr.length];
		for (int i = 0; i < arr1.length; i++) {
			arr1[i] = arr[i];
		}
		return arr1;
	}

	// 數組排序
	public void sort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
					// 錯誤的，因為這樣方法跑完外面還是沒變
					// swap(arr[j], arr[j+1]);
					
					swap(arr, j, j+1);
				}
			}
		}
	}
	
	// 錯誤的：交換數組中指定兩個位置元素的值
	// 交換數組中指定兩個位置元素的值
//	public void swap(int i, int j) {
//		int temp = i;
//		i = j;
//		j = temp;
//	}

	// 正確的：交換數組中指定兩個位置元素的值
	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	

	// 遍歷數組
	public void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println("");
	}

	// 查找指定元素
	public int getIntex(int[] arr, int dest) {
		// 線性查找
		for(int i=0; i<arr.length; i++) {
			if(dest == arr[i]) {
				return i;
			}
		}
		
		return -1; // 返回一個負數，表示沒有找到
	}

}
