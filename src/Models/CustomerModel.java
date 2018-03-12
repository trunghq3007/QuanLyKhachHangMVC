package Models;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ValueObjects.Customer;

public class CustomerModel extends BaseModel {

	public CustomerModel(Connection oConnection) {
		super(oConnection);
	}

	@Override
	public List<Customer> GetElements() throws SQLException {
		return Databases.InitDatabases();
	}

	@Override
	public ResultSet GetElementRs() throws SQLException {
		return null;
	}

	@Override
	public List<Customer> GetElementById(Object o) throws SQLException {
		return null;
	}

	@Override
	public ResultSet GetElementByIdRS(Object o) throws SQLException {
		return null;
	}

	@Override
	public boolean InsertElement(Customer oCus) throws SQLException {
		return false;
	}

	@Override
	public boolean UpdateElement(Customer oCus) throws SQLException {
		return false;
	}

	@Override
	public boolean DeleteElement(Customer oCus) throws SQLException {
		return false;
	}

	@Override
	public boolean DeleteElementByID(Object o) throws SQLException {
		return false;
	}
}
