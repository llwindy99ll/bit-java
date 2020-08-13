package com.java.oop.point.v4;

//v4 상속
public class Point {
	/*
	 * private int x; private int y;
	 */ // 상속받은 클래스에서도 접근할 수 있도록 접근지정자 변경
	
	protected int x;
	protected int y;
	
	
	public Point() {
		
	}
	
public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point 생성자 생성");
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


