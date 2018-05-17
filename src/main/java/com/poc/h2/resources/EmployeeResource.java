package com.poc.h2.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.poc.h2.dto.EmployeeDTO;
import com.poc.h2.services.EmpService;

@RestController
@RequestMapping("resource/api")
public class EmployeeResource {
	@Autowired
	EmpService service;
	
	/*@GetMapping(value = "/hello")
	public ResponseEntity<String> sayHello(){
		
		return new ResponseEntity<String>("Hello", HttpStatus.OK);
	}*/

	@PostMapping(value = "/createEmp")
	public ResponseEntity<EmployeeDTO> createEmp(@RequestBody EmployeeDTO empDTO) {
		empDTO = service.createEmp(empDTO);
		return new ResponseEntity<EmployeeDTO>(empDTO, HttpStatus.OK);
	}
}
