package com.bridgelabz.addressbook.service;

import java.util.List;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;

public interface IAddressBookService {
	List<AddressBookData> getAddressBookDataData();
	AddressBookData getAddressBookDataDataById(int id);
	AddressBookData createAddressBookDataData(AddressBookDTO addressBookDTO);
	AddressBookData updatedAddressBookDataData(AddressBookDTO addressBookDTO);
	void deleteAddressBookDataData(int id);
}