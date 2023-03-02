package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Child;
import com.example.demo.Repositories.ChildRepo;
import com.example.demo.Services.ApiService;





public class ApiController {
	@RestController

	public class Studentcontroller {

	@Autowired

	ChildRepo serviceRepository;

	@Autowired
	ApiService service;


	@PostMapping("/")

	public Child create(@RequestBody Child stu) {

	return serviceRepository.save(stu);


	}
	@GetMapping("/getvalue/{babyId}")

	public Optional <Child> getStudent(int babyId){
		return service.getStudent(babyId);
	}
	@GetMapping("/student/{offset}/{pageSize}")
	public List<Child> studentwithPagination(@PathVariable int offset, @PathVariable int pageSize){
		return service.setPage(offset, pageSize);
	}
	@GetMapping("/studentstable/{field}")
	public List<Child> studentSort(@PathVariable String field){
		return service.getSort(field);
	}
}
}
