package com.application.serviceInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.application.dto.ProdcutDTO;
import com.application.model.Categories;
import com.application.model.Product;
import com.application.repository.CategoriesRopository;
import com.application.repository.ProdcutRepository;

@Service
public class ProductServiceImpl implements ProductServiceInterface {

	@Autowired
	private ProdcutRepository prodcutRepository;
	
	@Autowired
	CategoriesRopository  categoriesRopository; 
	
	

	@Override
	public boolean addProductDetails(ProdcutDTO prodcutDTO) {

		try {
			
			
			Categories category =  categoriesRopository.findById(prodcutDTO.getCategoriesId()).get();
			
			Product p = new Product(prodcutDTO.getProductName(), prodcutDTO.getManufacturingDate(), prodcutDTO.getPrice(), prodcutDTO.getExpDate(),category);
			
			prodcutRepository.save(p);
			return true;
		} catch (Exception ex) {
			System.out.println("Repository Exception is " + ex);
			return false;
		}

	}

	@Override
	public List<Product> viewProductList() {
		return prodcutRepository.findAll();
	}

	@Override
	public Optional<Product> findByProductId(long id) {

		Optional<Product> product = prodcutRepository.findById(id);
		return product;
	}

	@Override
	public boolean deleteByProductId(long id) {

		try {
			prodcutRepository.deleteById(id);
			return true;
		} catch (Exception ex) {
			return false;
		}

	}


}
