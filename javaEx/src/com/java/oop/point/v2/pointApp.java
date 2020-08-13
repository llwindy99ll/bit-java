package com.java.oop.point.v2;

public class pointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.setX(10);
		p1.setY(10);
		
		Point p2 = new Point(10,30);
		
		p1.draw();
		p2.draw();
		
	}

}
