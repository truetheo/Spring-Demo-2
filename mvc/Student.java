package com.a.springdemo.mvc;

import java.util.LinkedHashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;

public class Student {
	
	private String firstName;
	private String lastName;
	private String country;
	
	private String favoriteLanguage;
	
	private String[] operatingSystems;
	// countries from HashMap
	//private LinkedHashMap<String, String> countryOptions;
	// countries from properties file
	
	
	
	public Student() {
		super();
		
		/**
		//populate country options: used ISO country code
		//HashMap Key:Value
		countryOptions = new LinkedHashMap<>();
		
		countryOptions.put("BR", "Brazil");
		countryOptions.put("UK", "United Kingdom");
		countryOptions.put("PL", "Poland");
		countryOptions.put("US", "USA");
		countryOptions.put("IN", "India");
		*/
		
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	//public LinkedHashMap<String, String> getCountryOptions() {
	//	return countryOptions;
	//}
	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}
	public void setFavoriteLanguage(String favouriteLanguage) {
		this.favoriteLanguage = favouriteLanguage;
	}
	public String[] getOperatingSystems() {
		return operatingSystems;
	}
	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}
	
	
	
	

}
