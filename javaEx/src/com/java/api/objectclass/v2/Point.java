package com.java.api.objectclass.v2;

// 데이터가 값으면 값이 같아고 변경
// equals 오버라이트 
public class Point {

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
	
	
}


