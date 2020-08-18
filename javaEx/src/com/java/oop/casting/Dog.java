package com.java.oop.casting;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);	//부모의 생성자는 반드시 호출해야함, 자식 생성자 안만들면 자동으로 default 자식 생성자 에서 부모생상자 호출
		
	}
	
	public void bark() {
		System.out.println(name+": 멍멍");
		
	}
}
