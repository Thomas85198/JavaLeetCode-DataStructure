package leetcode.Easy;

/**
 * 目的：回轉數驗證
 * @author chienlin
 *
 */
public class isPalindrome {

	public static void main(String[] args) {
		
		isPalindrome obj = new isPalindrome();
		System.out.println(obj.isPalindrome(-121));
		System.out.println(20);

	}

	public boolean isPalindrome(int x) {
		
		long result = 0;
		long temp = 0;
		temp = x;
		while(temp != 0) {
			// 先算個位數
			int digit = (int) (temp % 10);
			// 加起來
			result = result*10 + digit;
			// 少一位
			temp = temp / 10;
		}
		
		System.out.println(result);
		System.out.println(x);
		
		// 如果為負的，怎麼樣都是錯的
		if(result < 0) {
			return false;
		}else if((int)result == x) {
			return true;
		}
		return false;	
	}
}
