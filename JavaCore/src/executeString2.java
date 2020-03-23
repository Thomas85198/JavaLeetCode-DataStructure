import java.util.ArrayList;
import java.util.HashMap;

/*鴻揚科技面試專用，請勿外洩予他人
	 *題目0:
	 * 將一個字串作以下處理
	 * 1. 將",""."全部移除
	 * 2. 切割為WORD後,將句子倒置
	 * 3. 列印出不重複字元及其出現次數
	 * */	
public class executeString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		executeString2.execute("I, Jimmy, saw a saw a saw");
	}
	
	public static void execute(String s) {
		if(s == null) {
			System.out.println("不是字串");
		}
		if(s != null) {
			
			// 1) 把字串，. 改成空白用空白取成陣列
			String[] word = s.replace(",", " ").replace(".", " ").split(" ");
			System.out.println(word);
			HashMap map = new HashMap();
			int left = 0;
			int right = word.length - 1;
			
		    // 2) 當 left < right 利用索引值調換 
			while(left < right) {
				// 3) 兩數調換
				String temp;
				temp = word[left];
				word[left] = word[right];
				word[right] = temp;
				
				left++;
				right--;
			}
			
			for(int i=0; i<word.length; i++) {
				if(!map.containsKey(word[i])) {
					map.put(word[i], word[i]);
				}
				System.out.print(word[i]+ " ");
			}
			
			for(Object str: map.keySet()) {
				System.out.println(str);
			}
		
			
		}
	}
}
