package com.java.oop.point.v4;

//v4
public class pointApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p1 = new Point();
		p1.setX(10);
		p1.setY(10);
		
		Point p2 = new Point(10,30);
		
		p1.draw();
		p2.draw();
		
		ColorPoint cp1 = new ColorPoint("red");
		ColorPoint cp2 = new ColorPoint(10,10,"blue");
		
		cp1.draw();
		cp2.draw(true);
	}

}
