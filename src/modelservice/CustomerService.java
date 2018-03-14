/**
 * 
 */
package modelservice;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ValueObjects.Customer;

/**
 * @description:
 * @author: Admin
 * @time: 8:13:53 PM
 * @date: Mar 14, 2018
 */
public abstract class CustomerService extends BaseModelServices  {
	protected List<Customer> mLisCustormer;

	public CustomerService(List<Customer> olisCustomer) {
		mLisCustormer = new ArrayList<Customer>(olisCustomer);
	}

	// thêm khách hàng
	public abstract boolean InsertElement(Customer oCus) throws SQLException;

	// sửa khách hàng
	public abstract boolean UpdateElement(Customer oCus) throws SQLException;

	// xóa khách hàng
	public abstract boolean DeleteElement(Customer oCus) throws SQLException;
	// trả lại hàng
	public abstract boolean returnPackage();
}
