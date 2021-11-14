package com.psl.modal;

import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Table(name = "Users")

public class Users {
	@Id
	@Column(name = "id")
	@GeneratedValue (strategy= GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	private String name;
	@Column(name = "email")
	private String email;
	@Column(name = "contactnum")
	private long contactnum;
	@Column(name = "address")
	private String address;
	
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

