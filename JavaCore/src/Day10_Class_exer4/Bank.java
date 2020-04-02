package Day10_Class_exer4;

public class Bank {

	private Customer[] customers; // 客戶數組
	private int numberOfCustomer; // 客戶數目
	
	public Bank() {
		customers = new Customer[10];
	}
	
	public Bank(Customer[] customers, int numberOfCustomer) {
		this.customers = customers;
		this.numberOfCustomer = numberOfCustomer;
	}
	
	//addCustomer 方法必须依照参数（姓，名）构造一个新的 Customer 对象，然后把它放到 customer 数组中。还必须把 number O fCustomer 属性的值加 1 。
	public void addCustomer(String f, String l) {
		Customer cust = new Customer(f, l); // new 一個對象
		// 放物件到數組中
		customers[numberOfCustomer] = cust;
		numberOfCustomer++;
	}
	
	public int getNumOfCustomers() {
		
		return numberOfCustomer;
	}
	
	public Customer getCustomer(int index) {
		// index不能超過數組length-1;
		if(index < 0 || index > numberOfCustomer ) {
			System.out.println("查無此用戶");
			return null;
		} 
			return customers[index];
	}
	
	
}
