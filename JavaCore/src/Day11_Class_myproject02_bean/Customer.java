package Day11_Class_myproject02_bean;

/**
 * 
 * @Description Customer為實體對象，用來封裝客戶訊息
 * 
 * 
 * @author thomas
 *
 */
public class Customer {

	private String name; // 客戶姓名
	private char gender; // 性別
	private int age; // 年齡
	private String phone; // 電話號碼
	private String email; // 電子郵件
	
	
	
	public Customer() {
		
	}
	
	
	public Customer(String name, char gender, int age, String phone, String email) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.phone = phone;
		this.email = email;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
