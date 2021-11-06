package com.bridgelabz.addressbook.controller;

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


@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController 
{
	@RequestMapping({"","/","/get"})
	public ResponseEntity<ResponseDTO>  getAddressBookData(){
		AddressBookData addressBookData=null;
		addressBookData= new AddressBookData(1,new AddressBookDTO("Srinadh","Tenali","89898989","srinadh@gmail.com"));
		ResponseDTO respDTO=new ResponseDTO("Get call Success",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}								
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("id") int id){
		AddressBookData addressBookData=null;
		addressBookData= new AddressBookData(1,new AddressBookDTO("Srinadh","Tenali","89898989","srinadh@gmail.com"));
		ResponseDTO respDTO=new ResponseDTO("Get call for ID Success",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}

	@PostMapping("/create")
	public ResponseEntity<ResponseDTO> addAddressBookData(
			@RequestBody AddressBookDTO addressBookDTO)
	{
		AddressBookData addressBookData=null;
		addressBookData= new AddressBookData(1,addressBookDTO);
		ResponseDTO respDTO=new ResponseDTO("Created address Data Successfully",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update") 
	public ResponseEntity<ResponseDTO> updateAddressBookData(@RequestBody AddressBookDTO addressBookDTO){
		AddressBookData addressBookData=null;
		addressBookData= new AddressBookData(1,addressBookDTO);
		ResponseDTO respDTO=new ResponseDTO("Updated  address Data Successfully",addressBookData);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{Id}")
	public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("Id") int Id){
		ResponseDTO respDTO = new ResponseDTO("Deleted Successfully","Deleted Id:"+Id);
		return new ResponseEntity<ResponseDTO>(respDTO,HttpStatus.OK);
	}
}