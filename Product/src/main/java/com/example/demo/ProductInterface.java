package com.example.demo;

import java.util.List;

public interface ProductInterface {

	public Product saveProduct(Product product);
	
	public List<Product> getAllProducts();
	
	public void delete(int pid);
	
	public Product getProduct(int pid);
	
	public Product updateProduct(int pid, Product product);
}
