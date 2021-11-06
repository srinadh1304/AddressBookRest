package com.bridgelabz.addressbook.dto;
public class AddressBookDTO {
	
    public String name;
    public String address;
    public String phoneNo;
    public String email;

	public AddressBookDTO(String name, String address, String phoneNo, String email) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", email=" + email
				+ "]";
	}

	
}