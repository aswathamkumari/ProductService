package com.product.service.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import com.product.service.model.Product;

public interface ProductRepository extends JpaRepository<Product,Integer>{

}
