package com.widetech.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.widetech.project.domain.Order;
import com.widetech.project.domain.OrderItem;
import com.widetech.project.service.OrderService;

@RestController
@RequestMapping("orders")
public class OrderControllerImpl implements OrderController{
	
	@Autowired
	OrderService oService;
	
	@PostMapping("")
	@Override
	public ResponseEntity<Order> save(Order order) {
		// TODO Auto-generated method stub
		try {
			System.out.println(order.getOrderItem().size());
			return ResponseEntity.ok(oService.save(order));
		} catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	@PostMapping("/{id}")
	@Override
	public ResponseEntity<Order> createItemOnOrder(Long id, OrderItem item) {
		// TODO Auto-generated method stub
		
		try {
			return ResponseEntity.ok(oService.addItem(id, item));
		} catch(Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}



	@GetMapping("")
	@Override
	public ResponseEntity<List<Order>> findAll() {
		// TODO Auto-generated method stub
		try {
			return ResponseEntity.ok(oService.findAll());
		} catch(Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@GetMapping("/{id}")
	@Override
	public ResponseEntity<Order> findById(Long id) {
		// TODO Auto-generated method stub
		try {
			return ResponseEntity.ok(oService.findById(id));
		} catch(Exception e) {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/{id}")
	@Override
	public ResponseEntity<Void> deleteById(Long id) {
		// TODO Auto-generated method stub
		
		try {
			oService.delete(id);
			return ResponseEntity.status(HttpStatus.OK).build();
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
}
