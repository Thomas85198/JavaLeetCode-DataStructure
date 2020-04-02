package Day10_Class_exer4;

/*
* 写一个测试程序。
（1）	创建一个Customer ，名字叫 Jane Smith, 
他有一个账号为1000，余额为2000元，年利率为 1.23％ 的账户。
（2）	对Jane Smith操作。
存入 100 元，再取出960元。再取出2000元。
打印出Jane Smith 的基本信息

成功存入 ：100.0
成功取出：960.0
余额不足，取款失败
Customer [Smith, Jane] has a account: id is 1000, 
annualInterestRate is 1.23％, balance is 1140.0


*/
public class BankTest {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.addCustomer("Jane", "Smith");
		
		bank.getCustomer(0).setAccount(new Account(2000));
		// bank=>JaneSmit的Customer的Account然後做存錢的方法
		bank.getCustomer(0).getAccount().withdraw(500);
		
		double balance = bank.getCustomer(0).getAccount().getBalance();
		System.out.println("客户：" + bank.getCustomer(0).getFirstName() + "的账户余额为：" + balance);

	}

}
