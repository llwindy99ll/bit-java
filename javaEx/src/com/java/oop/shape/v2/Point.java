package com.java.oop.shape.v2;

//v4 ���
public class Point implements Drawable{
	/*
	 * private int x; private int y;
	 */ // ��ӹ��� Ŭ���������� ������ �� �ֵ��� ���������� ����
	
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
	
	@Override
	public void draw() {
		System.out.printf("(%d, %d)�� �׷Ƚ��ϴ�%n", 
						x,y);
	}
	
	public void draw(boolean show) {
	
		//boolean a = show ? System.out.printf("(%d, %d)�� �׷Ƚ��ϴ�%n",	x,y)  : System.out.printf("(%d, %d)�� �׷Ƚ��ϴ�%n", x,y);

	}
}


