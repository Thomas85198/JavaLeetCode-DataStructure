package Day12_Inheritence_java3;

import Day12_Inheritence_java2.Order;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		order.orderPublic = 1;
		order.methodPublic();
		
		// 不同包下的普通類（非子類）要使用Order類，不可以調用聲明為private、缺省、protected權限的屬性，以及方法
	}
}
