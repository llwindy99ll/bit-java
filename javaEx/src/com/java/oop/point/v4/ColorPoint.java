package com.java.oop.point.v4;

public class ColorPoint extends Point {
	
	//�߰��ʵ� 
	private String color;
	// ������ 1
	public ColorPoint(String color) {
		// Ư���� ���ð� ������ �ڹٴ� super() �����ڸ� ȣ��
		this.color = color;
	}
	
	// ������ 2
	public ColorPoint(int x, int y, String color) {
		//this.x = x;  // �θ�Ŭ������ x,y�� private 
		super(x,y);
		this.color = color;
		
		System.out.println("ColorPoint ������");
		
	}
	
	public String getColor;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void draw() {
		System.out.printf("(%d, %d, %s)�� �׷Ƚ��ϴ�%n", 
				x,y, color);
	}
	@Override
	public void draw(boolean show) {
		String msg = show ? "�׷Ƚ��ϴ�" : "�������ϴ�";
		System.out.printf("(%d, %d, %s)�� %s%n", 
				x,y, color, msg);
		//���� qnahrk rkwls aptjemfmf tngodgodi gkaus
		System.out.println("====== parent method");
		super.draw();
		
	}
	
}
