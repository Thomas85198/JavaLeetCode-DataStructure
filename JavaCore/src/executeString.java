import java.util.ArrayList;
import java.util.HashMap;

/*鴻揚科技面試專用，請勿外洩予他人
	 *題目0:
	 * 將一個字串作以下處理
	 * 1. 將",""."全部移除
	 * 2. 切割為WORD後,將句子倒置
	 * 3. 列印出不重複字元及其出現次數
	 * */	
public class executeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		executeString.execute("I, Jimmy, saw a saw a saw");
	}
	
	public static void execute(String s) {
		if(s == null) {
			System.out.println("不是字串");
		}
		if(s != null) {
			// 1) 把字串，. 改成空白用空白取成陣列
			String[] word = s.replace(",", " ").replace(".", " ").split(" ");
			// 2) 宣告一個 ArrayList，專門存拆解好的並反轉字串
			ArrayList<String> arrWord = new ArrayList<String>();
			// 3) 宣告一個 HashMap 存放出現的字
			HashMap hm = new HashMap();
			for(String st: word) {
				// 2.1 如果字串不是 null 還有 > 0 的話，就將字串篩ArrayList
				if(st!= null && st.length() > 0) {
					arrWord.add(0,st);
					// 3.1 其中如果不重複的 篩 hm
					if(!hm.containsKey(st)) {
						hm.put(st, st);
					}
				} 
			}
			System.out.println("反轉過後的字串：");
			for(String st: arrWord) {
				System.out.print(st + " ");
			}
			System.out.println();
			System.out.println();
			System.out.println("All Words=");
			// 4) 取出所有 key 用 keySet 因為 Iteral 不能用 Map 所以要轉回 set 再跑
			//    不能用 String 配索引值去找，因為 map 是 key 與 value 
			for(Object key: hm.keySet()) {
				System.out.println(key+"");
			}
		}
	}
}
