package com.psl.modal;

import java.util.ArrayList;
import java.util.HashMap;

public class Products {
	private int id;
	private String name;
	private String category;
	private int price;
	private int stock;
	private ArrayList<HashMap<String,String>> reviews;
	private String seller;
	
	
	public Products() {
		
	}
	public Products( String name, String category, int price, int stock,String seller, ArrayList<HashMap<String,String>> reviews) {
		super();
		
		this.name = name;
		this.category = category;
		this.price = price;
		this.stock = stock;
		this.seller =seller;
		this.reviews =reviews;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + ", stock="
				+ stock + ", reviews=" + reviews + ", seller=" + seller + "]";
	}
	public ArrayList<HashMap<String, String>> getReviews() {
		return reviews;
	}
	public void setReviews(ArrayList<HashMap<String, String>> reviews) {
		this.reviews = reviews;
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
}
