package com.example.demo.dao;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.employe;

public interface EmployeRepository  extends CrudRepository <employe,Long> {

}
