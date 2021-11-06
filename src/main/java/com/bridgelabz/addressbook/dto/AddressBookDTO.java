package com.bridgelabz.addressbook.dto;


public class AddressBookDTO {
	private int id;
    private String name;
    private String address;
    private String phoneNo;
    private String email;
    

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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [id=" + id + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo
				+ ", email=" + email + "]";
	}

}