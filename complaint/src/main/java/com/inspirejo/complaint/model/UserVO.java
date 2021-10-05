package com.inspirejo.complaint.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserVO {
	@Id
	private long userId;
	//@Email(message = "Email should be valid")
	//@NotEmpty(message = "Email cannot be null")
	private String email;
	private String password;
	private String name;
	private String education;
	private String phoneNumber;
	private String gender;
	private boolean isAdmin; // this will be setting after sign-up\log-in
	private String address;

	private transient List<AuthoritiesVO> authorities = new ArrayList<AuthoritiesVO>();

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public void setIsAdmin(boolean isAdmin) {
		this.isAdmin = isAdmin;
	}

	public boolean getIsAdmin() {
		return isAdmin;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password=" + password + ", name=" + name
				+ ", education=" + education + ", phoneNumber=" + phoneNumber + ", gender=" + gender + ", isAdmin="
				+ isAdmin + ", address=" + address + ", authorities=" + authorities + "]";
	}

	public List<AuthoritiesVO> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<AuthoritiesVO> authorities) {
		this.authorities = authorities;
	}

}