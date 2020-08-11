package com.java.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//usingEnum();
		usingEnum2();
		

	}
	
	public static void usingEnum2() {
		// 요일정보가 있을때 SUNDAY -> 휴식 , MONDAY-THURSDAY -> 열공 , SATURDAY -> 늦잠
		
		WeekDay dow = WeekDay.TUSEDAY;
		String act ;
		
		switch(dow) {
		case SUNDAY:
			act = "";
		case MONDAY:
		case TUSEDAY:
		case WEDNESDAY:
		case THURSDAY:
			act = "열공";
			break;
		case FRAIDAY:
			act = "불금";
		case SATURDAY:
			act = "늦잠";
			break;
		default :
			act = "?";
		}
		System.out.printf("%s에는 %s 하자",dow, act);
		
	}
	
	public static void usingEnum() {
		WeekDay now = WeekDay.THURSDAY;
		
		System.out.printf("오늘은 %s(%d)입니다%n", 
				now.name(), 		//열거 상수의 문자열 반환
				now.ordinal()  //열거상수의 순번
				);
		
		//문자열을 -> 열거상수로
		String str ="SUNDAY";
		WeekDay obj = WeekDay.valueOf(str);

		System.out.printf("오늘은 %s(%d)입니다%n", 
				str,
				obj.ordinal()  //열거상수의 순번
				);
	}

}
