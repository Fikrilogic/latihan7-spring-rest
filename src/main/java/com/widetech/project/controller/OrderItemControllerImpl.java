package com.widetech.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.widetech.project.domain.OrderItem;
import com.widetech.project.service.OrderItemService;

@RestController
@RequestMapping("/orderItems")
public class OrderItemControllerImpl implements OrderItemController{
	
	@Autowired
	OrderItemService oiService;
	
	@PostMapping("")
	@Override
	public ResponseEntity<OrderItem> save(OrderItem item) {
		// TODO Auto-generated method stub
		return null;
	}

	@GetMapping("")
	@Override
	public ResponseEntity<List<OrderItem>> findAll() {
		// TODO Auto-generated method stub
		return ResponseEntity.ok(oiService.findAll());
	}

	@GetMapping("/{id}")
	@Override
	public ResponseEntity<OrderItem> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@PutMapping("/{id}")
	@Override
	public ResponseEntity<OrderItem> updateById(Long id, OrderItem item) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@DeleteMapping("/{id}")
	@Override
	public ResponseEntity<Void> deleteById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
