package com.example.demo.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Models.Child;
import com.example.demo.Repositories.ChildRepo;



@Service
public class ApiService {
	@Autowired
	ChildRepo repository;
	public Optional<Child> getStudent(int babyId){
		return repository.findById(babyId);
	}

	public List<Child> setPage(@PathVariable int offset, @PathVariable int pageSize){
	Page<Child>page=repository.findAll(PageRequest.of(offset,pageSize));
	return page.getContent();
	}
	public List<Child> getSort(@PathVariable String field){
		return repository.findAll(Sort.by(Sort.Direction.DESC,field));
	}
}
