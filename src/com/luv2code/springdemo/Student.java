package com.luv2code.springdemo;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	
	private String country;
	
	private LinkedHashMap<String, String> countryOption;
	
	private String language;
	
	public Student() {
		
		countryOption = new LinkedHashMap<>();
		countryOption.put("In", "India");

		countryOption.put("Am", "America");

		countryOption.put("En", "England");

		countryOption.put("Eu", "Europe");
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
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LinkedHashMap<String, String> getCountryOption() {
		return countryOption;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	
	
	
}
