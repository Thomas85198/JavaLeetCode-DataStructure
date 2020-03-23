package leetcode.Easy;

import java.util.HashMap;

/**
 * 目的：羅馬數字到整數
 * 
 * @author chienlin
 *
 */
public class romanToInteger {

	public static void main(String[] args) {

		
		
		romanToInteger obj = new romanToInteger();
		
		System.out.println(obj.romanToInt("MCMXCIV"));
	}

	public int romanToInt(String s) {
		
		// 1) 先用一個 map 儲存所有對應的組合
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("I", 1);
		map.put("V", 5);
		map.put("X", 10);
		map.put("L", 50);
		map.put("C", 100);
		map.put("D", 500);
		map.put("M", 1000);
		// 2) 用一個來數計算，轉換為數字
		int sum = 0;
		int i = 0;
		// 3) 當 i < s.length()
		// 	3.1 如果至少兩位以上，且符號 i+1 > i，則 sum = sum + i+1 的值減 i 然後跳兩位
		//  3.2 如果 i+1 < i，sum += i 跳一位
		while(i<s.length()) {
			// 4) 用字串表示 subString i 處到 i+1前一位所以只有取第一位
			String currentSymbol = s.substring(i, i+1);
			System.out.println("第" + i+" 次的currentSymbol ："+currentSymbol);
			// 5) 用 subString 的一個範圍去取
			int currentValue = map.get(currentSymbol);
			// 6) 宣告一個儲存下一個符號對應的數字：i+1 到 i+2
			int nextValue = 0;
			if(i + 1 < s.length()) {
				String nextSymbol = s.substring(i+1, i+2);
				nextValue = map.get(nextSymbol);
				System.out.println("第" + i+" 次的nextSymbol ："+nextSymbol);
			}
			if(currentValue < nextValue) {
				sum += (nextValue - currentValue);
				
				i+=2;
			}else {
				sum+=currentValue;
				i+=1;
			}
			
		}
		return sum;
	}

}
