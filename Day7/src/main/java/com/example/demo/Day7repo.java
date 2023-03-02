package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface Day7repo extends JpaRepository<Day7Table,Long>{
public List<Day7Table> findByDeptAndName(String d, String n);
public List<Day7Table> findByDeptToName(String d, String n);
public List<Day7Table> findByInName(List<String> n);
public List<Day7Table> findByNameStartingWith(String n);
public List<Day7Table> findByNameEndingWith(String n);

@Query ("select p from Employee p")
public List<Day7Table> getallusers();

@Query ("select p from Employee p where p.name=:a")
public List<Day7Table> getallusername(@Param("a") String name,@Param("a1") String name1);
@Modifying
@Query ("UPDATE Employee p set p.salary=:s where c.id=:d")
public int getallusersalary(@Param ("s") int sal, @Param("d") int id);
}

