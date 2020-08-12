package com.java.oop;

public class MethodEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum:"+
				sum(10,20));
		printMessage("Java Method ����");
		//sum(10,20,30,40,50);
		System.out.println("�����μ� ��:" + sum(10,20,30,40,50) );
		printSum("�����μ�+�����μ� ����:", 10,20,30,40,50);
		
	}
	
	// �����μ�, �����μ� ���� ���
	// ���̻���Ҷ��� ������ �߿�, �ݵ�ð����μ� ���� ����� ���� �����μ�
	private static void printSum(String message, double ...values ) {
		double total = sum(values);
		System.out.println(message+":"+ total);
	}
	
	private static double sum(double ...values) {
		System.out.println("�μ��� ����:"+ values.length);
		double total =0;
		for(double val: values) total +=val;
		return total;
	}
	
	private static double sum(double a, double b) {
		return a+b;
	}
	
	private static void printMessage(String message) {
		System.out.println(message);
	}

}
