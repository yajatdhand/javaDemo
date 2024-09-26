package com.nag.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nag.demo.entity.Employee;
import com.nag.demo.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	EmployeeRepository repo;

	@GetMapping("/search")
	public List<Employee> searchEmployee(@Param("id") int id, @Param("name") String name) {
		System.out.println(id + " " + name);
		return repo.getEmployeeByIdAndName(id, name);
	}

}
