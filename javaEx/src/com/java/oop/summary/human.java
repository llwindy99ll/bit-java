package com.java.oop.summary;

public class human extends Animal {
	
	public human(String name, int age) {
		super(name);
	}

	@Override
	public void say() {
		// TODO Auto-generated method stub
		System.out.printf("My name is %s%n", name);
	}

}
