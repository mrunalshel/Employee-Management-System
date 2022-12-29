package com.emp;

public class employee {
	
	public int id;
	public String city;
	
	public String firstname;
	public String lastname;
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(int id, String city, String firstname, String lastname) {
		super();
		this.id = id;
		this.city = city;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	@Override
	public String toString() {
		return "employee [id=" + id + ", city=" + city + ", firstname=" + firstname + ", lastname=" + lastname + "]";
	}
	

}
