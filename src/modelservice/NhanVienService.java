/**
 * 
 */
package modelservice;

import java.sql.SQLException;

import ValueObjects.Customer;

/**
 * @description:  
 * @author: Admin
 * @time: 8:14:59 PM
 * @date: Mar 14, 2018
 */
public abstract class NhanVienService {

	// thêm khách hàng
	public abstract boolean InsertElement(Customer oCus) throws SQLException;

	// sửa khách hàng
	public abstract boolean UpdateElement(Customer oCus) throws SQLException;

	// xóa khách hàng
	public abstract boolean DeleteElement(Customer oCus) throws SQLException;
}
