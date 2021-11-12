package com.psl.modal;

public class Users {
	private int id;
	private String name;
	private String email;
	private long contactnum;
	private String address;

	
	
	@Override
	public String toString() {
		return "Users [id=" + id + ", name=" + name + ", email=" + email + ", contactnum=" + contactnum + ", address="
				+ address + "]";
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



	public long getContactnum() {
		return contactnum;
	}



	public void setContactnum(long contactnum) {
		this.contactnum = contactnum;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public Users() {
		super();
	}



	public Users(int id, String name, String email, long contactnum, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contactnum = contactnum;
		this.address = address;
	}
	
	

}

