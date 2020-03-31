class Caaa2{
	
	private int num;
	
	public Caaa2(int n) {
		num = n;
	}
	
	public String toString() {
		
		String str = "toString() called, num = "+ num;
		
		return str;
		
	}
}
public class toString {

	public static void main(String[] args) {
		
		Caaa2 a = new Caaa2(2);
		
		System.out.println(a.toString());

	}

}
