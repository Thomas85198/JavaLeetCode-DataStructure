package Day12_Inheritence_exer1;

public class CylinderTest {
	
	public static void main(String[] args) {
		
		Cylinder cy = new Cylinder();
		
		cy.setRadius(2.1);
		cy.setLength(3.4);
//		double volumn = cy.findVolume();
		//System.out.println("圓柱的體積為：" + volumn);
		
		double area = cy.findArea();
		System.out.println("底面元的面積" + area);
		
		
	}
}
