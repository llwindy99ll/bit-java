package com.java.oop.casting;

public class Animal {
	// 자식클래스에서 사용하기 위해 protected 사용
	protected String name;
	
	public Animal(String name) {
		this.name = name;
		
	}
	
	public void eat() {
		System.out.println(name+"이 먹고있습니다");
	}
	
	public void walk() {
		System.out.println(name+"가 걷고있다");
	}

}
