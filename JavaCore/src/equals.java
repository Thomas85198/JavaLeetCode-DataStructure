/**
 * equals()：比較兩類別變數是否指向同一個物件，如果true則是
 * @author thomas
 *
 */
class Caaa{
	
	// fields
	private int num;
	
	// 建構子
	public Caaa(int n) {
		this.num = n;
	}
}
public class equals {

	public static void main(String[] args) {
		Caaa a = new Caaa(5);
		Caaa b = new Caaa(5);
		Caaa c = a;
		
		boolean br1 = a.equals(b); // a 是否跟 b 相等
		boolean br2 = a.equals(c); // a 是否跟 c 相等
		
		System.out.println(br1);
		System.out.println(br2);
		
		
		

	}

}
