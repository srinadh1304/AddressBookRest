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

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController 
{
	@RequestMapping({"","/","/get"})
	public ResponseEntity<String>  getAddressBookData(){
		return new ResponseEntity<String>("Get call success",HttpStatus.OK);
	}
	
	@GetMapping("/get/{empId}")
	public ResponseEntity<String> getAddressBookData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Get call success for id:"+empId,HttpStatus.OK);
	
	}
	
	@PostMapping("/create")
	public ResponseEntity<String> addAddressBookData(@RequestBody AddressBookDTO empPayrollDTO)
	{
		return new ResponseEntity<String>("Created Employee Payroll Data for:"+empPayrollDTO,HttpStatus.OK);
	}
	
	@PutMapping("/update") 
	public ResponseEntity<String> updateAddressBookData(@RequestBody AddressBookDTO empPayrollDTO){
		return new ResponseEntity<String>("Updated Employee Payroll Data for:"+empPayrollDTO,HttpStatus.OK);
		
	}
	
	@DeleteMapping("/delete/{empId}")
	public ResponseEntity<String> deleteAddressBookData(@PathVariable("empId") int empId){
		return new ResponseEntity<String>("Delete Call Success for id:"+empId,HttpStatus.OK);
	}
}