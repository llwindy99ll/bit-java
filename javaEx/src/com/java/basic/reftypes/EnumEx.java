package com.java.basic.reftypes;

public class EnumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//usingEnum();
		usingEnum2();
		

	}
	
	public static void usingEnum2() {
		// ���������� ������ SUNDAY -> �޽� , MONDAY-THURSDAY -> ���� , SATURDAY -> ����
		
		WeekDay dow = WeekDay.TUSEDAY;
		String act ;
		
		switch(dow) {
		case SUNDAY:
			act = "";
		case MONDAY:
		case TUSEDAY:
		case WEDNESDAY:
		case THURSDAY:
			act = "����";
			break;
		case FRAIDAY:
			act = "�ұ�";
		case SATURDAY:
			act = "����";
			break;
		default :
			act = "?";
		}
		System.out.printf("%s���� %s ����",dow, act);
		
	}
	
	public static void usingEnum() {
		WeekDay now = WeekDay.THURSDAY;
		
		System.out.printf("������ %s(%d)�Դϴ�%n", 
				now.name(), 		//���� ����� ���ڿ� ��ȯ
				now.ordinal()  //���Ż���� ����
				);
		
		//���ڿ��� -> ���Ż����
		String str ="SUNDAY";
		WeekDay obj = WeekDay.valueOf(str);

		System.out.printf("������ %s(%d)�Դϴ�%n", 
				str,
				obj.ordinal()  //���Ż���� ����
				);
	}

}
