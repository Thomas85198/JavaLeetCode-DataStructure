package Day09_Class;

/**
 * 
 * 一、理解“萬事萬物皆對象”
 * 1. 在Java語言範疇中，我們都將功能、結構等封裝到類中，通過類的實例化，來調用具體的功能結構
 * 		> Scanner，String等
 * 		> 文件：File
 * 		> 網路資源：URL
 * 2. 涉及到Java語言與前端Html、後端的數據庫交互時，前後端的結構在Java層面交互時，都體現為類、對象。 
 * 
 * 二、內存解析的說明
 * 1. 引用類型的變量，只能存儲兩類值：null 或 地址值（含變量的類型）
 * 
 * 三、匿名對象的使用
 * 1. 理解：我們創建的對象，沒有顯示的賦給一個變量名。即為匿名對象
 * 2. 特徵：匿名對象只能調用一次
 * 3. 
 * 
 * @author thomas
 *
 */
public class InstanceTest {
	public static void main(String[] args) {
		Phone p = new Phone();
		System.out.println(p);
		
		p.sendEmail();
		p.playGame();
		
		// 匿名對象：沒有給他一個有名對象
		// new Phone().sendEmail();
		new Phone().price = 1999;
		new Phone().showPrice(); // 0.0
		
		//*****************************
		PhoneMall mall = new PhoneMall();
		// mall.show(p);
		// 匿名對象的使用
		mall.show(new Phone());
	}
}

class PhoneMall{
	
	public void show(Phone phone) {
		phone.sendEmail();
		phone.playGame();
	}
}

class Phone{
	
	double price; // 價格
	
	public void sendEmail() {
		System.out.println("發送郵件");
	}
	
	public void playGame() {
		System.out.println("");
	}
	
	public void showPrice() {
		System.out.println("手機價格為：" + price);
	}
	
}
