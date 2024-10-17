package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServices implements ProductInterface {

	@Autowired
	ProductRepository prodRepo;

	@Override
	public Product saveProduct(Product product) {
		
		float profit = 0.15f;
		profit = product.getCostPrice() * profit ;
		product.setProfit(profit);
		
		int sellPrice = product.getCostPrice() + (int)profit;
		product.setSellPrice(sellPrice);
		
		float gst = 0.18f;
		gst = sellPrice * gst;
		product.setGst(gst);
		
		int amount = product.getQuantity();
		amount = amount * (sellPrice + (int)gst);
		product.setAmount(amount);

		
		return prodRepo.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		
		return prodRepo.findAll();
	}


	@Override
	public void delete(int pid) {
		prodRepo.deleteById(pid);
	}

	@Override
	public Product getProduct(int pid) {
		return prodRepo.findById(pid).get();
	}
	
	
	private void productDetails(Product product) {
	    float profit = 0.15f; 
	    profit = product.getCostPrice() * profit;
	    product.setProfit(profit);
	    
	    int sellPrice = product.getCostPrice() + (int) profit;
	    product.setSellPrice(sellPrice);
	    
	    float gst = 0.18f;
	    gst = sellPrice * gst;
	    product.setGst(gst);
	    
	    int quantity = product.getQuantity();
	    int amount = quantity * (sellPrice + (int) gst);
	    product.setAmount(amount);
	}


	@Override
	public Product updateProduct(int pid, Product product) {
		Product update = prodRepo.findById(pid) 
				.orElseThrow(() -> new RuntimeException("Product Not Found with id: "+pid));
		
		update.setName(product.getName());
		update.setImage(product.getImage());
		update.setOrigin(product.getOrigin());
		update.setQuantity(product.getQuantity());
		update.setCostPrice(product.getCostPrice());

		productDetails(update);
		
		return prodRepo.save(update);
	}
	
	
	
}
