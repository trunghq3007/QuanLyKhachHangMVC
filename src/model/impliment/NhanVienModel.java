/**
 * 
 */
package model.impliment;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import ValueObjects.Customer;
import modelservice.BaseModelService;

/**
 * @description:  
 * @author: Admin
 * @time: 8:05:19 PM
 * @date: Mar 14, 2018
 */
public class NhanVienModel extends BaseModelService{

	 /**
	 * @description:  
	 * @author: Admin CMC Corporation
	 * @create_date: Mar 14, 2018
	 * @modifier: Admin
	 * @modifined_date: Mar 14, 2018
	 * @exception: 
	 * @param oConnection
	 */
	protected NhanVienModel(Connection oConnection) {
		super(oConnection);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see Models.BaseModel#getCustomerById()
	 */
	@Override
	public Customer getCustomerById() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Models.BaseModel#GetElements()
	 */
	@Override
	public List<Customer> GetElements() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Models.BaseModel#GetElementRs()
	 */
	@Override
	public ResultSet GetElementRs() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Models.BaseModel#GetElementById(java.lang.Object)
	 */
	@Override
	public List<Customer> GetElementById(Object o) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Models.BaseModel#GetElementByIdRS(java.lang.Object)
	 */
	@Override
	public ResultSet GetElementByIdRS(Object o) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see Models.BaseModel#InsertElement(ValueObjects.Customer)
	 */
	@Override
	public boolean InsertElement(Customer oCus) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see Models.BaseModel#UpdateElement(ValueObjects.Customer)
	 */
	@Override
	public boolean UpdateElement(Customer oCus) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see Models.BaseModel#DeleteElement(ValueObjects.Customer)
	 */
	@Override
	public boolean DeleteElement(Customer oCus) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see Models.BaseModel#DeleteElementByID(java.lang.Object)
	 */
	@Override
	public boolean DeleteElementByID(Object o) throws SQLException {
		// TODO Auto-generated method stub
		

		return false;
	}

}
