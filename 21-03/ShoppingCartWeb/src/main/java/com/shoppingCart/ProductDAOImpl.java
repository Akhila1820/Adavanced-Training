package com.shoppingCart;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
@Repository

public class ProductDAOImpl implements ProductDAO  {
	
	
	@Autowired
	private SessionFactory sessionFactory;

	
	@Override
	@Transactional
	public void addProduct(Product product) {
		
		// get current hibernate session
				Session currentSession = sessionFactory.getCurrentSession();

				// save/update
				currentSession.saveOrUpdate(product);

	}

		

	

	@Override
	public void deleteByProductId(int id) {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// delete object with primary key
		Query theQuery = currentSession.createQuery("delete from Product where id=:productId");
		theQuery.setParameter("productId", id);

		theQuery.executeUpdate();

}		
	

	@Override
	public void updateByProductId(int id) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void findByCategory(String name) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public List<Product> allProduct() {
		// get the current hibernate session
		Session currentSession = sessionFactory.getCurrentSession();

		// create a query
		Query<Product> theQuery = currentSession.createQuery("from Product", Product.class);

		// execute query and get result list
		List<Product> products = theQuery.getResultList();

		// return the results
		return products;
	}





	@Override
	public void findByProductId(int id) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void brandAndModel(String BrandAndModel) {
		// TODO Auto-generated method stub
		
	}





	@Override
	public void brandOrModel(String BrandOrModel) {
		// TODO Auto-generated method stub
		
	}





	




}