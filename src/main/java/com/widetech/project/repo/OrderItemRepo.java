package com.widetech.project.repo;

import java.util.List;

import com.widetech.project.domain.OrderItem;
import com.widetech.project.domain.Product;

public interface OrderItemRepo {
	public List<OrderItem>findAll();
	public OrderItem findById(Long id);
	public OrderItem save(Product product);
	public OrderItem deleteById(Long id);
}
