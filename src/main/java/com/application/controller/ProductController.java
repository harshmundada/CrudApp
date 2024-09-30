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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.application.dto.ProdcutDTO;
import com.application.model.Product;
import com.application.serviceInterface.ProductServiceInterface;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductServiceInterface productServiceInterface;


    @GetMapping
    public ResponseEntity<Page<Product>> viewProduct(
            @RequestParam(name = "page", defaultValue = "0") int page,
            @RequestParam(name = "size", defaultValue = "10") int size) {
        
        Pageable pageable = PageRequest.of(page, size);
        Page<Product> productPage = productServiceInterface.getAllProducts(pageable);

        return new ResponseEntity<>(productPage, HttpStatus.OK);
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
