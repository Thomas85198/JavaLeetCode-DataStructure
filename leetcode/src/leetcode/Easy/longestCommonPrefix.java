package leetcode.Easy;

/**
 * 目的：找出前綴一樣的部分
 * 還不太會...
 * 
 * @author chienlin
 *
 */
public class longestCommonPrefix {

	public static void main(String[] args) {

		String[] strs = { "flower", "flow", "flight" };
		longestCommonPrefix obj1 = new longestCommonPrefix();
		System.out.println(obj1.longestCommonPrefix(strs));

	}

	public String longestCommonPrefix(String[] strs) {
		// 1) 如果是 null 與 字串陣列長度沒有字
		 if (strs == null || strs.length == 0) return "";
		 // 2) 看字的字母
		    for (int i = 0; i < strs[0].length() ; i++){
		    	
		        char c = strs[0].charAt(i);
		        System.out.println(i + "=" + c);
		        
		        for (int j = 1; j < strs.length; j ++) {
		        	System.out.println(strs[j]);
		            if (i == strs[j].length() || strs[j].charAt(i) != c)
		                return strs[0].substring(0, i);             
		        }
		    }
		    return strs[0];

	}

}
