package com.widetech.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widetech.project.domain.Product;
import com.widetech.project.repo.ProductRepo;


@Service
@Transactional
public class ProductService {
	@Autowired
	ProductRepo repo;
	
	public List<Product> findAll() {
		return repo.findAll();
	}
	
	public Product findById(Long id){
		return repo.findById(id).get();
	}
	
	public Product save(Product product) {
	return repo.save(product);
	}
	
	public void deleteProduct(Long id) {
		repo.deleteById(id);
	}
}
