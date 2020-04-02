package Day12_Inheritence_java2;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		order.orderDefault = 1;
		order.orderProtected = 2;
		order.orderPublic = 3;
		
		order.methodDefault();
		order.methodProtected();
		order.methodPublic();
		
		// 同一個包中的其他類，不可以調用Order類中私有的屬性、方法
//		order.orderPrivate = 4;
//		order.methodPrivate();
	}
}
