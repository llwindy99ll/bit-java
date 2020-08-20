package com.java.api;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringBasic();
		stringMethods();
	}
	
	public static void stringMethods() {
		String s = "Java Programming is fun ?";
		
		System.out.println("길이:" + s.length());
		System.out.println("대문자로:"+ s.toUpperCase());
		System.out.println("소문자로:"+ s.toLowerCase());
		
		// 변환 메서드를 수행해도 내부데이터는 변경되지 않음 , replace, substring 등
		
		//
		StringBuffer sb = new StringBuffer("This is");
		sb.append(" pen");
		System.out.println(sb);
		
		sb.insert(8,"my ");
		System.out.println(sb);
		
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		
		
		
	}

	public static void stringBasic() {
		String s1 = "Java";  // 리터럴 - 소스코드에 직접 입력
		String s2 = new String("Java"); //메모리에 새 객체
		String s3 = "Java"; // 리터럴
		
		// 같은 값을 가졌으나 리터럴과 새 객체의 비교
		System.out.println("s1==s2 ?  "+ (s1==s2));
		// 같은 가ㅓㅄ을 가진 두 객체 리터럴의 비교
		System.out.println("s1==s3 ?  "+ (s1==s3));
		
		// char의 배열을 사용한 문자열의 생성
		char[] letters= {'J','a','v','a'};
		String s4 = new String(letters);
		System.out.println("s4  "+ s4);
		
		// 기본 타입을 문자열 객체로 변환
		String s5 = String.valueOf((Math.PI));
		System.out.println("s5 "+ s5);
		

		
	}
}
