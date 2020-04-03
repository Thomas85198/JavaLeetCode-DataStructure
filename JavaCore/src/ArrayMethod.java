
public class ArrayMethod {

	public static void main(String[] args) {
		Array test = new Array();
		Dog[] dog = new Dog[5];
		for(int i=0; i<dog.length; i++) {
			dog[i] = new Dog();
			test.test(dog);
		}
		
	}
	
	
}
class Array{
	
	public int[] age;
	
	public void test(Dog[] dog) {
		
	   dog[0] = new Dog();
	   System.out.println(dog);
	   
	}
	
}

class Dog{
	
	
	private int tall;
	
	private int longTail;
	
	
	
	public int getTall() {
		return tall;
	}
	public void setTall(int tall) {
		this.tall = tall;
	}
	public int getLongTail() {
		return longTail;
	}
	public void setLongTail(int longTail) {
		this.longTail = longTail;
	}
	
	
	
}
