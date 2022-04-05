package com.widetech.project.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.widetech.project.domain.Order;

public interface OrderRepo extends CrudRepository<Order, Long> {
	public List<Order>findAll();
	@SuppressWarnings("unchecked")
	public Order save(Order order);
}
