package com.java.oop.staticmembers;

public class SingletonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton s1 = new Singleton(); <-- 생성자 호출 불가
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		// s1 주소와 s2 주소가 같은가?
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);

		System.out.println("s1=s2 ? : "+ (s1==s2));
		
	}

}
