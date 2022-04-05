package com.widetech.project.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.widetech.project.domain.Order;
import com.widetech.project.domain.OrderItem;

public interface OrderController {
	
	ResponseEntity<Order> save(@RequestBody Order order);
	ResponseEntity<Order> createItemOnOrder(@PathVariable Long id, @RequestBody OrderItem item);
	ResponseEntity<List<Order>> findAll();
	ResponseEntity<Order> findById(@PathVariable Long id);
	ResponseEntity<Void> deleteById(@PathVariable Long id);
	
}
