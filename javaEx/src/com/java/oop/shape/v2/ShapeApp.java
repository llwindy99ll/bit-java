package com.java.oop.shape.v2;

public class ShapeApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Shape s = new Shape(); //추상클래스는 생성 불가
		
		Circle c = new Circle(10,20,30);
		//c.draw();
		printObject(c);
		
		Rectangle  r = new Rectangle(10,10,30,40);
		//r.draw();
		printObject(r);
		
		Point p = new Point(100,200);
		
		// 인터페이스를 참조타입으로 설정할수 있다
		Drawable d =c;
	
		// instanceof 연산자로 실제 객체의 인터페이스를 확인
		if(r instanceof Drawable) {
			((Drawable)r).draw();
		}
	}
	
	private static void printObject(Drawable obj) {
		obj.draw();
	}

}
