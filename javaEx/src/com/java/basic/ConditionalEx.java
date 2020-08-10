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
		// 1-> R101, 2- R202, 3- R303, 4-R404, else-관리자 문의
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
		//  정수입력
		// 0보다 크면  양수, 0보다 작으면 음수 출력
		// if ~else if, ~else
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		if(num>0) System.out.println("양수입니다");
		else if(num<0) System.out.println("음수입니다");
		else System.out.println("0입니다");
		
		
	}
	
	public static void ifElseEx () {
		// scanner로 정수를 입력받아서 
		// 정수가 60점 이상이면 합격
		// 그렇지 않으면 불합격
		
		Scanner scanner = new Scanner(System.in);
	
		int score= scanner.nextInt(); 
		
		if(score>60) {
			System.out.println("합격");
			
		}else {
			System.out.println("불합격");
			
		}
			
		
	}
	
	

}
