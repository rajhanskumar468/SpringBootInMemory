package com.poc.h2.repository.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.poc.h2.model.Employee;
import com.poc.h2.repository.EmpRespository;

@Transactional
@Repository
public class EmpRepositoryImpl {

	@Autowired
	EmpRespository repo;
	public Employee createEmp(Employee emp) {
		repo.saveAndFlush(emp);
		return emp;
	}
}
