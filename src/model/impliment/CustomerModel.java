package model.impliment;

import java.sql.SQLException;
import java.util.List;

import ValueObjects.Customer;
import modelservice.CustomerService;

public class CustomerModel extends CustomerService {

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 14, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 14, 2018
	 * @exception:
	 * @param olisCustomer
	 */
	public CustomerModel(List<Customer> olisCustomer) {
		super(olisCustomer);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @description:
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 14, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 14, 2018
	 * @exception:
	 * @param oConnection
	 */

	/*
	 * (non-Javadoc)
	 * 
	 * @see modelservice.CustomerService#InsertElement(ValueObjects.Customer)
	 */
	@Override
	public boolean InsertElement(Customer oCus) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see modelservice.CustomerService#UpdateElement(ValueObjects.Customer)
	 */
	@Override
	public boolean UpdateElement(Customer oCus) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see modelservice.CustomerService#DeleteElement(ValueObjects.Customer)
	 */
	@Override
	public boolean DeleteElement(Customer oCus) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see modelservice.BaseModelServices#DeleteElementByID(java.lang.Object)
	 */
	@Override
	public boolean DeleteElementByID(Object o) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see modelservice.BaseModelServices#getCustomerById()
	 */
	@Override
	public Object getCustomerById() {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see modelservice.CustomerService#returnPackage()
	 */
	@Override
	public boolean returnPackage() {
		// TODO Auto-generated method stub
		return false;
	}

}
