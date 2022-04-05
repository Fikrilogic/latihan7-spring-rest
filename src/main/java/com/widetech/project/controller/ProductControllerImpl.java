package com.widetech.project.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.widetech.project.domain.Product;
import com.widetech.project.service.ProductService;



@RestController
@RequestMapping("/products")
public class ProductControllerImpl implements ProductController {
	
@Autowired
ProductService pService;




@PostMapping("")
@Override
public ResponseEntity<Product> save(Product product) {
	// TODO Auto-generated method stub
	try {
		return ResponseEntity.ok(pService.save(product));
	} catch(Exception e) {
		return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
	}
}

@GetMapping("")
@Override
public ResponseEntity<List<Product>> findAll() {
	return ResponseEntity.ok(pService.findAll());
}

@GetMapping("/{id}")
@Override
public ResponseEntity<Product> findById(Long id) {
	// TODO Auto-generated method stub
	Product product = pService.findById(id);
	
	return ResponseEntity.ok(product);
}

@PutMapping("/{id}")
@Override
public ResponseEntity<Product> updateById(Long id, Product product) {
	// TODO Auto-generated method stub
	return ResponseEntity.ok(pService.update(id, product));
}

@DeleteMapping("/{id}")
@Override
public ResponseEntity<Void> deleteById(Long id) {
	// TODO Auto-generated method stub
	try {
		pService.deleteProduct(id);
		return ResponseEntity.status(HttpStatus.ACCEPTED).build();
	} catch(Exception e) {
		return ResponseEntity.status(HttpStatus.NOT_ACCEPTABLE).build();
	}
}


}