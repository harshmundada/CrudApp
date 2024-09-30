package com.application.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categories {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long categoriesId;
	private String name;
	
	
	@OneToMany(mappedBy ="categories" , cascade = CascadeType.ALL)
	 private Set<Product> product;
	 
	 
	 
	public Set<Product> getProduct() {
		return product;
	}
	public void setProduct(Set<Product> product) {
		this.product = product;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Categories(String name) {
		super();
		this.name = name;
	}
	
	 public Categories()
	 {
		 
	 }
	@Override
	public String toString() {
		return "Categories [categoriesId=" + categoriesId + ", Name=" + name + "]";
	}
	
	   
}
