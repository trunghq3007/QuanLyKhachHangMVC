/**
 * 
 */
package modelservice;

import java.sql.SQLException;

/**
 * @description:
 * @author: Admin
 * @time: 8:23:30 PM
 * @date: Mar 14, 2018
 */
public abstract class BaseModelServices {

	// xóa đối tượng
	public abstract boolean DeleteElementByID(Object o) throws SQLException;
	 // get đối tượng
	public abstract Object getCustomerById();
}
