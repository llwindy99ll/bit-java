package com.java.api;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//참조값을 다루다 보면 null 을 확인해야하는 경우가 있음 --> wrapper 함수 사용해서 해결
		
		Integer i = new Integer(2020);
		Character c = new Character('c');
		//위 방식은 jdk9에서 deprecated
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
				
		// 기본 타입은 비어있을 수 없고 (null 허용 안함)
		//  wrapper 타입은 비어있을 수 있다
		//b2 = null;  null 불가
		b = null;
		
		Integer i2 = Integer.valueOf("2020");
		// 내부의 문자열 인자의 형태가 해당 데이터 타입으로 변환할수 있는 형태여야  한다
		
		// 내부 포장된 값 비교
		System.out.println("i의 값은 : "+ i.intValue());
		System.out.println("i와 i2가 같냐?"+  (i.intValue() == i2.intValue() ) );
		
		Float f2 = 3.14159f;
		
		// pars 계열의 메서드는 주로 변환작업에 활용
		System.out.println("문자열 -> 정수형으로 변환: " + Integer.parseInt("-12345"));
		System.out.println("16진수 -> 10진수 변환: " + Integer.parseInt("ff",16));
		
		// 형변환
		System.out.println("f2 -> int: " + f2.intValue());
		
		System.out.println("i와 i2가 같은가? "+ (i==i2) );
		System.out.println("i와 i2의 값이 같은가? "+ (i.intValue()==i2.intValue() ) );
		System.out.println("i와 i2의 값이 같은가? "+ (i.equals(i2) ) );
		
	
	}



}



