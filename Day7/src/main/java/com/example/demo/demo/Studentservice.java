package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class Studentservice {
@Autowired
Srepository repository;
public Optional<studentstable> getStudent(int Id){
	return repository.findById(Id);
}
public String updateDetails(studentstable stu) {
	repository.save(stu);
	return "updated";
}
public String deleteDetails(int Id) {
	repository.deleteById(Id);
	return "Id deleted";
}
public List<studentstable> setPage(@PathVariable int offset, @PathVariable int pageSize){
Page<studentstable>page=repository.findAll(PageRequest.of(offset,pageSize));
return page.getContent();
}
public List<studentstable> getSort(@PathVariable String field){
	return repository.findAll(Sort.by(Sort.Direction.DESC,field));
}
}

