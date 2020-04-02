package Day12_Inheritence_exer2;

public class Account {
	
	private int id; // 帳號
	private double balance; // 餘額
	private double annualInterestRate; // 年利率
	
	public Account(int id, double balance, double annualInterestRate) {
		super();
		this.id = id;
		this.balance = balance;
		this.annualInterestRate = annualInterestRate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	
	// 返回月利率
	public double getMonthlyInterest() {
		return annualInterestRate/12;
	}
	
	// 取錢
	public void withdraw (double amount) {
		if(balance >= amount) {
			balance-= amount;
			return;
		}
		System.out.println("餘額不足");
	}
	// 存錢
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
			return;
		}
	}
	
	
	
	
	
}
