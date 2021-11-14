package com.psl.modal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Products")
public class Products {
	@Id
	@Column(name = "id")
	@GeneratedValue (strategy= GenerationType.AUTO)
	private int id;
	@Column(name = "name")
	
	private String name;
	@Column(name = "category")
	private String category;
	@Column(name = "price")
	private int price;
	@Column(name = "stock")
	private int stock;
	@Column(name = "stars")
	private int stars;
	@Column(name = "seller")
	private String seller;
	
	
	public Products() {
		
	}
	public Products( String name, String category, int price, int stock,String seller,int stars) {
		super();
		
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.seller =seller;
		this.stars =stars;
	}
	
	public String getSeller() {
		return seller;
	}
	public void setSeller(String seller) {
		this.seller = seller;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getStars() {
		return stars;
	}
	public void setStars(int stars) {
		this.stars = stars;
	}
	
	
}
