package com.bridgelabz.addressbook.service;


import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.exceptions.AddressBookException;
import com.bridgelabz.addressbook.model.AddressBookData;

@Service
public class AddressBookService implements IAddressBookService {


	List<AddressBookData> addressDataList = new ArrayList<>();
	@Override
	public List<AddressBookData> getAddressBookDataData() {
		return addressDataList;
	}

	@Override
	public AddressBookData getAddressBookDataDataById(int id) {
		return addressDataList.stream()
				.filter(addData ->addData.getId()==id)
				.findFirst()
		         .orElseThrow(() ->new AddressBookException("Address Book not found!"));
	}

	@Override
	public AddressBookData createAddressBookDataData(AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData=null;
		addressBookData = new AddressBookData(addressDataList.size()+1,addressBookDTO);
		addressDataList.add(addressBookData);
		return addressBookData;	
	}

	@Override
	public AddressBookData updatedAddressBookDataData(int id,AddressBookDTO addressBookDTO) {
		AddressBookData addressBookData=this.getAddressBookDataDataById(id);
		addressBookData.setName(addressBookDTO.name);
		addressBookData.setAddress(addressBookDTO.address);
		addressBookData.setEmail(addressBookDTO.email);
		addressBookData.setPhoneNo(addressBookDTO.phoneNo);
		addressDataList.set(id-1, addressBookData);
		return addressBookData;
	}

	@Override
	public void deleteAddressBookDataData(int id) {
		addressDataList.remove(id-1);
	}

}