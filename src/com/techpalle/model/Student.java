package com.techpalle.model;

public class Student {
	
	private int id;
	private String name;
	private String email;
	private String qualification;
	private String password;
	private long mobile;
	
	
	
	
	public Student(String name, String email, String qualification, String password, long mobile) {
		super();
		this.name = name;
		this.email = email;
		this.qualification = qualification;
		this.password = password;
		this.mobile = mobile;
	}


	public Student(int id,String name,String email,String qualification,String password,long mobile) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.qualification = qualification;
	this.password = password;
	this.mobile = mobile;
	}
	
	
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	


	
	
}
