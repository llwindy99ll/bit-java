package com.java.api.objectclass.v5;

// clonalbe 인터페이스를 구현해야  --> Object.clone()  사용가능
public class Point implements Cloneable{

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

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		
		if (obj instanceof Point) {
			Point other = (Point)obj;
			return this.x ==other.x && this.y == other.y;
			
		}
		
		return super.equals(obj);
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	
	public Point getClone() {
		Point clone = null;
		try {
			clone = (Point)clone();
		}catch(CloneNotSupportedException e) {
			System.err.println("복제 불가 객체!");
		}
		
		return clone;
	}
	
}


