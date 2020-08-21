package com.java.api.generics.v2;

public class BoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Box<Integer> intbox = new Box<Integer>();
		//Box<Integer> intbox = new Box<생략가능>();
		Box<Integer> intbox = new Box<>();

		//intbox.setContent("10"); //컴파일러가 Generics 를 체크 --> Object 였으면 에러 안남
		intbox.setContent(10);
		//다운캐스팅 필요 --> 캐스팅 불필요
		int contents = intbox.getContent();
		System.out.println("Contents: " + intbox.getContent());
		
		Box<String> strbox = new Box<String>();
		strbox.setContent("Java");
		//다운캐스팅 필요
		String contents2 = strbox.getContent();
		System.out.println("Contents: " + strbox.getContent());
		
		//object 사용시 오류발생할 위험이 있음  아래 는 에러코드
		//contents2 = (String)intbox.getContent();  --> 캐스팅 잘못하면 컴파일 자체가 안됨
		System.out.println("Contents: " + contents2);
		
		
		
	}

}
