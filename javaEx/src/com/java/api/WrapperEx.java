package com.java.api;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�������� �ٷ�� ���� null �� Ȯ���ؾ��ϴ� ��찡 ���� --> wrapper �Լ� ����ؼ� �ذ�
		
		Integer i = new Integer(2020);
		Character c = new Character('c');
		//�� ����� jdk9���� deprecated
		Float f = Float.valueOf(3.14159f);
		Boolean b = Boolean.valueOf(true);
				
		// �⺻ Ÿ���� ������� �� ���� (null ��� ����)
		//  wrapper Ÿ���� ������� �� �ִ�
		//b2 = null;  null �Ұ�
		b = null;
		
		Integer i2 = Integer.valueOf("2020");
		// ������ ���ڿ� ������ ���°� �ش� ������ Ÿ������ ��ȯ�Ҽ� �ִ� ���¿���  �Ѵ�
		
		// ���� ����� �� ��
		System.out.println("i�� ���� : "+ i.intValue());
		System.out.println("i�� i2�� ����?"+  (i.intValue() == i2.intValue() ) );
		
		Float f2 = 3.14159f;
		
		// pars �迭�� �޼���� �ַ� ��ȯ�۾��� Ȱ��
		System.out.println("���ڿ� -> ���������� ��ȯ: " + Integer.parseInt("-12345"));
		System.out.println("16���� -> 10���� ��ȯ: " + Integer.parseInt("ff",16));
		
		// ����ȯ
		System.out.println("f2 -> int: " + f2.intValue());
		
		System.out.println("i�� i2�� ������? "+ (i==i2) );
		System.out.println("i�� i2�� ���� ������? "+ (i.intValue()==i2.intValue() ) );
		System.out.println("i�� i2�� ���� ������? "+ (i.equals(i2) ) );
		
	
	}



}



