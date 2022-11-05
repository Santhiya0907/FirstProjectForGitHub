package com.example.firstProject;

public class Car {
	private String brand;
	private String model;
	private int price;
	private String color;
	private int carNumber;
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public int getCarNumber() {
		return carNumber;
	}
	public void setCarNumber(int carNumber) {
		this.carNumber = carNumber;
	}
	@Override
	public String toString() {
		return "brand=" + brand + ", model=" + model + ", price=" + price + ", color=" + color +"Car Number="+ carNumber;
	}
	

}
