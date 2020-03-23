package leetcode.Easy;

/**
 * 目的：判斷反轉是否字元都還是相等
 * @author chienlin
 *
 */
public class validPalindrome {

	public static void main(String[] args) {
		 
		String s = "A man, a plan, a canal: Panama";
//		String stri4=s.replaceAll("[\\pP\\p{Punct}]","");
//		System.out.println(stri4);
		
		boolean a = validPalindrome.isPalindrome(s);
		System.out.println(a);
		
		
		
	}
	
	public static boolean isPalindrome(String s) {
		
		
		
		StringBuffer sb = new StringBuffer(s);
		sb.reverse();
		
		int count = 0;
		for(int i = 0; i< s.length(); i++) {
			if(s.charAt(i) == sb.charAt(i)) {
				count++;
			}
		}
		
		System.out.println(sb);
		if(count == s.length()) {
			return true;
		}
		
		
		
		return false;
		
	}
	
	

}
