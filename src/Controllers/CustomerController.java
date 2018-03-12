package Controllers;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import Models.CustomerModel;
import ValueObjects.Customer;

public class CustomerController extends BaseController {
	private CustomerModel mCustomerModel;

	public CustomerController(Connection oConnection) {
		super(oConnection);
		mCustomerModel = new CustomerModel(oConnection);
	}

	@Override
	public List<Customer> GetAll() throws SQLException {
		return mCustomerModel.GetElements();
	}

	@Override
	public List<Customer> GetById(Object o) throws SQLException {
		return null;
	}

	/**
	 * bOpt = 0: Insert bOpt = 1: Update
	 */
	@Override
	public boolean InsertUpdateData(Customer o, byte bOpt) throws SQLException {
		return (bOpt == 0) ? mCustomerModel.InsertElement(o) : mCustomerModel.UpdateElement(o);
	}

	@Override
	public boolean DeleteDataByID(Object o) throws SQLException {
		return false;
	}

	@Override
	public boolean IsExists(List<Customer> lisCust, int iRollNo) {
		for (Customer obj : lisCust) {
			if (obj.getRollNo() == iRollNo)
				return true;
		}
		return false;
	}

	@Override
	public boolean RelapceData(List<Customer> lisCust, Customer o) {
		for (int i = 0; i < lisCust.size(); i++) {
			Customer obj = lisCust.get(i);
			if (obj.getRollNo() == o.getRollNo()) {
				lisCust.remove(obj);
				lisCust.add(o);
				return true;
			}
		}
		return false;
	}
}
