package com.java.basic;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arithOper();
		
	}

	//산술연산자
	public static void arithOper() {
		
		int a = 7;
		int b = 3;
		
		System.out.println("7/3="+ 7F/3);
		System.out.println("7%3="+ 7%3);
		
		//정확한 실수값을 얻으려면 int -> float 변환 
		System.out.println("7/3 =>" + (float)a/b);
		System.out.println("7%3 =>" + a%b);
		
	}
	
}
