package com.widetech.project.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table (name = "orderitemrest_tbl")
public class OrderItem implements Serializable{
	
		
		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE)
		@Column(name = "id")
		private Long id;
		
		@Column(name = "code")
		private String code;
		
		@Column(name = "name")
		private String name;
		
		@Column(name = "type")
		private String type;
		
		@Column(name = "quantity")
		private int quantity;
		
		
		@Column(name = "price")
		private double price;
		
		@ManyToOne()
		@JoinColumn(name="order_id")
		private Order order;
		
		

		public double getTotalprice() {
			return this.price * this.quantity;
		}

		

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getQuantity() {
			return quantity;
		}

		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}

		public Order getOrder() {
			return order;
		}

		public void setOrder(Order order) {
			this.order = order;
		}		
		
		
		
}
