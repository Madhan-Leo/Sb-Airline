package com.ams.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.dao.UserDAO;
import com.ams.model.Users;

@Service
public class UserService {
	
	@Autowired
	UserDAO userdao;
	
	
	public boolean performInsert(Users newUser) {

		userdao.save(newUser);
		return true;

	}
	
	public boolean updateUser(Users updateUser) {
		userdao.save(updateUser);
		return true;
	}
	
	public boolean deleteUser(Long userId) {
		userdao.deleteById(userId);
		return true;
	}
	
	public List<Users> getAll() {
		Iterator<Users> it =  userdao.findAll().iterator();
		List<Users> list = new ArrayList<Users>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
