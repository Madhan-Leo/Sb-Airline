package com.ams.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ams.model.Login;
import com.ams.model.Users;
import com.ams.service.LoginService;


@RestController
@RequestMapping("/user")
@CrossOrigin("http://localhost:4200/")

public class LoginController {
	@Autowired
	private LoginService service;

	@RequestMapping("/login")
	public ResponseEntity<?> performLogin(@RequestBody Users user) {
		Login res=service.login(user);
			return ResponseEntity.ok(res);
	}

}
