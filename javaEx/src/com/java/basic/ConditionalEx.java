package com.java.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifElseEx();
		//ifElseEx2();
		ifElseEx3();
	}
	
	public static void ifElseEx3() {
		// 1-> R101, 2- R202, 3- R303, 4-R404, else-������ ����
		Scanner scanner = new Scanner(System.in);
		System.out.println("1.C, 2.C++, 3.JAVA, 4.Pyton");
		int num = scanner.nextInt();
		
		if(num ==1 )
			System.out.println("R101");
		else if(num == 2)
			System.out.println("R202");
		else if(num==3)
			System.out.println("R303");
		else 
			System.out.println("R404");
	
		
		
	}
	
	public static void ifElseEx2() {
		//  �����Է�
		// 0���� ũ��  ���, 0���� ������ ���� ���
		// if ~else if, ~else
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num>0) System.out.println("����Դϴ�");
		else if(num<0) System.out.println("�����Դϴ�");
		else System.out.println("0�Դϴ�");
		
		
	}
	
	public static void ifElseEx () {
		// scanner�� ������ �Է¹޾Ƽ� 
		// ������ 60�� �̻��̸� �հ�
		// �׷��� ������ ���հ�
		
		Scanner scanner = new Scanner(System.in);
	
		int score= scanner.nextInt(); 
		
		if(score>60) {
			System.out.println("�հ�");
			
		}else {
			System.out.println("���հ�");
			
		}
			
		
	}
	
	

}
