package com.training.bankdetails.bankingapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Bank")
public class Customers {
	@Id
	private int customerID;
	
	private String firstName;
	private String lastName;
	private long accNo;
	private String houseName;
	private String streetName;
	private long pinCode;
	private String district;
	private String state;
	private long mobNo;
	private String branchName;

	public Customers(String firstName, String lastName, long accNo, String houseName,
			String streetName, long pinCode, String district, String state, long mobNo, String branchName) {

		this.firstName = firstName;
		this.lastName = lastName;
		this.accNo = accNo;
		this.houseName = houseName;
		this.streetName = streetName;
		this.pinCode = pinCode;
		this.district = district;
		this.state = state;
		this.mobNo = mobNo;
		this.branchName = branchName;
	}

	public Customers() {

	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String getHouseName() {
		return houseName;
	}

	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getMobNo() {
		return mobNo;
	}

	public void setMobNo(long mobNo) {
		this.mobNo = mobNo;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	@Override
	public String toString() {
		return "Customers [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", accNo=" + accNo + ", houseName=" + houseName + ", streetName=" + streetName + ", pinCode="
				+ pinCode + ", district=" + district + ", state=" + state + ", mobNo=" + mobNo + ", branchName="
				+ branchName + "]";
	}

}
