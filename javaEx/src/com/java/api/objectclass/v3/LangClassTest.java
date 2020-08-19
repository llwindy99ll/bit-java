package com.java.api.objectclass.v3;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Point p = new Point(10,20);
		
		System.out.println("p" + p);
	
		Point p2 = p.getClone();
		System.out.println("p2="+ p2);
		
		System.out.println("p==p2 ?"+ (p==p2));	//서로다른 객체,, 값만 복사
	}


	
	

}
