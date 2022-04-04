package com.widetech.project.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.widetech.project.domain.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {
	
	public List<Product>findAll();
	public Optional<Product> findById(Long id);
	public Product save(Product product);
	
}
