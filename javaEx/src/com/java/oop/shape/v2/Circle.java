package com.java.oop.shape.v2;

public class Circle extends Shape implements Drawable {
	// 1. ������ ����
	// 2. �߻�޼��� ����  , �ؾ� �����ȳ�
	
	protected double radius;
	
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.printf("��(x=%d, y=%d, r=%5f, area=%f)�� �׷Ƚ��ϴ�%n ", x,y,radius, area());
	}
	
	@Override
	public double area() {
		//�������ϱ� pi*r*r
		double result = Math.PI*Math.pow(radius, 2);
		
		return result;
		
	}

}
