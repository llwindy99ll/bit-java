package com.java.api.generics.v1;

public class BoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box intbox = new Box();
		intbox.setContent(10);
		//다운캐스팅 필요
		int contents = (int)intbox.getContent();
		System.out.println("Contents: " + intbox.getContent());
		
		Box strbox = new Box();
		strbox.setContent("Java");
		//다운캐스팅 필요
		String contents2 = (String)strbox.getContent();
		System.out.println("Contents: " + strbox.getContent());
		
		//object 사용시 오류발생할 위험이 있음  아래 는 에러코드
		contents2 = (String)intbox.getContent();
		System.out.println("Contents: " + contents2);
		
		
		
	}

}
