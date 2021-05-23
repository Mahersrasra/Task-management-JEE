package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.employe;
import com.example.demo.service.employeservice;
@RestController

public class employeController {

	@Autowired
	private employeservice emService;

@RequestMapping(value = "/employes", method=RequestMethod.GET)
  public List<employe> getAllemploye() 
  {		
	return emService.getAllemps();
  }	
@RequestMapping(value = "/employe", method=RequestMethod.POST)
	 public void addemploye(@RequestBody employe cs) {
		emService.addcemploye(cs);
	 }
@RequestMapping(value = "/employe/{id}",method=RequestMethod.GET)
public Optional<employe> getemp(@PathVariable Long id) {
	return emService.getemp(id);
}
@RequestMapping(value = "/employe/{id}", method = RequestMethod.PUT)
public void updateemp(@RequestBody employe cg,@PathVariable Long id ) {
	emService.updateemp(id, cg);
}

@RequestMapping(value = "/employe/{id}", method = RequestMethod.DELETE)
public void deleteemp(@PathVariable Long id) {
	emService.deleteemp(id);
	 	 
}
}
