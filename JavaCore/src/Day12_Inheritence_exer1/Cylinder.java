package Day12_Inheritence_exer1;

public class Cylinder extends Circle {

	private double length; // 高
	
	public Cylinder() {
		length = 1.0;
	}
	
	public double getLength() {
		return length;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	// 返回圓柱的體積
//	public double findVolume() {
//		super()
//	}
	
	@Override
	public double findArea() {
		// TODO 返回圓柱的表面積
		return Math.PI * getRadius() * getRadius() *2 +
				2 * Math.PI *getRadius() * getLength();
	}
}
