package com.java.oop.shape.v1;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape s = new Shape(); //추상클래스는 생성 불가
		
		Circle c = new Circle(10,20,30);
		c.draw();
		
		Rectangle  r = new Rectangle(10,10,30,40);
		r.draw();
	}

}
