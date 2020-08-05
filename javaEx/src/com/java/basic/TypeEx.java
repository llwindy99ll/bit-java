package com.java.basic;

public class TypeEx {

	//자바의 기본자료형 연습
	public static void main(String[] args) {

		//intLongTest();
		//floatDoubleTest();
		//booleanEx();
		charEx();
		
		
	}
	
	public static void charEx() {
		//2바이트(부호없음) 유니코드의 한 글자로 수치화된 코드
		// '<- char
		// " <- String
		
		char ch1 ='A';
		char ch2 ='한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch1+ch2);  //정수형으로 변환후  합산,
		
		
	}
	
	public static void booleanEx() {
		boolean b1 =true;
		boolean b2 = false;
		
		System.out.println(b1);
		
		int v1 =3;
		int v2 = 4;
		
		boolean result = v1<v2;
		
		System.out.println(result);
		
	}
	
	//실수형 연습
	public static void floatDoubleTest() {
		//정밀도를 포기하고 표현범위를 넓힌 자료형
		
		float fVar = 3.14159f; 		//float 자료형은 값에 f를 붙여야 함
		double dVar = 3.14159;
		
		fVar = 0.1234567890123456789f;
		dVar = 0.1234567890123456789;
		
		System.out.println(fVar);
		System.out.println(dVar);
		
		//지수표기법 
		fVar = 1234567890E-10f;
		System.out.println(fVar);
		
		//실수 자료형의 처리는 정밀도가 떨어짐
		System.out.println(0.1*3); // --> 0.3 이 아님
		
	}
	
	//byte > short > int < long
	public static void intLongTest() {
		
		int intVar1;
		intVar1 = 2020;
		int intVar2 = 2020;
		
		long longVar1;
		longVar1 = 2020;
		
		long longVar2 = 123456789012345678L; //맨뒤에 L삭제시 에러
		
		
		// 2진수 , 8진수, 16진수
		
		int bin = 0b1100;  	//2진수는 0b ~ 로 시작
		int oct = 010;  	//8진수는 0 ~ 로 시작
		int hex = 0xff;		//16진수는 0x ~ 로 시작
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
		
		
	}

}
