package com.poc.h2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.h2.model.Employee;

public interface EmpRespository extends JpaRepository<Employee, Long>{
}
