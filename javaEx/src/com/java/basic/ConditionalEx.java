package com.java.basic;

import java.util.Scanner;

public class ConditionalEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ifElseEx();
		//ifElseEx2();
		//ifElseEx3();
		//switchEx();
		//switchEx2();
		//whileEx();
		dowhileEx();
		
	}
	
	public static void dowhileEx() {
		// ���ڸ� �Է¹޾� �ջ�
		// 0�� �Է¹����� �ݺ��� ����
		// �ּ� �ѹ��� �����ϰų� �ݺ������� loop�� �ȿ��� �����Ǵ°��� do~while 
		Scanner scanner = new Scanner(System.in);
		
		int num=0;
		int total = 0;
		
		do {
			System.out.println("�����Է�.[0�̸� ����]");
			
			num = scanner.nextInt();	
			total += num;
		}while(num !=0);
		System.out.println("0: �Է� ����]"+"total:"+total);
		
	}
	
	public static void whileEx() {
		// �ݺ��� ����ؼ� 1-100 �� ���ϱ�
		
		int num=0;
		int sum=0;
		while(num<=100) {
			num=num+1;
			sum = num+sum;
			System.out.println(num);
		}
		System.out.println("sum:" + sum);
	}
	
	public static void switchEx2() {
		System.out.println("1.C, 2.C++, 3.JAVA, 4.Pyton");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		switch(num) {
		case 2:
			System.out.println("30��");
			break;
		case 3:
			System.out.println("31��");
			break;
		default:
			System.out.println("������ ����");
		}
	}
	
	public static void switchEx() {
		// switch�� ���޹��� ������ ����  �̿��ؼ� �帧�� ����
		

		System.out.println("1.C, 2.C++, 3.JAVA, 4.Pyton");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		switch(num) {
		case 1:
			System.out.println("R101");
			break;
		case 2:
			System.out.println("R202");
			break;
		case 3:
			System.out.println("R303");
			break;
		case 4:
			System.out.println("R401");
			break;
		default:
			System.out.println("������ ����");
		
		}
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
