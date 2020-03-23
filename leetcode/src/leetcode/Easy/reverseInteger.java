package leetcode.Easy;

public class reverseInteger {

	public static void main(String[] args) {
		
		reverseInteger obj = new reverseInteger();
		obj.reverse(-321);
		System.out.println(obj.reverse(-321));
		System.out.println(obj.reverse(1534236469));
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);

	}
	
	public int reverse(int x) {
		
		// 1) 宣告一個 num 存 result
		long result = 0;
		// 2) 當除以 10 不等於 0 則代表還有十位以上
		while(x != 0) {
			// 3) 先處理個位數
			int digit = x%10;
			/*
			 * 個位數 1234...
			 * 1.1 4 + 0 = 4
			 * 1.2 40 + 3 = 43
			 * 1.3 430 + 2 = 432
			 * 1.4 4320 + 1 = 4320
			 */
			result = (long)result*10+(long)digit;
			// 4) 砍掉一位
			x=x/10;
		}
		
		// 5) 如果溢出
		if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
			return 0;
		}
		
		
		
		return (int)result;
		
	}

}

