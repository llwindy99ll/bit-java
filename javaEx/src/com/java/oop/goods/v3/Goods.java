package com.java.oop.goods.v3;

// v3
// ������������ ����
public class Goods {
	private String name;
	private int price;
	
	public Goods() {
		System.out.println("Goods ����");
	}
	public Goods(String name, int price) {
		setName(name);
		setPrice(price);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showInfo() {
		System.out.printf("%s, %d��%n", 
				this.name, this.price);
	}
}
