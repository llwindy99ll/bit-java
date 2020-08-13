package com.java.oop.staticmembers;

public class SingletonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Singleton s1 = new Singleton(); <-- ������ ȣ�� �Ұ�
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
		// s1 �ּҿ� s2 �ּҰ� ������?
		
		System.out.println("s1="+s1);
		System.out.println("s2="+s2);

		System.out.println("s1=s2 ? : "+ (s1==s2));
		
	}

}
