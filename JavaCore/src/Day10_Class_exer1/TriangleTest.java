package Day10_Class_exer1;

public class TriangleTest {

	public static void main(String[] args) {
		
		Triangle t1 = new Triangle();
		t1.setBase(2.0);
		t1.setHeight(2.4);

//	    這兩個不是沒有記憶體，是看不到
//		t1.base = 2.5;
//		t1.height = 4.3
		
		System.out.println("base : " + t1.getBase() + ", height :" + t1.getHeight());
		
		Triangle t2 = new Triangle(5.1, 5.6);
		System.out.println("base : " + t2.getBase() + ", height :" + t2.getHeight());
	}
}
