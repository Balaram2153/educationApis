package com.Educationlogin.Api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Educationlogin.Api.Entity.Login;
import com.Educationlogin.Api.Repo.LoginRepository;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class LoginController {
	
	@Autowired
	LoginRepository loginRepositery;
	
	@PostMapping("/education")
	public ResponseEntity<Login> saveLogin(@RequestBody Login login){
		
		return new ResponseEntity<>(loginRepositery.save(login),HttpStatus.CREATED);
		
	}

}