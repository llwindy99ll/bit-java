package com.java.oop.summary;

public class kungfupanda extends panda implements kungfu{
	public kungfupanda(String name, int age){
		super(name, age);
		
	}

	@Override
	public void kungfu() {
		// TODO Auto-generated method stub
		System.out.printf("%s:/�ƺ�~%n", name);
	}

	
}
