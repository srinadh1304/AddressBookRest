package com.bridgelabz.addressbook.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {

	@Override
	public List<AddressBookData> getAddressBookDataData() {
		List<AddressBookData> addressDataList = new ArrayList<>();
		addressDataList.add(new AddressBookData(1,new AddressBookDTO("Shruthi", "BTM","78998","Shru@gmail.com")));
		return addressDataList;
	}

	@Override
	public AddressBookData getAddressBookDataDataById(int id) {
		AddressBookData addressBookData = null;
		addressBookData = new AddressBookData(1,new AddressBookDTO("Shruthi", "BTM","78998","Shru@gmail.com"));
		return addressBookData;
	}

	@Override
	public AddressBookData createAddressBookDataData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData=null;
		addressBookData = new AddressBookData(1,addressBookDTO);
	
		return addressBookData;	
	}

	@Override
	public AddressBookData updatedAddressBookDataData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData=null;
		addressBookData = new AddressBookData(1,addressBookDTO);
		return null;
	}

	@Override
	public void deleteAddressBookDataData(int id) {
		// TODO Auto-generated method stub
		
	}

}