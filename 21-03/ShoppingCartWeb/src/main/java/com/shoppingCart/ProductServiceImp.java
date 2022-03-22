package com.shoppingCart;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
public class ProductServiceImp implements ProductService {
	 @Autowired
	    private ProductDAO productDAO;
	@Override
    @Transactional
	public void addProduct(Product product) {
		productDAO.addProduct(product);
	}

	@Override
    @Transactional

	public void FindByProductId(int id) {
		productDAO.findByProductId(id);
	}

	@Override
    @Transactional

	public void deleteByProductId(int id) {
		productDAO.deleteByProductId(id);
	}

	@Override
	public void updateByProductId(int id) {
		productDAO.updateByProductId(id);
	}

	@Override
	public List<Product> allProduct() {
		return productDAO.allProduct();
		 
		
	}

	@Override
    @Transactional

	public void FindByCategory(String name) {
		productDAO.findByCategory(name);
	}

}
