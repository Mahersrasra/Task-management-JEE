package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.ChefRepository;
import com.example.demo.entity.chef;
@Service
public class ChefService {
	@Autowired
	public ChefRepository ChefRepositorys;
	public List<chef> getAllchefs() {
		
	    List<chef> chefs = new ArrayList<>();
		
	    ChefRepositorys.findAll().forEach(chefs::add);
		
	    return chefs;		
	}
	public void addchef(chef Chef) {
		
		ChefRepositorys.save(Chef);
	}
	public Optional<chef> getcheff(Long id) {
	     return ChefRepositorys.findById(id);
	}
	public void updateChef(Long id, chef ch) {
		ChefRepositorys.save(ch);
	}
	public void deletechef(Long id) {
		ChefRepositorys.deleteById(id);
	}
}
