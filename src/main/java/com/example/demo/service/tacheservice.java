package com.example.demo.service;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TacheRepository;

import com.example.demo.entity.tache;
@Service
public class tacheservice {
	@Autowired
	public TacheRepository tacheRepository;
	public List<tache> getAlltaches() {
		
	    List<tache> taches = new ArrayList<>();
		
	    tacheRepository.findAll().forEach(taches::add);
		
	    return taches;		
	}
	public void addtache(tache tache) {
		
		tacheRepository.save(tache);
	}
	public Optional<tache> gettache(Long id) {
	     return tacheRepository.findById(id);
	}
	public void updatetache(Long id, tache ch) {
		tacheRepository.save(ch);
	}
	public void deletetache(Long id) {
		tacheRepository.deleteById(id);
	}

}



