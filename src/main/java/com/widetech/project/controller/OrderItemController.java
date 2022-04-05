package com.widetech.project.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.widetech.project.domain.OrderItem;

public interface OrderItemController {
	
	ResponseEntity<OrderItem> save(OrderItem item);
	ResponseEntity<List<OrderItem>> findAll();
	ResponseEntity<OrderItem> findById(@PathVariable Long id);
	ResponseEntity<OrderItem> updateById(@PathVariable Long id, @RequestBody OrderItem item);
	ResponseEntity<Void> deleteById(@PathVariable Long id);

}
