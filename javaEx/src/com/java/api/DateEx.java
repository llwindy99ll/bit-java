package com.java.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		
		String nowstr = now.toString();
		
		System.out.println("현재 날짜: "+ nowstr );
		System.out.println("현재 날짜: "+ now.toLocaleString() );
		
		// 형식화된 출력 : DateFormat
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("현재 날짜: "+ df.format(now) );
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("현재 날짜: "+ df.format(now) );
		
		// 자유로운 날짜 데이터 포메팅
		SimpleDateFormat sdf = new SimpleDateFormat("yyy년 MM월 dd일 HH시 mm분 ss초");
		System.out.println("현재 날짜: "+ sdf.format(now) );
		
		
	}

}
