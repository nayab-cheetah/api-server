/**
 * 
 */
package com.apiserver.dto;

/**
 * @author nayab.ali
 *
 */
public class User {

	public User(String name, String address, int mobileNumber) {
		super();
		this.name = name;
		this.address = address;
		this.mobileNumber = mobileNumber;
	}
	public User() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the mobileNumber
	 */
	public int getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(int mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	private String name;
	private String address;
	private int mobileNumber;
}
