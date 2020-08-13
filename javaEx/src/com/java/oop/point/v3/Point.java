package com.java.oop.point.v3;

//v3
public class Point {

	private int x;
	private int y;
	
	public Point() {
		
	}
	
public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void draw() {
		System.out.printf("(%d, %d)을 그렸습니다%n", 
						x,y);
	}
	
	public void draw(boolean show) {
	
		//boolean a = show ? System.out.printf("(%d, %d)을 그렸습니다%n",	x,y)  : System.out.printf("(%d, %d)을 그렸습니다%n", x,y);

	}
}


