package com.java.basic;

public class OperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arithOper();
		logicalOper();
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
