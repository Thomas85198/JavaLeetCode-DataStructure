package Day11_Class_myproject02_service;

import Day11_Class_myproject02_bean.Customer;

/**
 * 
 * @Description CustomerList為Customer對象的管理模塊
 *              內部用數組管理一組Customer對象，並提供相應的添加、修改、刪除和遍歷方法 供CustomerView調用
 * 
 * @author thomas
 *
 */
public class CustomerList {

	private Customer[] customers; // 用來保存客戶對象的數組
	private int total = 0; // 記錄以保存的數量

	/**
	 * @Description 用來初始化customers 數組的構造器
	 * @param totalCustomer：指定數組的長度
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}

	/**
	 * @Description 將指定的客戶添加到數組中
	 * @param customer
	 * @return true:添加成功 false:添加失敗
	 */
	public boolean addCustomer(Customer customer) {
		// 滿了就壞了...
		if (total >= customers.length)
			return false;

		// 可以的話...
		customers[total++] = customer;
		return true;
	}

	/**
	 * 
	 * @Description 修改指定索引位置上的客戶信息
	 * @param index
	 * @param cust
	 * @return true: 修改成功 false: 修改失敗
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		// 不符合的...
		if (index < 0 || index >= total) {
			return false;
		}
		customers[index] = cust;
		return true;
	}

	/**
	 * 
	 * @Description 刪除指定索引位置上的客戶
	 * @param index
	 * @return true: 刪除成功 false: 刪除失敗
	 */
	public boolean deleteCustomer(int index) {
		// 不符合的...
		if (index < 0 || index >= total) {
			return false;
		}

		// 後面一個把前面的覆蓋掉...最後一個改為null
		// 把index後面的往前移
		// -1是因為i+1會超出去，如果沒-1
		for (int i = index; i < total - 1; i++) {
			customers[i] = customers[i + 1];
		}

		// 最後有數據的元素要制空
		customers[total - 1] = null;
		total--;
		return true;
	}

	/**
	 * 
	 * @Description 獲取所有的客戶訊息
	 * @return customers
	 */
	public Customer[] getAllCustomers() {
//		不能直接返回customer
		Customer[] custs = new Customer[total];
		for (int i = 0; i < total; i++) {
			custs[i] = customers[i]; // 只複製有值得部分的地址值
		}
		return custs;
	}
	/**
	 * 
	 * @Description 獲取指定索引位置的客戶 
	 * @param index
	 * @return 如果找到了元素，則返回，沒有返回 null
	 */
	public Customer getCustomer(int index) {
		if(index < 0 || index >= total) {
			return null;
		}
		return customers[index];
	}

	/**
	 * 
	 * @Description 返回儲存的數量 
	 * @return
	 */
	public int getTotal() {
		return total;
	}

}
