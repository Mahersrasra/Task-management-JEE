package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeRepository;
import com.example.demo.entity.employe;
@Service

public class employeservice {
	@Autowired
	public EmployeRepository emRepositorys;
	public List<employe> getAllemps() {
		
	    List<employe> empss = new ArrayList<>();
		
	    emRepositorys.findAll().forEach(empss::add);
		
	    return empss;		
	}
	public void addcemploye(employe em) {
		
		emRepositorys.save(em);
	}
	public Optional<employe> getemp(Long id) {
	     return emRepositorys.findById(id);
	}
	public void updateemp(Long id, employe ch) {
		emRepositorys.save(ch);
	}
	public void deleteemp(Long id) {
		emRepositorys.deleteById(id);
	}

}
