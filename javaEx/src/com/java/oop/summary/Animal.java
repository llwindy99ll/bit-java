package com.java.oop.summary;

public abstract class Animal {

	protected String name;
	protected int age;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public Animal(String name, int age) {
		this(name);
		this.age = age;
	
	}
	
	public abstract void say();
	public void eat(String name) {
		System.out.printf("%s is eating... %n", name);
	}
}
