package Day09_Class_java1;

public class ArrayPrintTEst {
	public static void main(String[] args) {
		int[] arr = new int[]{1,2,3};
		System.out.println(arr); // 地址值
		
		char[] arr1 = new char[]{'a','b','c'};
		System.out.println(arr1); // abc，因為println是真的有一個char[]的overload
		
	}
}
