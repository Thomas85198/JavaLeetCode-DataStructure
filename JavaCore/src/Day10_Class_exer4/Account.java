package Day10_Class_exer4;

public class Account {

	private double balance; // 餘額
	
	// 建構子
	public Account(double init_balance) {
		
		this.balance = init_balance;
	}

	// get set
	public double getBalance() {
		return balance;
	}
	
	// 存錢
	// 提款方法withdraw 中，需要判断用户余额是否能够满足提款数额的要求，如果不能，应给出提示
	public void deposit(double amt) {
		if(amt == 0) {
			System.out.println("沒有存錢");
			return;
		}
		balance += amt;
		System.out.println("存錢成功");
	}
	
	public void withdraw(double amt) {
		if(amt > balance) {
			System.out.println("提款失敗");
			return;
		}
		balance -= amt;
		System.out.println("提款成功");
		
	}
	
	
	
}
