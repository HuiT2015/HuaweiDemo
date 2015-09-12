package com.test.pojo;


public class Student {

	public String name;
	private String phoneNumber;
	private String address;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Student(String name, String phoneNumber, String address, String id) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.id = id;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isEmpty() {
		if (name!=null&&phoneNumber!=null&&address!=null&&id!=null) {
			return false;
		}
		return true;
	}
}
