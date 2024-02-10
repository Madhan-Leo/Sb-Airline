package com.ams.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ams.model.Login;
import com.ams.model.Users;
import com.ams.dao.UserDAO;

@Service
public class LoginService {

	@Autowired
	private UserDAO dao;

	Login login;

	public Login login(Users user) {
		Users uEmail = dao.findByUserEmail(user.getUserEmail());
		Users pass = dao.findByUserPassword(user.getUserPassword());
		if (uEmail != null && pass != null) {
			String value = uEmail.getUserPassword();
			String confirmPass = pass.getUserPassword();
			if (value.equals(confirmPass)) {
				String uType = uEmail.getUserType();
				if (uType.equalsIgnoreCase("Admin")) {
					return new Login("Admin Login Successfully");
				} else {
					return new Login("User Login Successfully");
				}
			} else {
				return new Login("Login Fail");
			}
		} else {
			return new Login("Login Fail");
		}
	}

}
