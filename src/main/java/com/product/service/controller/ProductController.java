package com.product.service.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.product.service.dao.CustomerProductORepository;
import com.product.service.dao.ProductRepository;
import com.product.service.model.CustomerProductO;
import com.product.service.model.Product;

@RestController
@RequestMapping("/product")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CustomerProductORepository customerProductORepository;
	
	
	
	@PostMapping("saveProduct")
	public Product saveProduct(@RequestBody Product product)
	{
		System.out.println("Producy  obj:"+product.toString());
		return productRepository.save(product);
	}
	
	@GetMapping("getAllProducts")
	public List<Product> getAllProducts()
	{
		return productRepository.findAll();
		
	}
	
	@GetMapping("getProductById/{Id}")
	public Optional<Product> getAllProductByProductID(@PathVariable Integer Id)
	{
		return productRepository.findById(Id);
		
	}
	
	
	@PostMapping("/saveOrder")
	public CustomerProductO saveOrder(@RequestBody CustomerProductO customerProductO)
	{
	
		System.out.println("customer order obj:"+customerProductO.toString());
		return customerProductORepository.save(customerProductO);
	}
	
	
	@GetMapping("/getAllOrders")
	public List<CustomerProductO> getAllOrders()
	{
		
		return customerProductORepository.findAll();
	}
	
	
}
