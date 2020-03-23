import java.util.ArrayList;
import java.util.HashMap;

/*鴻揚科技面試專用，請勿外洩予他人
	 *題目0:
	 * 將一個字串作以下處理
	 * 1. 將",""."全部移除
	 * 2. 切割為WORD後,將句子倒置
	 * 3. 列印出不重複字元及其出現次數
	 * */	
public class executeString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		executeString3.execute("I, Jimmy, saw a saw a saw");
	}
	
	public static void execute(String s) {
		if(s == null) {
			System.out.println("不是字串");
		}
		if(s != null) {
			
			// 1) 把字串直接反轉
			s = new StringBuilder(s).reverse().toString(); 
			System.out.println(s);
		}
	}
}
