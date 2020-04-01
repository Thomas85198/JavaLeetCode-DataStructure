package Day10_Class_java1;
/**
 * 
 * 總結：屬性賦值的先後順序
 * 
 * 1) 默認初始化
 * 2) 顯示初始化
 * 3) 構造器中初始化
 * 
 * 4) 通過“對象.方法”或“對象.屬性”的方式，賦值
 * 
 * 以上操作的先後順序：1) - 2) - 3) - 4)
 * 
 * @author thomas
 *
 */
public class UserTest {
	public static void main(String[] args) {
		User u = new User();
		System.out.println(u.age);
		
		User u1 = new User(2);
		System.out.println(u1.age); // 2 構造器是在後面執行的
		System.out.println(u1);

		u1.setAge(3);
		User u2 = u1;
		System.out.println(u1.age);
		System.out.println(u1);
		System.out.println(u2.age);
	}
}

class User{
	
	String name;
	int age = 1;
	
	public User() {
		
	}
	
	public User(int a) {
		age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
}
