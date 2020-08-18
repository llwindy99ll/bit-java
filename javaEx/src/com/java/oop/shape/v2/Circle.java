package com.java.oop.shape.v2;

public class Circle extends Shape implements Drawable {
	// 1. 생성자 구현
	// 2. 추상메서드 구현  , 해야 에러안남
	
	protected double radius;
	
	public Circle(int x, int y, double radius) {
		super(x,y);
		this.radius = radius;
	}
	
	@Override
	public void draw() {
		System.out.printf("원(x=%d, y=%d, r=%5f, area=%f)을 그렸습니다%n ", x,y,radius, area());
	}
	
	@Override
	public double area() {
		//면적구하기 pi*r*r
		double result = Math.PI*Math.pow(radius, 2);
		
		return result;
		
	}

}
