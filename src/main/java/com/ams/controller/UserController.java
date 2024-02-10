package com.ams.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ams.model.Users;
import com.ams.service.UserService;

@RestController
@CrossOrigin

public class UserController {
	@Autowired
	UserService service;

	@PostMapping("/insert")
	public void performInsert(@RequestBody Users newUser) {

		service.performInsert(newUser);

	}

	@PutMapping("/updateUser")
	public void updateUser(@RequestBody Users updateUser) {

		service.updateUser(updateUser);
	}

	@DeleteMapping("/deleteUser/{id}")

	public void deleteBookingByID(@PathVariable("id") Long userId) {
		service.deleteUser(userId);
	}

	@GetMapping("/viewAllUsers")
	public List<Users> getAll() {
		Iterator<Users> it = service.getAll().iterator();
		List<Users> list = new ArrayList<Users>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
