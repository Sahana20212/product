package com.belk.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.belk.product.entity.Product;
import com.belk.product.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository pr;
	public Product saveProduct(Product product) {
		pr.save(product);
		return product;
		
	}

}
