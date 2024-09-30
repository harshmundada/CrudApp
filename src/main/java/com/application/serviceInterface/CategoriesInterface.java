package com.application.serviceInterface;

import java.util.List;


import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

import com.application.dto.CategoriesDTO;
import com.application.model.Categories;

public interface CategoriesInterface {

	public  boolean  addCategories(CategoriesDTO dCtegoriesDTO);

	public boolean deleteCategoriesById(long id);

	public boolean updateCategories(CategoriesDTO categoriesDTO, long id);

	public Categories findbyCategoriesId(long id);

	Page<Categories> getAllCategories(Pageable pageable);
	
	
   
	
}
