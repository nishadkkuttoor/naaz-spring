package com.codedecode.mongoCrud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.codedecode.mongoCrud.model.Employee;
import com.codedecode.mongoCrud.repository.EmployeeRepository;
@Service
public class employeeService {
@Autowired
private EmployeeRepository employeeRepository;
public Employee saveOrUpdate(Employee emp) {
	return employeeRepository.save(emp);
}
public Employee Update(Employee emp) {
	return employeeRepository.save(emp);
}

public List<Employee> findAll(){
	return employeeRepository.findAll();
}

public Employee getEmployeeById(int id) {
	   return employeeRepository.findById(id).get();
	}
public void deleteAll(){
 employeeRepository.deleteAll();
}


public void deleteById(int id){
	 employeeRepository.deleteById(id);
}
}
