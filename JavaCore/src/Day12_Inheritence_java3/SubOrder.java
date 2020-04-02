package Day12_Inheritence_java3;

import Day12_Inheritence_java2.Order;

public class SubOrder extends Order {

	public void method() {
		orderProtected = 1;
		orderPublic = 2;
		
		methodProtected();
		methodPublic();
		
		// 在不同包的子類中，不能調用Order類中聲明為private和缺省權線的屬性、方法
	}
}
