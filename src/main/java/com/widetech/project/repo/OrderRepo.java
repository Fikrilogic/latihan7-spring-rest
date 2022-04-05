package com.widetech.project.repo;

import java.util.List;

import com.widetech.project.domain.Order;
import com.widetech.project.domain.Product;

public interface OrderRepo {
	public List<Order>findAll();
	public Order save(Product product);
}
