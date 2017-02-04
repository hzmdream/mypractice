package com.hzm.basic.thread.productconsum;


public class Product {

	private String userName;
	private String userAge;
	private Boolean flag;//默认为false
	public Product() {
		
	}
	public Product(String userName,String userAge) {
		this.setUserName(userName);
		this.setUserAge(userAge);
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAge() {
		return userAge;
	}
	public void setUserAge(String userAge) {
		this.userAge = userAge;
	}
	public Boolean getFlag() {
		return flag;
	}
	public void setFlag(Boolean flag) {
		this.flag = flag;
	}
	
	
}
