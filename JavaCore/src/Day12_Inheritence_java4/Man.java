package Day12_Inheritence_java4;

public class Man extends Person {

	boolean isSmoking;
	
	int id = 1002;
	
	public void earnMoney() {
		System.out.println("男人負責掙錢養家");
	}
	
	public void eat() {
		System.out.println("男人多吃肉");
	}
	
	public void walk() {
		System.out.println("男人霸氣的走路");
	}
}
