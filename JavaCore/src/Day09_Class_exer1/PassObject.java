package Day09_Class_exer1;

/*
 * 
 * 定義一個類PassObject，在類中定義一個方法printAreas()，
 * 該方法的定義如下：public void printAreas(Circle c, int time)
 * 在printAreas方法中打印輸出1到time之間的每個整數半徑值，以及對應的面積
 * 例如，time為5，則輸出半徑1,2,3,4,5,以及對應的原面積
 * 
 * 
 * 
 * 
 */
public class PassObject {
	public static void main(String[] args) {
		PassObject obj1 = new PassObject();
		obj1.printAreas(new Circle(), 5);
	}
	public void printAreas(Circle c, int time) {
		
		System.out.println("Radius\t\tArea");
		double i;
		for(i = 1; i <= time; i++) {
			// 設定半徑
			c.radius = i;
			System.out.println(c.radius + "\t\t" + c.findArea());
		}
		System.out.println("now radius is " + i);
	}
}
