package com.widetech.project.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table (name = "orderrest_tbl")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private Long id;
	
	@Column
	private Date createAt;

	
	@OneToMany (cascade = {CascadeType.ALL})
	private List<OrderItem> orderItem;
	

	public double totalPrice() {
		int totalPrice = 0;
		for(OrderItem item: orderItem) {
			totalPrice += item.getPrice();
		}
		return totalPrice;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public void setDate(Date date) {
		this.createAt = date;
	}
	
	public Date getDate() {
		return this.createAt;
	}

	public List<OrderItem> getOrderItem() {
		return orderItem;
	}

	public void addOrderItem(OrderItem item) {
		this.orderItem.add(item);
	}

	public void setOrderItem(List<OrderItem> orderItem) {
		this.orderItem = orderItem;
	}
	
	
	
	
	
}
