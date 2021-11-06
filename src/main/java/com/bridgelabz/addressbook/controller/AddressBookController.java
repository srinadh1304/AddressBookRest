package com.bridgelabz.addressbook.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.addressbook.dto.AddressBookDTO;
import com.bridgelabz.addressbook.dto.ResponseDTO;
import com.bridgelabz.addressbook.model.AddressBookData;
import com.bridgelabz.addressbook.service.IAddressBookService;


@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController 
{
	@Autowired
	private IAddressBookService addressBookService;
	
	@RequestMapping({"","/","/get"})
	public ResponseEntity<ResponseDTO>  getAddressBookData(){
		List<AddressBookData> addressBookData=null;
		addressBookData= addressBookService.getAddressBookDataData();
		ResponseDTO respDTO=new ResponseDTO("Get call Success",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}								
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("id") int id){
		AddressBookData addressBookData=null;
		addressBookData= addressBookService.getAddressBookDataDataById(id);
		ResponseDTO respDTO=new ResponseDTO("Get call for ID Success",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(
			@RequestBody AddressBookDTO addressBookDTO)
	{
		AddressBookData addressBookData=null;
		addressBookData= addressBookService.createAddressBookDataData(addressBookDTO);
		ResponseDTO respDTO=new ResponseDTO("Created address Data Successfully",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update") 
	public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData=null;
		addressBookData= addressBookService.updatedAddressBookDataData(addressBookDTO);
		ResponseDTO respDTO=new ResponseDTO("Updated  address Data Successfully",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{Id}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("Id") int Id){
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully","Deleted Id:"+Id);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}