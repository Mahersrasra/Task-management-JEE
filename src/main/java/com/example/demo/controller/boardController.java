package com.example.demo.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.board;

import com.example.demo.service.boardService;
@RestController

public class boardController {
	@Autowired
	private boardService bService;

@RequestMapping(value = "/boards", method=RequestMethod.GET)
  public List<board> getbs() 
  {		
	return bService.getAllbs();
  }	
@RequestMapping(value = "/board", method=RequestMethod.POST)
	 public void addeb(@RequestBody board cs) {
		bService.addboard(cs);
	 }
@RequestMapping(value = "/board/{id}",method=RequestMethod.GET)
public Optional<board> getboard(@PathVariable Long id) {
	return bService.getboard(id);
}
@RequestMapping(value = "/board/{id}", method = RequestMethod.PUT)
public void updatechef(@RequestBody board cg,@PathVariable Long id ) {
	bService.updateboard(id, cg);
}

@RequestMapping(value = "/board/{id}", method = RequestMethod.DELETE)
public void deleteboard(@PathVariable Long id) {
	bService.deleteboard(id);
	 	 
}
}
