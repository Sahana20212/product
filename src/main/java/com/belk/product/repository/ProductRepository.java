package com.belk.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.belk.product.entity.Product;

public interface ProductRepository extends JpaRepository<Product, String>{
	

}
