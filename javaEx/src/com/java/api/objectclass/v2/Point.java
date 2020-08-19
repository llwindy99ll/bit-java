package com.java.api.objectclass.v2;

// �����Ͱ� ������ ���� ���ư� ����
// equals ��������Ʈ 
public class Point {

	protected int x;
	protected int y;
	
	
	public Point() {
		
	}
	
public Point(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Point ������ ����");
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
		System.out.printf("(%d, %d)�� �׷Ƚ��ϴ�%n", 
						x,y);
	}
	
	public void draw(boolean show) {
	
		//boolean a = show ? System.out.printf("(%d, %d)�� �׷Ƚ��ϴ�%n",	x,y)  : System.out.printf("(%d, %d)�� �׷Ƚ��ϴ�%n", x,y);

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


