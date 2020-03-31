package Day08_Class_exer;

/*
 * 
 * 4. 對象數組題目：
 * 定義Student，包含三個屬性：學號number(int)，年級state(int)，成績score(int)。
 * 創建20個學生對象，學號1到20，年級和成績都由隨機數確定。
 * 問題一：打印出3年級(state值為3)的學生訊息。
 * 問題二：使用冒泡排序案學生成績排序，並遍歷所有學生訊息
 * 
 * 提示：
 * 1) 生成隨機數：Math.random()，返回值類型 doble;
 * 2) 四捨五入取整：Math.round(double d)，返回值類型long。
 * 
 * 
 * 此代碼是對StudentTest1.java的改進，將操作數組的功能封裝到方法中。
 * 
 * 
 */
public class StudentTest {
	public static void main(String[] args) {

		// 聲明Student類型的數組
		Student1[] stus = new Student1[20]; // String[] arr = new String[20]

		for (int i = 0; i < stus.length; i++) {
			// 給數組元素賦值
			stus[i] = new Student1();
			// 給Student對象的屬性賦值
			stus[i].number = (i + 1);
			// 年級：[1,6]
			stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
			// 成績：[0, 100]
			stus[i].score = (int) (Math.random() * (100 - 0 + 1));
		}

		StudentTest test = new StudentTest();
		
		
		// 遍歷學生數組
		test.print(stus);
		System.out.println("***************************");
		// 問題一：打印出3年級(state值為3的學生成績)的學生訊息
		test.searchState(stus, 3);
		System.out.println("***************************");
		// 問題二：使用冒泡排序按學生成績排序，並遍歷所有學生訊息
		test.sort(stus);

		// 遍歷學生數組
		for (int i = 0; i < stus.length; i++) {
			// System.out.println(stus[i].number +"，"+ stus[i].score +"，"+ stus[i].state);

			System.out.println(stus[i].info());
		}

	}
	// 遍歷Student1[]數組操作
	public void print(Student1[] stus) {
		for (int i = 0; i < stus.length; i++) {
			// System.out.println(stus[i].number +"，"+ stus[i].score +"，"+ stus[i].state);

			System.out.println(stus[i].info());
		}
	}
	/**
	 * @Description 查找Student數組中指定年級的訊息
	 * @param stus
	 * @param state
	 */
	public void searchState(Student1[] stus, int state) {
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].state == state) {
				System.out.println(stus[i].info());
			}
		}
	}
	
	/**
	 * @Description 給Student1數組排序
	 * @param stus
	 */
	public void sort(Student1[] stus) {
		for (int i = 0; i < stus.length; i++) {
			for (int j = 0; j < stus.length - 1 - i; j++) {
				if (stus[j].score > stus[j + 1].score) {
					// 如果需要換序，交換的是數組的元素：Student對象！！
					Student1 temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;
				}
			}
		}
	}
	
	
	
}

class Student1 {
	int number; // 學號
	int state; // 年級
	int score; // 成績

	// 顯示學生訊息的方法
	public String info() {
		return "學號： " + number + "年級：" + state + "成績：" + score;
	}

}
