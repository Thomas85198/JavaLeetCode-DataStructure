package Day10_Class_exer1;
/*
 * 
 * 編寫兩個類，Triangle和TriangleTest，其中Triangle類中聲明私有的底邊長base和height，同時聲明公共法訪問私有變量。
 * 此外，提供類必須的構造器。領一個使用這些公用方法，計算三角形面積。
 * 
 * 
 */
public class Triangle {

	private double base; // 底邊長
	private double height; // 高
	
	public Triangle() {
		
	}
	
	public Triangle(double b, double h) {
		base = b;
		height = h;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
