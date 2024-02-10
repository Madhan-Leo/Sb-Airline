package com.ams.dao;
import org.springframework.data.jpa.repository.JpaRepository;


import com.ams.model.Users;


public interface UserDAO extends JpaRepository<Users, Long> {


	Users findByUserEmail(String userEmail);

	Users findByUserPassword(String userPassword);
}


