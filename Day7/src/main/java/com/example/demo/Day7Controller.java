package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.transaction.Transactional;

@RestController
public class Day7Controller {
@Autowired
Day7repo servicerepository;
@Autowired
Day7service service;
@GetMapping("/findname/{name}/{dept}")

public List<Day7Table>finddetails(@PathVariable String name,@PathVariable String dept){

return service.findByDeptandName(dept, name);

}
public List<Day7Table> findByNameIn(@RequestParam("name")List<String> n){
	List<Day7Table> t1=service.findByNameIn(n);
	return t1;
}
public List<Day7Table> findByNameStartingWith(@RequestParam("name")String n){
	List<Day7Table> t2=service.findByNameStartingWith(n);
	return t2;
}
public List<Day7Table> findByNameEndingWith(@RequestParam("name")String n){
	List<Day7Table> t3=service.findByNameEndingWith(n);
	return t3;
}
@GetMapping("/findusers")
public List<Day7Table> getallusers(){
	return service.getallusers();
}
@GetMapping("/findallusername")
public List<Day7Table> getallusername(@PathVariable String str1, @PathVariable String str2){
	return service.getallusernames(str1, str2);
}
@Transactional
@PutMapping("/findsalary/{sal}/{id}")
public String getalluserlist(@PathVariable("sal")int sal,@PathVariable int id) {
	String res="";
	int result=service.getallusersalary(sal,id );
	if(result>0) {
		res="Salary updated"+result;
		System.err.println(res);
	}
	else {
		res="Not updated"+result;
		System.err.println(res);
	}
	return res;
}

}




