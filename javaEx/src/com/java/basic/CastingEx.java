package com.java.basic;

//데이터 타입을 다른 데이터 타입으로 변경(casting)
// 1.좋은 표현 번위 데이터 -> 넓은 표현 범위 데이터(promotion)
// 2.넓은 표현 범위 데이터 -> 좁은 표현 범위 데이터 (casting)
	
public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//promotion();
		castingEx();
	}
	
	

	public static void promotion() {
		//implicit casting(암묵적 변환)
		//
		byte b =25;
		System.out.println("바이트:"+b);
		short s = b;
		System.out.println("short:"+s);
		
		int i = s;
		System.out.println("int:"+i);
		
		long l =1234567890123456789l ;
		System.out.println("long:"+l);
		
		float f = l;
		System.out.println("float:"+f);
			
	}
	
	public static void castingEx() {
		//explicit casting(명시적 변환)
		//자료의 유실 발생 가능
		//개발자가 명시적으로 변환할 자료형을 지정
		
		float f = 1234.5678f;
		System.out.println("float:"+f);
		
		long l =(long)f ;
		System.out.println("long:"+l);
		
		int i = (int)l;
		System.out.println("int:"+i);
		
		short s = (short)i;
		System.out.println("short:"+s);
		
		//1234 = 1111() 1111(128) 1111(15) =
		byte b =(byte)s;  
		System.out.println("바이트:"+b);
		
		
		
	}
	
	
}
