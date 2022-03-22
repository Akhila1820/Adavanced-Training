package com.shoppingCart;

import java.util.List;


public interface ProductService {

public void addProduct(Product product);
	
	public void FindByProductId(int id);
	
	public void deleteByProductId(int id);
	
	public void updateByProductId(int  id);
	
	public List<Product> allProduct();
	
	public void FindByCategory(String name);
	
 
}
	

