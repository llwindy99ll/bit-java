package com.java.basic;

public class TypeEx {

	//�ڹ��� �⺻�ڷ��� ����
	public static void main(String[] args) {

		//intLongTest();
		//floatDoubleTest();
		//booleanEx();
		//charEx();
		finalTest();
		
	}
	
	public static void finalTest() {
		
		final double PI = 3.14159;
		final int SPEED_LIMIT = 110;
		
		
		System.out.println(SPEED_LIMIT);
		
	}
	
	public static void charEx() {
		//2����Ʈ(��ȣ����) �����ڵ��� �� ���ڷ� ��ġȭ�� �ڵ�
		// '<- char
		// " <- String
		
		char ch1 ='A';
		char ch2 ='한';
		
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch1+ch2);  //���������� ��ȯ��  �ջ�,
		
		
	}
	
	public static void booleanEx() {
		boolean b1 =true;
		boolean b2 = false;
		
		System.out.println(b1);
		
		int v1 =3;
		int v2 = 4;
		
		boolean result = v1<v2;
		
		System.out.println(result);
		
	}
	
	//�Ǽ��� ����
	public static void floatDoubleTest() {
		//���е��� �����ϰ� ǥ�������� ���� �ڷ���
		
		float fVar = 3.14159f; 		//float �ڷ����� ���� f�� �ٿ��� ��
		double dVar = 3.14159;
		
		fVar = 0.1234567890123456789f;
		dVar = 0.1234567890123456789;
		
		System.out.println(fVar);
		System.out.println(dVar);
		
		//����ǥ��� 
		fVar = 1234567890E-10f;
		System.out.println(fVar);
		
		//�Ǽ� �ڷ����� ó���� ���е��� ������
		System.out.println(0.1*3); // --> 0.3 �� �ƴ�
		
	}
	
	//byte > short > int < long
	public static void intLongTest() {
		
		int intVar1;
		intVar1 = 2020;
		int intVar2 = 2020;
		
		long longVar1;
		longVar1 = 2020;
		
		long longVar2 = 123456789012345678L; //�ǵڿ� L������ ����
		
		
		// 2���� , 8����, 16����
		
		int bin = 0b1100;  	//2������ 0b ~ �� ����
		int oct = 010;  	//8������ 0 ~ �� ����
		int hex = 0xff;		//16������ 0x ~ �� ����
		
		System.out.println(bin);
		System.out.println(oct);
		System.out.println(hex);
		
		
		
	}

}
