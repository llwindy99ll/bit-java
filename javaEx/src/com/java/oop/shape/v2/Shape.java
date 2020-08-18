package com.java.oop.shape.v2;

public abstract class Shape {
	//추상클래스는 인스턴스화가 불가 (new 불가)
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//추상 메소드는 자식클래스에서 반드시 구현해야함(강제)
	public abstract void draw();
	//인터페이스로 변경
	//public abstract double area();
	
}
