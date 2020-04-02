package Day12_Inheritence_exer2;

public class CheckAccountTest {
	public static void main(String[] args) {
		
		CheckAccount acct = new CheckAccount(1122, 20000, 0.045, 5000);
		acct.withdraw(5000); // 取5000
		System.out.println("您的帳戶餘額為：" + acct.getBalance());
		System.out.println("您的可透支額度為：" + acct.getOverdraft());
		acct.withdraw(18000);
		System.out.println("您的帳戶餘額為：" + acct.getBalance());
		System.out.println("您的可透支額度為：" + acct.getOverdraft());
		acct.withdraw(3000);
		System.out.println("您的帳戶餘額為：" + acct.getBalance());
		System.out.println("您的可透支額度為：" + acct.getOverdraft());
	}
}
