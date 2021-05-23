package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.chef;
import com.example.demo.service.ChefService;
@RestController
public class chefController {
	@Autowired
	private ChefService cheftService;

	 @RequestMapping(value = "/chefs", method=RequestMethod.GET)
	   public List<chef> getAllchefs() 
	   {		
		return cheftService.getAllchefs();
	   }	
	 @RequestMapping(value = "/chef", method=RequestMethod.POST)
		 public void addStudent(@RequestBody chef cs) {
			 cheftService.addchef(cs);
		 }
	 
	 @RequestMapping(value = "/chef/{id}",method=RequestMethod.GET)
	 public Optional<chef> getchef(@PathVariable Long id) {
	 	return cheftService.getcheff(id);
	 }
	 @RequestMapping(value = "/chef/{id}", method = RequestMethod.PUT)
	 public void updatechef(@RequestBody chef cg,@PathVariable Long id ) {
		 cheftService.updateChef(id, cg);
	 }
	 
	 @RequestMapping(value = "/chef/{id}", method = RequestMethod.DELETE)
	 public void deletechef(@PathVariable Long id) {
		 cheftService.deletechef(id);
		 	 
	 }

}
