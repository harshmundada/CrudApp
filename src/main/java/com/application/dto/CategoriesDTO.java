package com.application.dto;

public class CategoriesDTO {

	private String Name;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	@Override
	public String toString() {
		return "CategoriesDTO [Name=" + Name + "]";
	}
	
	 public CategoriesDTO()
	 {
		 
	 }
	
}
