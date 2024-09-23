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
		ProductName = productName;
	}
	public String getManufacturingDate() {
		return ManufacturingDate;
	}
	public void setManufacturingDate(String manufacturingDate) {
		ManufacturingDate = manufacturingDate;
	}
	public long getPrice() {
		return Price;
	}
	public void setPrice(long price) {
		Price = price;
	}
	public String getExpDate() {
		return ExpDate;
	}
	public void setExpDate(String expDate) {
		ExpDate = expDate;
	}
	
	
	public long getCategoriesId() {
		return CategoriesId;
	}
	public void setCategoriesId(long categoriesId) {
		CategoriesId = categoriesId;
	}
	@Override
	public String toString() {
		return "ProdcutDTO [ProductName=" + ProductName + ", ManufacturingDate=" + ManufacturingDate + ", Price="
				+ Price + ", ExpDate=" + ExpDate + ", CategoriesId=" + CategoriesId + "]";
	}
	
	
	
}
