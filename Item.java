package com.example.demo.hello;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity //Items db
public class Item {
	
	@Id //primary key
	private String code;
	private String name;
	private double price;

	//default constructor
	public Item(){}

	public Item(String c, String n, double p) {
		code = c;
		name = n;
		price = p;
	}
	
	public String getCode() {return code;}
	public String getName() {return name;}
	public double getPrice() {return price;}
	
}
