package com.java.oop;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum:"+
				sum(10,20));
		printMessage("Java Method 연습");
		//sum(10,20,30,40,50);
		System.out.println("가변인수 합:" + sum(10,20,30,40,50) );
		printSum("고정인수+가변인수 연습:", 10,20,30,40,50);
		
	}
	
	// 가변인수, 고정인수 같이 사용
	// 같이사용할때는 순서가 중요, 반드시고정인수 먼자 사용후 나중 가변인수
	private static void printSum(String message, double ...values ) {
		double total = sum(values);
		System.out.println(message+":"+ total);
	}
	
	private static double sum(double ...values) {
		System.out.println("인수의 갯수:"+ values.length);
		double total =0;
		for(double val: values) total +=val;
		return total;
	}
	
	private static double sum(double a, double b) {
		return a+b;
	}
	
	private static void printMessage(String message) {
		System.out.println(message);
	}

}
