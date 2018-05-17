package com.poc.h2.services.impl;

import org.springframework.beans.BeanUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.h2.dto.EmployeeDTO;
import com.poc.h2.model.Employee;
import com.poc.h2.repository.impl.EmpRepositoryImpl;
import com.poc.h2.services.EmpService;

@Service
public class EmpServiceImpl implements EmpService {

	@Autowired
	EmpRepositoryImpl repo;

	@Override
	public EmployeeDTO createEmp(EmployeeDTO empDTO) {
		Employee emp = new Employee();
		BeanUtils.copyProperties(empDTO, emp);
		emp = repo.createEmp(emp);
		BeanUtils.copyProperties(emp, empDTO);
		return empDTO;
	}

}
