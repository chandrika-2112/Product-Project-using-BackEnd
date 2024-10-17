package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class ProductController {

	@Autowired
	private ProductServices service;
	
	@PostMapping("/save")
	public Product saveProduct(@RequestBody Product product) {
		return service.saveProduct(product);
	}
	
	@GetMapping("/allProducts")
	public List<Product> getAllProducts(){
		return service.getAllProducts();
	}
	
	@DeleteMapping("/delete/{pid}")
	public String delete(@PathVariable int pid) {
		service.delete(pid);
		return "Product Deleted Successfully...";
	}
	
	@GetMapping("/product/{pid}")
	public Product getProduct(@PathVariable int pid) {
		return service.getProduct(pid);
	}
	
	@PutMapping("/update/{pid}")
	public Product updateProduct(@PathVariable int pid, @RequestBody Product product) {
		return service.updateProduct(pid, product);
	}
	
}
