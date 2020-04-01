package Day10_Class_java1;

import Day10_Class.Order;

public class OrderTest {
	public static void main(String[] args) {
		Order order = new Order();
		
		// 出了Order類所屬的包之後，私有的結構、缺省聲明的結構就不可以調用了
		// order.orderDefault = 1; 
		order.orderPublic = 2;
		// 出了Order類之後，私有的結構屬性就不可以調用
		// order.orderPrivate = 3; // The field Order.orderPrivate is not visible
		
		// order.methodDefault();
		order.methodPublic();
		// order.methodPrivate(); // The field Order.orderPrivate is not visible
	}
}
