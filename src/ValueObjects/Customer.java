package ValueObjects;

/**
 * 
 * @description: Entity khách h
 * @author: Admin
 * @time: 7:48:21 PM
 * @date: Mar 14, 2018
 */
public class Customer {
	// Instance Variable
	private int rollNo;
	private String fullName;
	private String email;
	private String mobile;
	private String address;

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
