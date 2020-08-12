package com.java.oop.goods.v1;

// v1
// Goods 객체를 생성하여 사용하는 클래스
public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods notebook = new Goods();
		notebook.name = "LG그램";
		notebook.price = 1500000;
		System.out.printf("%s, %d원%n", 
				notebook.name, notebook.price);
		
		Goods smartPhone = new Goods();
		smartPhone.name = "iPhone SE";
		smartPhone.price = 600000;
		System.out.printf("%s, %d원%n", 
				smartPhone.name, smartPhone.price);
		
		
	}

}
