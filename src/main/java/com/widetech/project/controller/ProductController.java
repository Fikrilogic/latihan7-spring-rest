package com.widetech.project.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.widetech.project.domain.Product;

public interface ProductController {
	
	ResponseEntity<Product> save(@RequestBody Product product);
	ResponseEntity<List<Product>> findAll();
	ResponseEntity<Product> findById(@PathVariable("id") Long id);
	ResponseEntity<Product> updateById(@PathVariable("id")Long id, @RequestBody Product product);
	ResponseEntity<Void> deleteById(@PathVariable("id") Long id);
}
