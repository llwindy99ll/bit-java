package com.java.api;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Calendar now = Calendar.getInstance();
		Calendar custom = Calendar.getInstance();
		
		
		System.out.println("���� ��¥: "+ now );
				
		custom.set(1999,11,31);
		int nowYear = now.get(Calendar.YEAR);
		int nowMonth = now.get(Calendar.MONTH);
		int nowDate = now.get(Calendar.DATE);
		
		System.out.printf("���� %d�� %d�� %d��%n", nowYear,(nowMonth+1), nowDate );
		
		Calendar future = Calendar.getInstance();
		future.add(Calendar.YEAR, 10);
		nowYear = future.get(Calendar.YEAR);
		nowMonth = future.get(Calendar.MONTH);
		nowDate = future.get(Calendar.DATE);
		
		System.out.printf("���� %d�� %d�� %d��%n", nowYear,(nowMonth+1), nowDate );
		//���� ���� ���� ����?
		
		int dow = future.get(Calendar.DAY_OF_WEEK);
		System.out.println("10���� ������ ����: "+ dow );
				
		String dowstr = null;
		switch(dow){
		case Calendar.SUNDAY:
			dowstr = "SUNDAY"; 
			break;
		case Calendar.MONDAY:
			dowstr = "MONDAY"; 
			break;
		case Calendar.TUESDAY:
			dowstr = "TUESDAY"; 
			break;
		case Calendar.WEDNESDAY:
			dowstr = "WEDNESDAY"; 
			break;
		case Calendar.THURSDAY:
			dowstr = "THURSDAY"; 
			break;
		case Calendar.FRIDAY:
			dowstr = "THURSDAY"; 
			break;
		case Calendar.SATURDAY:
			dowstr = "SATURDAY"; 
			break;
		}
		System.out.println("10���� ������ ����: "+ dowstr );
		
		
		
	}

}
