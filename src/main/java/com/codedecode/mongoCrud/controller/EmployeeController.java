package com.codedecode.mongoCrud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.codedecode.mongoCrud.model.Employee;
import com.codedecode.mongoCrud.service.employeeService;

@RestController
public class EmployeeController {
@Autowired
private employeeService employeeService;

@PostMapping
public ResponseEntity<Employee> saveOrUpdate(@RequestBody Employee emp){  
	System.out.println("PostMapping...");
	return new ResponseEntity<Employee>(employeeService.saveOrUpdate(emp),HttpStatus.OK);
}
@GetMapping
public ResponseEntity<List<Employee>>findAll(){
	return new ResponseEntity<List<Employee>>(employeeService.findAll(),HttpStatus.ACCEPTED); 	
}
@DeleteMapping
public ResponseEntity<String> deleteAll( Employee emp){
	employeeService.deleteAll();
	return new ResponseEntity<String>("record deleted",HttpStatus.ACCEPTED);
}

@DeleteMapping("/employee/{id}")
public ResponseEntity<String> deleteById(@PathVariable("id") int id){
	employeeService.deleteById(id);
	return new ResponseEntity<String>("one item deleted",HttpStatus.ACCEPTED);
}
}
