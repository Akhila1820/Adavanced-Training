package com.shoppingCart;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	String Name;
	double Price;
	int Quantity;
	

	public Product() {
		super();
	}
	public Product(String name, double price, int quantity) {
		super();
		this.id = id;
		Name = name;
		Price = price;
		Quantity = quantity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public double getPrice() {
		return Price;
	}
	public void setPrice(double price) {
		Price = price;
	}
	public int getQuantity() {
		return Quantity;
	}
	public void setQuantity(int quantity) {
		Quantity = quantity;
	}
	@Override
	public String toString() {
		return "Product [id=" + id + ", Name=" + Name + ", Price=" + Price + ", Quantity=" + Quantity + "]";
	}
}

