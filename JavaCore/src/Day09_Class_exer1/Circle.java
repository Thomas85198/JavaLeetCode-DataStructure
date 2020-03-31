package Day09_Class_exer1;
/*
 * 
 * 定義一個Circle類，包含一個double型的radius屬性代表圓的半徑
 * 一個findArea()方法返回元的面積
 * 
 * 
 * 
 */
public class Circle {
	double radius; // 半徑
	
	// 圓的面積
	public double findArea() {
		return radius * radius * Math.PI;
	}
}
