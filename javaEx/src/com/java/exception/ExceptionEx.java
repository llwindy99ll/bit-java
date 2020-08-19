package com.java.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx {
	
	public static void main(String[] args) {
		//arithmeticExceptionEx();
		//indexOutofBoundEx();
		nullpointerExceptionEx();
	}
	
	public static void nullpointerExceptionEx() {
		String s = "Hello";

		s = null;

		try {
		
			System.out.println(s.toUpperCase());
		
		}catch(NullPointerException e) {
			System.out.println("���ܸ޽���: "+ e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("End of code");
		
	}
	
	public static void indexOutofBoundEx() {
		int[] intArray = new int[] {3,6,9};
		
		System.out.println("���� ����:"+intArray.length);
		try {
			System.out.println(intArray[3]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("���ܸ޽���:"+ e.getMessage());
		}
	}
	
	public static void arithmeticExceptionEx() {
		
		Scanner scan = new Scanner(System.in);
		
		double result = 0;
		int num;
		
		System.out.println("������ �Է��ϼ���");
		
		try {
			num = scan.nextInt();
			result = 100/num;
		}catch(ArithmeticException e) {		
			//���� �Է¿� ���� ���ܸ� ó���� �� ����
			System.err.println("���ܹ߻� : "+e.getMessage() );
		}catch(InputMismatchException e) {  
			//�����Է¿� ���� ������ ó���ϱ� ����
			System.err.println("������ �Է��Ͻÿ� : "+e.getMessage() );
			
			//���ܻ�Ȳ ��ü�� Ȯ���ϰ��� �Ҷ�
			e.printStackTrace();  
		}catch(Exception e) {
			// ���������� �����ִ� ��� ���ܸ� ó��
			// �Ϲ����� ���ܸ� ���⼭ ó���ϰ� �������� ��ü���� ���ܸ� ó��
			e.printStackTrace();
		}finally{
			// ���ܿ� ������� �׻� ����
			// �ڿ� ���� �۾��� ���
			System.out.println();
		}
		
		System.out.println("���:"+ result);
		scan.close();
		
		
	}
}
