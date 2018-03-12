package Controllers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import ValueObjects.Customer;

public abstract class BaseController {
	protected Connection mConnection;

	public BaseController(Connection oConnection) {
		mConnection = oConnection;
	}

	public abstract List<Customer> GetAll() throws SQLException;

	public abstract List<Customer> GetById(Object o) throws SQLException;

	public abstract boolean InsertUpdateData(Customer o, byte bOpt) throws SQLException;

	public abstract boolean DeleteDataByID(Object o) throws SQLException;

	public abstract boolean IsExists(List<Customer> lisCust, int iRollNo);

	public abstract boolean RelapceData(List<Customer> lisCust, Customer o);
}
