package com.example.demo.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee 
{
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY )
Long  id;
@Column(name = "firstName")
String firstName;
@Column(name = "lastName")
String lastName;
@Column(name="salary")
float salary;
@Column(name="years")
int years;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public int getYears() {
	return years;
}
public void setYears(int years) {
	this.years = years;
}

}
