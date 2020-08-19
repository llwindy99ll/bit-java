package com.java.oop.summary;

public class theOne extends human implements kungfu{
	public theOne(String name, int age){
		super(name, age);
		
	}

	@Override
	public void kungfu() {
		// TODO Auto-generated method stub
		System.out.printf("%s:/¾ÆºÌ~%n", name);
	}


}
