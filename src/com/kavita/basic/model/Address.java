package com.kavita.basic.model;

public class Address 
{
	
	private Integer houseNo;
	private String  houseName;
	private String  streetName;
	private String  city;
	private Integer pinCode;
	private String  state;
	private String  country;
	
	public void setHouseNo(Integer houseNo) {
		this.houseNo = houseNo;
	}
	public void setHouseName(String houseName) {
		this.houseName = houseName;
	}
	
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void setPinCode(Integer pinCode) {
		this.pinCode = pinCode;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	@Override
	public String toString() {
		return "\t\thouseNo : " + houseNo + ", houseName : " + houseName + ", streetName : " + streetName + ", city :"
				+ city + ", pinCode :" + pinCode + ", state :" + state + ", country : " + country ;
	}
	
	
}
