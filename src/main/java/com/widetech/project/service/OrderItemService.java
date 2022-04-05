package com.widetech.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widetech.project.domain.OrderItem;
import com.widetech.project.domain.Product;
import com.widetech.project.repo.OrderItemRepo;

@Service
public class OrderItemService {
	@Autowired
	OrderItemRepo repo;
	
	public List<OrderItem>findAll(){
		return repo.findAll();
	}
	
	public OrderItem save(Product product) {
		return repo.save(product);
		}
		
		public void deleteProduct(Long id) {
			repo.deleteById(id);
		}
}
