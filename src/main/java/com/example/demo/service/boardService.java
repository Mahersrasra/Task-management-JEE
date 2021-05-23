package com.example.demo.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.BoardRepository;
import com.example.demo.entity.board;
@Service

public class boardService {
	@Autowired
	public BoardRepository bRepositorys;
	public List<board> getAllbs() {
		
	    List<board> bs = new ArrayList<>();
		
	    bRepositorys.findAll().forEach(bs::add);
		
	    return bs;		
	}
	public void addboard(board bb) {
		
		bRepositorys.save(bb);
	}
	public Optional<board> getboard(Long id) {
	     return bRepositorys.findById(id);
	}
	public void updateboard(Long id, board ch) {
		bRepositorys.save(ch);
	}
	public void deleteboard(Long id) {
		bRepositorys.deleteById(id);
	}
}
