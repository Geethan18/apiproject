package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Employee")
public class Day7Table {
@Id
private int no;
private String name;
private int salary;
private String dept;
public Day7Table(int no, String name, int salary, String dept) {
	super();
	this.no = no;
	this.name = name;
	this.salary = salary;
	this.dept = dept;
}
public Day7Table() {
	super();
	// TODO Auto-generated constructor stub
}
public int getNo() {
	return no;
}
public void setNo(int no) {
	this.no = no;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}

}
