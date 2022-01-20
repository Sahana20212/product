package com.belk.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.belk.product.entity.Product;
import com.belk.product.service.ProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	ProductService service;
   @PostMapping("/addproduct")
   public Product saveProduct(@RequestBody Product product) throws Exception {
	   validateRequest( product);
	   System.out.println(product.getId());
	   service.saveProduct(product);
	   return product;
	   
   }
   @GetMapping("/getProducts")
   public List<Product> getAllProducts(){
	   
	   ArrayList<Product> allProducts=null;
	     return allProducts;  
   }
   
   public void validateRequest(Product product) throws Exception {
	   if(product.getName().equals("")) {
		   System.out.println("Invalid Request");
		   throw new Exception();
	   }
   }
	
}
