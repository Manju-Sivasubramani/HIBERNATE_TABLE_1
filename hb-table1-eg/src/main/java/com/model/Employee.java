package com.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;

@Entity
@Table(name="employee102")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
private String name;
public Employee() {
	// TODO Auto-generated constructor stub
}
public Employee(String name) {
	super();
	this.name = name;
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


}
