/**
 * 
 */
package ValueObjects;

import java.sql.SQLException;

/**
 * @description:
 * @author: Admin
 * @time: 8:19:00 PM
 * @date: Mar 14, 2018
 */
public abstract class NhanVien {
	// thêm khách hàng
	public abstract boolean InsertElement(NhanVien oCus) throws SQLException;

	// sửa khách hàng
	public abstract boolean UpdateElement(NhanVien oCus) throws SQLException;

	// xóa khách hàng
	public abstract boolean DeleteElement(NhanVien oCus) throws SQLException;
}
