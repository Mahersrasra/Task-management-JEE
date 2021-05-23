package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entity.tache;
import com.example.demo.service.tacheservice;
@RestController
public class tachecontroller {
	@Autowired
	private tacheservice ttService;

@RequestMapping(value = "/taches", method=RequestMethod.GET)
  public List<tache> getAlltaches() 
  {		
	return ttService.getAlltaches();
  }	
@RequestMapping(value = "/tache", method=RequestMethod.POST)
	 public void addStudent(@RequestBody tache cs) {
		ttService.addtache(cs);
	 }
@RequestMapping(value = "/tache/{id}",method=RequestMethod.GET)
public Optional<tache> gettache(@PathVariable Long id) {
	return ttService.gettache(id);
}
@RequestMapping(value = "/tache/{id}", method = RequestMethod.PUT)
public void updatetache(@RequestBody tache cg,@PathVariable Long id ) {
	ttService.updatetache(id, cg);
}

@RequestMapping(value = "/tache/{id}", method = RequestMethod.DELETE)
public void deletetache(@PathVariable Long id) {
	ttService.deletetache(id);
	 	 
}



}
