package com.ams.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.model.Users;
import com.ams.dao.UserDAO;

@Service
public class RegisterService {

	@Autowired
	UserDAO dao;

	public boolean Register(Users user) {
		dao.save(user);
		return true;
	}

	public List<Users> getAll() {
		Iterator<Users> it = dao.findAll().iterator();
		List<Users> list = new ArrayList<Users>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;

	}

}
