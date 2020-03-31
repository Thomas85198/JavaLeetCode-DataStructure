package Day08_Class_exer;

/*
 * 
 * 2. 利用面向對象的編成方法，設計類Circle計算圓的面積
 * 
 * 
 */

public class CircleTest {
	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		
		c1.radius = 2.1;
		
		// 對應方式一：
//		double area = c1.findArea();
//		System.out.println(area);
		
		// 對應方式二：
		c1.findArea();
	}
}


// 圓
class Circle{
	
	// 屬性
	double radius;
	
	// 求圓的面積
	// 方式一：
//	public double findArea() {
//		double area = Math.PI * radius * radius;
//		return area;
//	}
	
	// 方式二：
	public void findArea() {
		double area = Math.PI * radius * radius;
		System.out.println("面積為: " + area);
	}
	
	// 錯誤的調用：有屬性就不要在調用同性質的內參
//	public void findArea(double r){
//		double area = Math.PI * radius * radius;
//		System.out.println("面積為: " + area);
//	}
	
	
	
	
}