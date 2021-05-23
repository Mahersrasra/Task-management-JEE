package com.example.demo.dao;


import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.chef;

public interface ChefRepository extends CrudRepository<chef,Long> {
	
	
}
