package com.java.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringBasic();
		stringFormat();
	}
	
	public static void stringFormat() {
		String fruit = "사과";
		int total =10;
		int eat =3;
		
		String fmt = "%d개의 %s중에서 %d개를 먹었다%n";
		System.out.printf(fmt, total, fruit, eat);
		// 표맷 문자 지정에 유의
		// 새로운 문자열을 생성할때 활용한다
		String  res = String.format("파이상수는 %s 입니다", Math.PI);
		System.out.println(res);
		res = String.format("파이상수는 %.3f 입니다", Math.PI);
		System.out.println(res);
	}

	public static void stringBasic() {
		String str1;
		str1 = "java"; // 리터럴 선언
		String str2 = "java";
		String str3 = new String("java");
		
		//리터럴일 경우 내용이 같으면 주소가 같다
		System.out.println((str1==str2));
		System.out.println((str2==str3) );
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		
	}
}
