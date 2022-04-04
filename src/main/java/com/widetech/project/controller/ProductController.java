package com.widetech.project.controller;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.widetech.project.domain.Product;
import com.widetech.project.service.ProductService;



@RestController
@RequestMapping("/products")
public class ProductController {
	
@Autowired
ProductService pService;

@GetMapping("/")
public List<Product> showProduct() {
	return pService.findAll();
	}

@GetMapping("/show/{id}")
public ResponseEntity<Optional <Product>>showById(@PathVariable Long id){
	try {
		Optional<Product> product = pService.findById(id);
		return new ResponseEntity<Optional <Product>>(product, HttpStatus.OK);
	}catch(NoSuchElementException e){
		return new ResponseEntity<Optional <Product>>(HttpStatus.NOT_FOUND);
		}
	}

@PostMapping("/")
public ResponseEntity<String> saveProduct(@RequestBody Product product){
	pService.save(product);
	return new ResponseEntity<String>(HttpStatus.OK);
	}

@DeleteMapping("/delete/{id}")
public void deleteProduct(@PathVariable Long id) {
	pService.deleteProduct(id);
	}

@PutMapping("/update/{id}")
public Optional<Product> updateProduct(@PathVariable Long id, @RequestBody Product product){
	ResponseEntity.ok(pService.equals(product));
	return pService.findById(id);
	
	}

}