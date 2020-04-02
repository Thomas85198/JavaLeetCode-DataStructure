package Day11_Class_myproject02_ui;

import Day11_Class_myproject02_bean.Customer;
import Day11_Class_myproject02_service.CustomerList;
import Day11_Class_myproject02_util.CMUtility;

/**
 * 
 * @Description CustomerView為主模塊，負責菜單的顯示和處理用戶操作
 * @author thomas
 *
 */
public class CustomerView {

	private CustomerList customerList = new CustomerList(10);

	
	public CustomerView(){
		Customer customer = new Customer("王涛", '男', 23, "13212341234", "wt@gmail.com");
		customerList.addCustomer(customer);
	}
	/**
	 * 顯示客戶訊息管理軟件界面的方法
	 */
	public void enterMainMenu() {

		boolean isFlag = true;
		while (isFlag) {
			System.out.println("\n-----------------客户信息管理软件-----------------\n");
			System.out.println("                   1 添 加 客 户");
			System.out.println("                   2 修 改 客 户");
			System.out.println("                   3 删 除 客 户");
			System.out.println("                   4 客 户 列 表");
			System.out.println("                   5 退       出\n");
			System.out.print("                   请选择(1-5)：");

			char menu = CMUtility.readMenuSelection();
			switch (menu) {
			case '1':
				addNewCustomer();
				break;
			case '2':
				modifyCustomer();
				break;
			case '3':
				deleteCustomer();
				break;
			case '4':
				listAllCustomers();
				break;
			case '5':
				System.out.println("退出...");
				
				System.out.println("確認是否退出(Y/N)：");
				char isExit = CMUtility.readConfirmSelection();
				if(isExit == 'Y') {
					isFlag = false;
				}
				// break;
			}
		
		}
	}

	/**
	 * 添加客戶操作
	 * 
	 */
	public void addNewCustomer() {
		System.out.println("---------------------------添加客戶---------------------------\n");
		System.out.println("添加客戶操作");
		System.out.println("姓名：");
		String name =CMUtility.readString(10);
		System.out.println("性別：");
		char gender = CMUtility.readChar();
		System.out.println("年齡：");
		int age = CMUtility.readInt();
		System.out.println("電話：");
		String phone = CMUtility.readString(13);
		System.out.println("郵箱：");
		String email = CMUtility.readString(30);
		
		// 儲存到數組中
		// 將上述數據封裝到對象中
		Customer customer = new Customer(name, gender, age, phone, email);
		boolean isSuccess = customerList.addCustomer(customer);
		if(isSuccess) {
			System.out.println("添加完成");
		}else {
			System.out.println("添加失敗");
		}
		System.out.println("---------------------------添加結束---------------------------\n");
	}

	/**
	 * 修改客戶操作
	 * 
	 */
	public void modifyCustomer() {
		System.out.println("---------------------------修改客戶---------------------------\n");
		System.out.println("修改客戶操作");
		int number = CMUtility.readInt();
		Customer cust ; 
		
		for(;;) {
			System.out.println("請選擇待修改客戶編號（-1退出）");
			if(number == -1) {
				return;
			}
			cust = customerList.getCustomer(number -1); 
			if(cust == null) {
				System.out.println("無法找到指定客戶");
			}else { // 找到了相應編號的客戶
				break;
			}
		}
		// 修改客戶訊息
		System.out.println("姓名（" + cust.getName() + ")：");
		String name = CMUtility.readString(10, cust.getName());
		System.out.println("性別（" + cust.getGender() + ")：");
		char gender = CMUtility.readChar(cust.getGender());
		System.out.println("年齡（" + cust.getAge() + ")：");
		int age = CMUtility.readInt(cust.getAge());
		System.out.println("電話（" + cust.getPhone() + ")：");
		String phone = CMUtility.readString(13, cust.getPhone());
		System.out.println("郵箱（" + cust.getEmail() + ")：");
		String email = CMUtility.readString(30, cust.getEmail());
		
		Customer newCust = new Customer(name, gender, age, phone, email);
		
		boolean isReplaced = customerList.replaceCustomer(number-1, newCust);
		if(isReplaced) {
			System.out.println("----------------修改完成----------------------");
		}else {
			System.out.println("----------------修改失敗----------------------");
		}
		
		
		
	}

	/**
	 * 刪除客戶操作
	 * 
	 */
	public void deleteCustomer() {
		System.out.println("刪除客戶操作");
	}

	/**
	 * 顯示客戶列表操作
	 * 
	 */
	public void listAllCustomers() {
		System.out.println("---------------------------客户列表---------------------------\n");
		int total = customerList.getTotal();
		
		if(total == 0) {
			System.out.println("沒有客戶紀錄");
			
		}else {
			System.out.println("编号\t姓名\t性别\t年龄\t电话\t\t邮箱");
			Customer[] custs = new Customer[customerList.getAllCustomers().length];
			System.out.println(custs);
			custs = customerList.getAllCustomers();
			System.out.println(customerList.getAllCustomers().length);
			System.out.println(custs);
			System.out.println(customerList.getAllCustomers());
			for(int i=0; i<custs.length; i++) {
				Customer cust = custs[i];
				System.out.println((i + 1) + "\t" + cust.getName() + 
						"\t" + cust.getGender() + "\t" + cust.getAge() + 
						"\t" + cust.getPhone() + "\t" + cust.getEmail());
			}
		}
		
		System.out.println("---------------------------客户列表完成---------------------------\n");

		System.out.println("顯示客戶操作");
	}

	public static void main(String[] args) {

		CustomerView view = new CustomerView();
		view.enterMainMenu();

	}

}
