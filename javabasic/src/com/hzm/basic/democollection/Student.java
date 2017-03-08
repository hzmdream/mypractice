package com.hzm.basic.democollection;

public class Student {

	private String name;
	private String age;
	private String sex;
	private String addess;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getAddess() {
		return addess;
	}
	public void setAddess(String addess) {
		this.addess = addess;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, String age, String sex, String addess) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.addess = addess;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", sex=" + sex
				+ ", addess=" + addess + "]";
	}
	
	
}
