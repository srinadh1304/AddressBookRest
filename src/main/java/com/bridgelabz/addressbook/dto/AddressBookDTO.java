package com.bridgelabz.addressbook.dto;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

public class AddressBookDTO {
	
	@NotEmpty(message="Name cannot be null")
	@Pattern(regexp = "^[A-Z|a-z]{2,}$",message ="Name Invalid")
    public String name;
	
	@Pattern(regexp = "^[A-Z|a-z]{3,}$",message ="Address Invalid")
    public String address;
    
    @Pattern(regexp = "^(\\+\\d{2}|\\d{2})?\\d{10}$",message ="Phone number Invalid")
    public String phoneNo;
    
    @Pattern(regexp = "^[a-zA-Z]*[@][.a-zA-z]*$",message ="Email Invalid")
    public String email;

	public String city;
	public String state;

	@NotEmpty(message = "zip cannot be null")
	@Pattern(regexp = "[0-9]{3}[ ]?[0-9]{3}$",message = "Zip Invalid")
	public String zip;

	public AddressBookDTO(String name,String address,	String phoneNo,String email, String city,String state, String zip) {
		super();
		this.name = name;
		this.address = address;
		this.phoneNo = phoneNo;
		this.email = email;
		this.city = city;
		this.state = state;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "AddressBookDTO [name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", email=" + email
				+ ", city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}
	

	
}
