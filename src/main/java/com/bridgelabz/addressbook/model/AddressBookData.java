package com.bridgelabz.addressbook.model;

import com.bridgelabz.addressbook.dto.AddressBookDTO;

public class AddressBookData {
	
	private int Id;
	private String name;
    private String address;
    private String phoneNo;
    private String email;
    
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
		return "AddressBookData [Id=" + Id + ", name=" + name + ", address=" + address + ", phoneNo=" + phoneNo
				+ ", email=" + email + "]";
	}
	public AddressBookData(int id,AddressBookDTO addressbookDTO) {
		super();
		Id = id;
		this.name = addressbookDTO.name;
		this.address = addressbookDTO.address;
		this.phoneNo = addressbookDTO.phoneNo;
		this.email = addressbookDTO.email;
	}
	public AddressBookData()
	{
		
	}
	
}