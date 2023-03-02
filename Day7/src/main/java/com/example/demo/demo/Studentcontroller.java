package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class Studentcontroller {

@Autowired

Srepository serviceRepository;

@Autowired
Studentservice service;

@GetMapping("/getvalues")

List<studentstable>getList()

{

return serviceRepository.findAll();

}

@PostMapping("/post")

public studentstable create(@RequestBody studentstable stu) {

return serviceRepository.save(stu);


}
@GetMapping("/getvalues/{Id}")

public Optional <studentstable> getStudent(int Id){
	return service.getStudent(Id);
}
@PutMapping("/student")
public String update(@RequestBody studentstable stu) {
	return service.updateDetails(stu);
}
@DeleteMapping("/student")
public String delete(@RequestParam int Id) {
	return service.deleteDetails(Id);
}
@GetMapping("/student/{offset}/{pageSize}")
public List<studentstable> studentwithPagination(@PathVariable int offset, @PathVariable int pageSize){
	return service.setPage(offset, pageSize);
}
@GetMapping("/studentstable/{field}")
public List<studentstable> studentSort(@PathVariable String field){
	return service.getSort(field);
}
}
	