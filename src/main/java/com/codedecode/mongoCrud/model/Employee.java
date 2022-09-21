package com.codedecode.mongoCrud.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor

public class Employee {
private int id;
private String name;
private String address;


public Employee(int id, String name, String address) {
	super();
	this.id = id;
	this.name = name;
	this.address = address;
}


@Override
public String toString() {
	return "Employee [id=" + id + ", name=" + name + ", address=" + address + "]";
}

public Employee() {
	super();
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
