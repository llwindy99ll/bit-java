package com.java.oop.shape.v1;

public class Rectangle extends Shape {
	
	protected int width;
	protected int height;
	
	public Rectangle(int x, int y,  int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
		
	}
	

	@Override
	public void draw() {
		System.out.printf("�簢��(x=%d, y=%d, area=%f)�� �׷Ƚ��ϴ�%n ", x, y, area());
	}

	@Override
	public double area() {
		double area = width*height;
		return area;
	}

}
