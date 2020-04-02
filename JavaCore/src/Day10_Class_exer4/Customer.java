package Day10_Class_exer4;

public class Customer {

	private String firstName; // 名
	private String lastName; // 姓
	private Account account; // 帳戶物件
	
	public Customer(String f, String l) {
		this.firstName = f;
		this.lastName = l;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account acct) {
		this.account = acct;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}
	
	
	
	
	
}
