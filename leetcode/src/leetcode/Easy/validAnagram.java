package leetcode.Easy;

import java.util.Arrays;

/**
 * 目的：判斷是否字元都相等
 * @author chienlin
 *
 */
public class validAnagram {

	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		
		String a = "rat";
		String b = "car";
		
		Boolean r = validAnagram.isAnagram(s, t);
		Boolean v = validAnagram.isAnagram(a, b); 
		
		System.out.println(r);
		
		System.out.println(v);
		

	}
	
	public static boolean isAnagram(String s, String t) {
		
		// 0) 如果空白直接對
		if(s.equals("")&&t.equals("")) {
			return true;
		}
		
		
		// 1) 先轉成字串陣列
		char[] arrayS = s.toCharArray();
		char[] arrayT = t.toCharArray();
		

		
		// 2) 先判斷長度：如果長度不一樣直接false
		if(arrayS.length != arrayT.length)
		{
			return false;
		}
	
		
		
		for(int i=0; i<arrayS.length; i++) {
			// 3) 用 array.sort 由小排到大
			Arrays.sort(arrayS);
			Arrays.sort(arrayT);
			// 4) 比較
			if(arrayS[i] != arrayT[i]) {
				System.out.println("字串不相等");
				return false;
			}
		}
		
			
			
	System.out.println("字串相等");
	
			
	

		return true;
	}
	
	

}
