package com.widetech.project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

	@Entity
	@Table (name = "productrest_tbl")
	public class Product {
		
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
		
		@Column(name = "price")
		private double price;

		
		
		public Product(Long id, String code, String name, String type, double price) {
			this.id = id;
			this.code = code;
			this.name = name;
			this.type = type;
			this.price = price;
		}
		
		public Product() {
			
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

		public double getPrice() {
			return price;
		}

		public void setPrice(double price) {
			this.price = price;
		}
		
	}
