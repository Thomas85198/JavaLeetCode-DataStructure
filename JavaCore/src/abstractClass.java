/**
 * 
 * 抽象類別只能夠透過衍生出來的新類別，去 new 物件
 * 一般的函數，抽象函數: abstract 開頭的函數
 * 此函數只定義傳回值的資料型態、函數名稱與所需的引數，但沒有處理方式
 * 在裡面宣告的函數，只能宣告為 public、protected，或是不宣告，但不能宣告為 private
 * 好處是同一個類別可以定義一般與抽象函數，方便要繼承的類別操作
 * instanceof：用來判斷是否為繼承或是物件關係
 * @author thomas
 *
 */
// 定義一個抽象類別
abstract class CShape{
	protected String color; // 一般成員
	
	public void setColor(String str) {
		color = str;
	} // 一般方法
	
	public abstract void show(); // 抽象方法
}
// 繼承抽象類別
public class abstractClass extends CShape {
	// 一般成員
	protected double radius;
	
	
	// 建構子
	public abstractClass(double r) {
		radius = r;
	}
	
	// 實作抽象方法
	@Override
	public void show() {
		
		System.out.println("color=" + color+ ", ");	
		System.out.println("area = " + 3.14* Math.pow(radius, 2));
	}

	public static void main(String[] args) {
		
		abstractClass obj1 = new abstractClass(3);
		obj1.setColor("Green");
		obj1.show();
		System.out.println(obj1 instanceof abstractClass);
		
		// 用抽象類別當作父類別 new
		CShape obj2 = new abstractClass(3);
		obj2.setColor("Green");
		obj2.show();
	}
}
