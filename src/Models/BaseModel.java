package Models;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import ValueObjects.Customer;



public abstract class BaseModel {
	protected ResultSet mResultset;
	protected CallableStatement mCallStatement;
	protected Connection mConnection;
	protected List<Customer> mLisCustormer;
	public BaseModel(List<Customer> olisCustomer) {
		mLisCustormer = new ArrayList<Customer>(olisCustomer);
	}		
	protected BaseModel(Connection oConnection){
		 mConnection = oConnection;
	}	
	public abstract List<Customer> GetElements() throws SQLException;
	public abstract ResultSet GetElementRs() throws SQLException;	
	public abstract List<Customer> GetElementById(Object o) throws SQLException;
	public abstract ResultSet GetElementByIdRS(Object o) throws SQLException;	
	public abstract boolean InsertElement(Customer oCus) throws SQLException;
	public abstract boolean UpdateElement(Customer oCus) throws SQLException;
	public abstract boolean DeleteElement(Customer oCus) throws SQLException;	
	public abstract boolean DeleteElementByID(Object o) throws SQLException;			
}
