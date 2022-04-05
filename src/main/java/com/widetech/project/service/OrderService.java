package com.widetech.project.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widetech.project.domain.Order;
import com.widetech.project.domain.Product;
import com.widetech.project.repo.OrderRepo;

@Service
@Transactional
public class OrderService {
	@Autowired
	OrderRepo repo;
	
	public List<Order>findAll(){
		return repo.findAll();
	}
	
	public Order save(Product product) {
		return repo.save(product);
	}
}
