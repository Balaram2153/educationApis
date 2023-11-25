package com.Educationlogin.Api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.basic.contact.repo.ContactRepository;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3002")
public class ContactController {
	
	@Autowired
	ContactRepository loginRepositery;
	
	@PostMapping("/education")
	public ResponseEntity<Login> saveLogin(@RequestBody ContactLogin login){
		
		return new ResponseEntity<>(ContactRepositery.save(login),HttpStatus.CREATED);
		
	}

}
