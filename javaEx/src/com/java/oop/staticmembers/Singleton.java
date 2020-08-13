package com.java.oop.staticmembers;


// 어떤상황에서도 반드시 하나의 인스턴스를 유지해야 하는 경우
public class Singleton {
	
	// 인스턴스를 static으로  선언, 클래스 변수는 단한번 호출됨
	private static Singleton instance =  new Singleton();
	
	// 생성자
	private Singleton() {
	//절대 두번 호출되면 안됨
		
	}
	
	// getter를 활용해서 우회 접근
	public static Singleton getInstance() {
		return instance;
	}

}
