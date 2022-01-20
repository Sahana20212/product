package com.belk.product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Required;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // @Entity annotation defines that a class can be mapped to a table.
@Table(name ="product")
@Data //
@NoArgsConstructor //
@AllArgsConstructor
public class Product {
	@Id
	//@GeneratedValue(strategy = GenerationType.SEQUENCE)//means productid value system genateted automic.
	@Column(name = "productid")
	private int id;// this is called filds in java class
	@Column(name = "productname")
	private String name;// same above
	@Column(name = "productcolor")
	private String color;// same above
	@Column(name = "productprice")
	private double price;// same above.
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
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}