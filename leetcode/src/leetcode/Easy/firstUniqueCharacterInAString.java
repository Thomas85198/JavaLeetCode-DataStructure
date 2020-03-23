package leetcode.Easy;

import java.util.HashMap;

/**
 * 目的：找出第一個出現數字的索引值
 * @author chienlin
 *
 */
public class firstUniqueCharacterInAString {

	public static void main(String[] args) {
		String s = "leetcode";

		firstUniqueCharacterInAString obj = new firstUniqueCharacterInAString();
		System.out.println(obj.firstUniqChar(s));
	}
	
	public int firstUniqChar(String s) {
		
		// 1) 用 HashMap 一邊存 Character 一邊存次數 Integer
		HashMap<Character, Integer> count = new HashMap<Character, Integer>();
		
		
		// 2) 跑一次並計算
		// 2.1 getOrDefault()這個...
		for(int i=0; i < s.length(); i++) {
			char temp = s.charAt(i);
			count.put(temp, count.getOrDefault(temp, 0) +1);
		}
		
		System.out.println(count);
		
		// 3) 開始要找看哪個是唯一的
		for(int i=0; i< s.length(); i++) {
			if(count.get(s.charAt(i)) == 1) {
				return i;
			}
		}
	
		
		return -1;
		
	}

}
