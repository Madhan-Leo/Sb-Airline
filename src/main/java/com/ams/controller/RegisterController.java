package com.ams.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.ams.model.Users;
import com.ams.service.RegisterService;

@RestController
@CrossOrigin("http://localhost:4200/")
public class RegisterController {

	@Autowired
	RegisterService service;
	
	@PostMapping("/Register")
	public String performRegister(@RequestBody Users user) {
		
		service.Register(user);
		return "inserted";
	}

	
	@GetMapping("/ViewAllRegistrations")
	public List<Users> getAll() {
		Iterator<Users> it =  service.getAll().iterator();
		List<Users> list = new ArrayList<Users>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
}
}
