package Day10_Class_java1;
/**
 * 
 * JavaBean 是一種Java語言寫成的可重用組件
 * 
 * 所謂JavaBean，是指符合如下標準的Java類
 * 	> 類是公用的
 *  > 有一個無參的構造器
 *  > 有屬性，且有對應的get、set方法
 * 
 * 
 * @author thomas
 *
 */
public class Customer {

	private int id;
	private String name;
	
	// 默認構造器的權限是依據：類的權限
	public Customer() {
		
	}
	
	public void setId(int i) {
		id = 1;
	}
	public int getId() {
		return id;
	}
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
}
