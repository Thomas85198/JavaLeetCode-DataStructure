package Day11_Class_myproject02_service;

import Day11_Class_myproject02_bean.Customer;

/**
 * 
 * @Description CustomerList為Customer對象的管理模塊
 * 內部用數組管理一組Customer對象，並提供相應的添加、修改、刪除和遍歷方法
 * 供CustomerView調用
 * 
 * @author thomas
 *
 */
public class CustomerList {

	private Customer[] customers; // 用來保存客戶對象的數組
	private int total = 0; // 記錄以保存客戶中對象的數量
	
	/**
	 * 用來初始化customers數組的構造器
	 * @param totalCustomer
	 */
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	
	/**
	 * @Description 將指定的客戶添加到數組中
	 * @param customer
	 * @return true：添加成功 false：添加失敗
	 */
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length)
			return false;
		
		customers[total] = customer;
		total++;
		return true;
	}
	
	/**
	 * @Description 修改指定索引位置的客戶訊息
	 * @param index
	 * @param cust
	 * @return true：修改成功 false：修改失敗
	 */
	public boolean replaceCustomer(int index, Customer cust) {
		if(index < 0 || index >= total) {
			return false;
		}
		customers[index] = cust;
		return true;
	}
	
	/**
	 * @Description 刪除指定索引位置上的客戶
	 * @param index
	 * @return true：刪除成功 false：刪除失敗
	 */
	public boolean deleteCustomer(int index) {
		if(index < 0 || index >=total) {
			return false;
		}
		// 數組刪除要把後一個變成前一個，最後一個變成null
		for(int i=index; i<total -1;i++) {
			customers[i] = customers[i+1];
		}
		// 最後的數據元素須為空
//		customers[total - 1] = null;
//		total--;
		// 或
		customers[--total] = null;
		return true;
	}
	
	/**
	 * @Description 獲取所有的客戶訊息
	 * @param index
	 * @param cust
	 * @return 
	 */
	public Customer[] getAllCustomers() {
		// return customers 不行，因為裡面很多是空的
		// 所以要複製一個把有值得給進去
		Customer[] custs = new Customer[total];
		for(int i = 0; i<total; i++) {
			custs[i] = customers[i];
		} // 把每個地址值都給他
		return custs;
	}
	/**
	 * @Description 獲取指定索引位置上的客戶
	 * @param index
	 * @param cust
	 * @return 如果找到了元素，則返回：如果沒找到，則返回null
	 */
	public Customer getCustomer(int index) {
		if(index <0 || index >= total) {
			return null;
		}
		return customers[index];
	}
	/**
	 * @Description 獲取存儲的客戶的數量
	 * @return total
	 */
	public int getTotal() {
		return total;
		// 不能直接寫數組長度會有空值
	}
}
