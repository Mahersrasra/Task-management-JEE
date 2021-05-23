package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.board;

public interface BoardRepository extends CrudRepository <board,Long> {

}
