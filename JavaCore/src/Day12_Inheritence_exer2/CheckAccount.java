package Day12_Inheritence_exer2;
/*
 * 创建Account类的一个子类CheckAccount代表可透支的账户，该账户中定义一个属性overdraft代表可透支限额。
 * 在CheckAccount类中重写withdraw方法，其算法如下：
		如果（取款金额<账户余额），
		可直接取款
		如果（取款金额>账户余额），
		计算需要透支的额度
		判断可透支额overdraft是否足够支付本次透支需要，如果可以
			将账户余额修改为0，冲减可透支金额
		如果不可以
			提示用户超过可透支额的限额

 * 
 * 
 */
public class CheckAccount extends Account {

	private double overdraft; // 可透支限額
	
	public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
		super(id, balance, annualInterestRate);
		this.overdraft = overdraft;
	}

	@Override
	public void withdraw(double amount) {
		// 要小心父類權限不夠...
		// 就要使用get方法
		if(getBalance() >= amount) { // 餘額就足夠消費
			// 方式一：get只是取值，如果要做商業邏輯傳回物件還是要用set
			// setBalance(getBalance() - amount);
			// 方式二
			super.withdraw(amount);
		} else if(overdraft >= (amount - getBalance())) { // 透支額度 + 餘額足夠消費
			
			overdraft -= (amount - getBalance()); // 要先算才可以歸0
			// setBalance(0); // 歸0
			// 或
			super.withdraw(getBalance());
			
		} else {
			System.out.println("超過可透支金額");
		}
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}
	
	
}
