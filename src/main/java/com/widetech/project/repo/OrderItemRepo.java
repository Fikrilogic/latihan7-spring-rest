package com.widetech.project.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.widetech.project.domain.OrderItem;
import com.widetech.project.domain.Product;

public interface OrderItemRepo extends CrudRepository<OrderItem, Long> {
	public List<OrderItem>findAll();
	public OrderItem save(Product product);
}
