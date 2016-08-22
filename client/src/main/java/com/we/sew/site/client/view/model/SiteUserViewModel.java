package com.we.sew.site.client.view.model;

import java.util.Date;

/**
 * @author vladyslav
 */
public class SiteUserViewModel {
	private String id;
	private String email;
	private String firstName;
	private String lastName;
	private Date birthDate;
	private String userRole;
	private String countryAbr;
	private String country;
	private String address;
	private String cellNumber;
	private String gender;

	public String getCountryAbr() {
		return countryAbr;
	}

	public void setCountryAbr(String countryAbr) {
		this.countryAbr = countryAbr;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCellNumber() {
		return cellNumber;
	}

	public void setCellNumber(String cellNumber) {
		this.cellNumber = cellNumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
}
