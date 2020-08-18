package com.java.oop.shape.v2;

public abstract class Shape {
	//�߻�Ŭ������ �ν��Ͻ�ȭ�� �Ұ� (new �Ұ�)
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	//�߻� �޼ҵ�� �ڽ�Ŭ�������� �ݵ�� �����ؾ���(����)
	public abstract void draw();
	//�������̽��� ����
	//public abstract double area();
	
}
