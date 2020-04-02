package Day12_Inheritence_exer1;

public class Circle {

	private double radius; // 半徑
	
	public Circle() {
		radius = 1.0;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	// 返回圓的面積
	public double findArea() {
		return Math.PI * radius * radius;
	}
	
}
