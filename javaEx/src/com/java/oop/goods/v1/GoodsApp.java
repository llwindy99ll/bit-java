package com.java.oop.goods.v1;

// v1
// Goods ��ü�� �����Ͽ� ����ϴ� Ŭ����
public class GoodsApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods notebook = new Goods();
		notebook.name = "LG�׷�";
		notebook.price = 1500000;
		System.out.printf("%s, %d��%n", 
				notebook.name, notebook.price);
		
		Goods smartPhone = new Goods();
		smartPhone.name = "iPhone SE";
		smartPhone.price = 600000;
		System.out.printf("%s, %d��%n", 
				smartPhone.name, smartPhone.price);
		
		
	}

}
