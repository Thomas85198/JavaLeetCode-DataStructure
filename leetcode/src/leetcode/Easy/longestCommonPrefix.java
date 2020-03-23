package leetcode.Easy;

import java.util.ArrayList;

/**
 * 目的：找出前綴一樣的部分
 * @author chienlin
 *
 */
public class longestCommonPrefix {

	public static void main(String[] args) {
			
		String[] strs = {"flower", "flow", "flight"};
		longestCommonPrefix obj1 = new longestCommonPrefix();
		obj1.longestCommonPrefix(strs);

	}
	
	public String longestCommonPrefix(String[] strs) {
		
		// 1) 先判斷 字串是否為 空 或是 null
		if(strs == null || strs.length == 0) {
			return "";
		};
		
		// 2) 設一個字串預設為 索引值 0
		String pre = strs[0];
		// 3) 索引值從 1 開始判斷 如果有就擷取字串
		int i = 1;
		// 4) indexOf... 返回相同字串如果沒有則回傳 -1
		while(i<strs.length) {
			while(strs[i].indexOf(pre) != 0) {
				pre = pre.substring(0, pre.length() -1 );
				i++;
			}
		}
		
			
		
		
		
		
		
		
		return pre;
		
		
		
	}

}
