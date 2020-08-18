package com.java.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape s = new Shape(); //�߻�Ŭ������ ���� �Ұ�
		
		Circle c = new Circle(10,20,30);
		//c.draw();
		printObject(c);
		
		Rectangle  r = new Rectangle(10,10,30,40);
		//r.draw();
		printObject(r);
		
		Point p = new Point(100,200);
		
		// �������̽��� ����Ÿ������ �����Ҽ� �ִ�
		Drawable d =c;
	
		// instanceof �����ڷ� ���� ��ü�� �������̽��� Ȯ��
		if(r instanceof Drawable) {
			((Drawable)r).draw();
		}
	}
	
	private static void printObject(Drawable obj) {
		obj.draw();
	}

}
