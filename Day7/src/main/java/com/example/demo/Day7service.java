package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Day7service {
@Autowired
Day7repo repository;
public List<Day7Table> findByDeptandName(String d, String n){
	return repository.findByDeptAndName(d,n);
}
public List<Day7Table> findByNameIn(List<String> n){
	return repository.findByInName(n);
}
public List<Day7Table> findByNameStartingWith(String n){
	return repository.findByNameStartingWith(n);
}
public List<Day7Table> findByNameEndingWith(String n){
	return repository.findByNameEndingWith(n);
}
public List<Day7Table> getallusers(){
	return repository.getallusers();
}
public List<Day7Table> getallusernames(String str1, String str2){
	return repository.getallusername(str1,str2);
}
public int getallusersalary(int n,int s) {
	return repository.getallusersalary(n, s);
}
}
