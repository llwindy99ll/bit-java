package com.java.basic;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arithOper();
		//logicalOper();
		//bitOper();
		conditionalOper();
	}
	
	public static void conditionalOper() {
		//����? ��:��ĩ
		int a =10;
		System.out.println( "a : "+ ( a%2==0 ? "¦��":"Ȥ��" ));
		int score = 80;
		System.out.println( "a : "+ ( score>=80 ? "Good": (score >50 ?  "Pass":"Fail") ));
		
		score = 40;
		System.out.println( "a : "+ ( score>=80 ? "Good": (score >50 ?  "Pass":"Fail") ));
		
		score = 60;
		System.out.println( "a : "+ ( score>=80 ? "Good": (score >50 ?  "Pass":"Fail") ));
	}
	
	public static void bitOper() {
		
		byte b1 = 0b1101;
		byte b2 = 0b0111;
		
		System.out.println("b1&b2 result: " + Integer.toBinaryString(b1&b2) );
		System.out.println("b1|b2 result: " + Integer.toBinaryString(b1|b2) );
		System.out.println("~b1 result: " + Integer.toBinaryString(~b1) );
		System.out.println("b1&b2 result: " + (~b1) ); // (1)111(64+32+16=112) 0010(2)=-114

		int val = 1;
		System.out.println("val<<1 result: " + (val<<1) );
		System.out.println("val<<1 result: " + Integer.toBinaryString(val<<1) );
		
		System.out.println("val<<2 result: " + (val<<2) );
		System.out.println("val<<2 result: " + Integer.toBinaryString(val<<2) );
		
		System.out.println("val<<3 result: " + (val<<3) );
		System.out.println("val<<3 result: " + Integer.toBinaryString(val<<3) );
		
	}
	
	// �� �� ����
	public static void logicalOper() {
		
		int n =5;
		boolean b1 = n>0;
		boolean b2 = n<10;
		
		System.out.println("n > 0 and n < 10 ? : "+ (b1&&b2) );
	
		b1 = n <= 0;
		b2 = n >= 10;
		
		System.out.println("n <= 0 or n >= 10 ? : "+ (b1||b2) );

		System.out.println("!(n <= 0 or n >= 10) ? : "+ !(b1||b2) );
	}

	//���������
	public static void arithOper() {
		
		int a = 7;
		int b = 3;
		
		System.out.println("7/3="+ 7F/3);
		System.out.println("7%3="+ 7%3);
		
		//��Ȯ�� �Ǽ����� �������� int -> float ��ȯ 
		System.out.println("7/3 =>" + (float)a/b);
		System.out.println("7%3 =>" + a%b);
		
		//�Ǽ��� 0���� ������ : Infinity
		System.out.println("�Ǽ�/0 => "+ 4.0/0);
		
		// ����Ҽ� ���� �� : NaN (Not a Number)
		System.out.println("0.0 / 0.0 =>" + 0.0/0.0);
		
		// ���Ѽ����� Ȯ�� 
		System.out.println("���Ѽ����� Ȯ�� : "+ Double.isFinite(5.0/0));

		// NaN���� Ȯ�� 
		System.out.println("NaN Ȯ�� : "+ Double.isNaN(0.0/0));
		
		
	}
	
}
