package com.java.oop.point.v4;

public class ColorPoint extends Point {
	
	//추가필드 
	private String color;
	// 생성자 1
	public ColorPoint(String color) {
		// 특별한 지시가 없으면 자바는 super() 생성자를 호출
		this.color = color;
	}
	
	// 생성자 2
	public ColorPoint(int x, int y, String color) {
		//this.x = x;  // 부모클래스의 x,y는 private 
		super(x,y);
		this.color = color;
		
		System.out.println("ColorPoint 생성자");
		
	}
	
	public String getColor;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void draw() {
		System.out.printf("(%d, %d, %s)을 그렸습니다%n", 
				x,y, color);
	}
	@Override
	public void draw(boolean show) {
		String msg = show ? "그렸습니다" : "지웠습니다";
		System.out.printf("(%d, %d, %s)을 %s%n", 
				x,y, color, msg);
		//만약 qnahrk rkwls aptjemfmf tngodgodi gkaus
		System.out.println("====== parent method");
		super.draw();
		
	}
	
}
