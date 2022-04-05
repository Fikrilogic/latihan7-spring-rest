package com.widetech.project.service;

import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.widetech.project.domain.Order;
import com.widetech.project.domain.OrderItem;
import com.widetech.project.repo.OrderRepo;

@Service
@Transactional
public class OrderService {
	@Autowired
	OrderRepo repo;
	
	public List<Order>findAll(){
		return repo.findAll();
	}
	
	public Order findById(Long id) {
		return repo.findById(id).get();
	}
	
	public Order save(Order order) {
		order.setDate(new Date());
		return repo.save(order);
	}
	
	public Order addItem(Long id, OrderItem item) {
		Order order = repo.findById(id).get();
		order.addOrderItem(item);
		return repo.save(order);
	}
	
	public void delete(Long id) throws Exception {
		repo.deleteById(id);
	}
}
