package com.shoppingCart;

import java.util.List;
public interface ProductDAO {

		public void addProduct(Product product);
		
		public void findByProductId(int id);
		
		public void deleteByProductId(int id);
		
		public void updateByProductId(int id);
		
		public List<Product> allProduct();
		
		public void findByCategory(String name);
		
		public void brandAndModel(String BrandAndModel);
		
		public void brandOrModel(String BrandOrModel);
		
	}

