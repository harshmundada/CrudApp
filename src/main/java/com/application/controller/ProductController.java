package com.application.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.application.dto.ProdcutDTO;
import com.application.model.Product;
import com.application.serviceInterface.ProductServiceInterface;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductServiceInterface productServiceInterface;

	@GetMapping("/")
	public List<Product> viewProduct() {

		List<Product> list = productServiceInterface.viewProductList();
		return list;

	}

	@PostMapping
	public ProdcutDTO addProducts(@RequestBody ProdcutDTO prodcutDTO) {
		System.out.println(prodcutDTO.toString());

		boolean b = productServiceInterface.addProductDetails(prodcutDTO);

		if (b)

			return prodcutDTO;
		else
			return null;

	}

	@GetMapping("/{id}")
	public Optional<Product> findByProductId(@PathVariable("id") long id) {

		Optional<Product> product = productServiceInterface.findByProductId(id);

		if (product.isEmpty())
			return null;
		else
			return product;

	}

	@DeleteMapping("/{id}")
	public String deleteByProductId(@PathVariable("id") long id) {
		boolean b = productServiceInterface.deleteByProductId(id);

		if (b)
			return id + " Id is deleted....";
		else
			return id + " Id is not deleted....";
	}
}
