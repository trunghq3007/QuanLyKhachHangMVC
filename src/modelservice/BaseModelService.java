package modelservice;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ValueObjects.Customer;

/**
 * 
 * @description: định nghĩa base business cho khách hàng
 * @author: Admin
 * @time: 7:56:09 PM
 * @date: Mar 14, 2018
 */
public abstract class BaseModelService {

	protected ResultSet mResultset;
	protected CallableStatement mCallStatement;
	protected Connection mConnection;
	protected List<Customer> mLisCustormer;

	public BaseModelService(List<Customer> olisCustomer) {
		mLisCustormer = new ArrayList<Customer>(olisCustomer);
	}

	protected BaseModelService(Connection oConnection) {
		mConnection = oConnection;
	}

	//
	public abstract Customer getCustomerById();

	public abstract List<Customer> GetElements() throws SQLException;

	public abstract ResultSet GetElementRs() throws SQLException;

	//
	public abstract List<Customer> GetElementById(Object o) throws SQLException;

	public abstract ResultSet GetElementByIdRS(Object o) throws SQLException;

	// thêm khách hàng
	public abstract boolean InsertElement(Customer oCus) throws SQLException;

	// sửa khách hàng
	public abstract boolean UpdateElement(Customer oCus) throws SQLException;

	// xóa khách hàng
	public abstract boolean DeleteElement(Customer oCus) throws SQLException;

	// xóa đối tượng
	public abstract boolean DeleteElementByID(Object o) throws SQLException;
}
