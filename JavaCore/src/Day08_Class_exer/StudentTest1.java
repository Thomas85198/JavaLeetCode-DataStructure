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
 * 
 * 
 * 
 */
public class StudentTest1 {
	public static void main(String[] args) {

		// 聲明Student類型的數組
		Student[] stus = new Student[20]; // String[] arr = new String[20]

		for (int i = 0; i < stus.length; i++) {
			// 給數組元素賦值
			stus[i] = new Student();
			// 給Student對象的屬性賦值
			stus[i].number = (i + 1);
			// 年級：[1,6]
			stus[i].state = (int) (Math.random() * (6 - 1 + 1) + 1);
			// 成績：[0, 100]
			stus[i].score = (int) (Math.random() * (100 - 0 + 1));
		}

		// 遍歷學生數組
		for (int i = 0; i < stus.length; i++) {
			// System.out.println(stus[i].number +"，"+ stus[i].score +"，"+ stus[i].state);

			System.out.println(stus[i].info());
		}
		System.out.println("***************************");
		// 問題一：打印出3年級(state值為3的學生成績)的學生訊息
		for (int i = 0; i < stus.length; i++) {
			if (stus[i].state == 3) {
				System.out.println(stus[i].info());
			}
		}
		System.out.println("***************************");
		// 問題二：使用冒泡排序按學生成績排序，並遍歷所有學生訊息
		for (int i = 0; i < stus.length; i++) {
			for (int j = 0; j < stus.length - 1 - i; j++) {
				if (stus[j].score > stus[j + 1].score) {
					// 如果需要換序，交換的是數組的元素：Student對象！！
					Student temp = stus[j];
					stus[j] = stus[j + 1];
					stus[j + 1] = temp;
				}
			}
		}

		// 遍歷學生數組
		for (int i = 0; i < stus.length; i++) {
			// System.out.println(stus[i].number +"，"+ stus[i].score +"，"+ stus[i].state);

			System.out.println(stus[i].info());
		}

	}
}

class Student {
	int number; // 學號
	int state; // 年級
	int score; // 成績

	// 顯示學生訊息的方法
	public String info() {
		return "學號： " + number + "年級：" + state + "成績：" + score;
	}

}
