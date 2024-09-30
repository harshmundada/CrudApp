package com.application.dto;

public class ProdcutDTO {

	
	private String ProductName;
	private String ManufacturingDate;
	private long Price;
	private String ExpDate;
	private long CategoriesId;
	
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		this.ProductName = productName;
	}
	public String getManufacturingDate() {
		return ManufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		this.ManufacturingDate = manufacturingDate;
	}
	public long getPrice() {
		return Price;
	}
	public void setPrice(long price) {
		this.Price = price;
	}
	public String getExpDate() {
		return ExpDate;
	}
	public void setExpDate(String expDate) {
		this.ExpDate = expDate;
	}
	
	
	public long getCategoriesId() {
		return CategoriesId;
	}
	public void setCategoriesId(long categoriesId) {
		this.CategoriesId = categoriesId;
	}
	@Override
	public String toString() {
		return "ProdcutDTO [ProductName=" + ProductName + ", ManufacturingDate=" + ManufacturingDate + ", Price="
				+ Price + ", ExpDate=" + ExpDate + ", CategoriesId=" + CategoriesId + "]";
	}
	
	
	
}
