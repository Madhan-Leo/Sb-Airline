package com.ams.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table(name = "tbl_user")
public class Users {

	@Id
	@Column(name = "user_id")
	private int userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "user_password")
	private String userPassword;
	@Column(name = "user_type")
	private String userType;
	@Column(name = "user_phoneno")
	private String userPhoneno;
	@Column(name = "user_emailid")
	private String userEmail;

	public Users() {
		super();
	}

	

	

	public Users(int userId, String userName, String userPassword, String userType, String userPhoneno, String userEmail) {
	super();
	this.userId = userId;
	this.userName = userName;
	this.userPassword = userPassword;
	this.userType = userType;
	this.userPhoneno = userPhoneno;
	this.userEmail = userEmail;
}
	
	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserPhoneno() {
		return userPhoneno;
	}

	public void setUserPhoneno(String userPhoneno) {
		this.userPhoneno = userPhoneno;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	@Override
	public String toString() {
		return "Users [userId=" + userId + ", userName=" + userName + ", userPassword=" + userPassword + ", userType="
				+ userType + ", userPhoneno=" + userPhoneno + ", userEmail=" + userEmail + "]";
	}

}
