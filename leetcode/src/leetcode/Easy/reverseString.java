package leetcode.Easy;

/**
 * 目的：將字串反轉
 * 解析：利用 二元搜尋法的方式思考，設定最左邊為 left 最右邊為 right 
 * 		1) 兩數前進才互換
 * 		2) 直到撞再一起為止
 * @author chienlin
 *
 */
public class reverseString {

	public static void main(String[] args) {
		char[] a = {'h','e','l','l','o'};
		reverseString obj = new reverseString();
		obj.reverseString(a);

	}

	public void reverseString(char[] s) {
		
		// 1) 設定一個 left right 
		int left = 0; 
		int right = s.length - 1;
		int length = s.length;
		
		// 2) 判斷都要符合 right > left 
		// 2.1 用索引值去轉
		while(left < right) {
			
			char temp;
			temp = s[left];
			s[left] = s[right];
			s[right] = temp;
			
			// 3) left++，right--
			left++;
			right--;
			
			
		}
				
		System.out.println(s);
		
	}

}
