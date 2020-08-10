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
		//dowhileEx();
		//forEx();
		//continueEx();
		breakEx();
	}
	
	public static void breakEx() {
		// 1부터 루프를 돌려서 6 과 14로 모두 나누어 떨어지는 수는?
		
		int num=1;
		while(true) {
			if(num%6 ==0 && num %14 ==0) break;
			num++;
		}
		System.out.println("num:"+num);
		
	}
	
	public static void continueEx() {
		// 1부터 100의 배수까지 for
		// 2의 배수이거나 3의 배수이면 출력 안함
		
		for(int i=1; i<=100; i++) {
			if(i%2 ==0 || i %3 ==0) continue;
			System.out.println("i:"+i);
		}
	}
	
	public static void forEx() {
		//반봅횟수가 정해져있을때 주로 사용
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("단을 입력하시오");
		int dan = scanner.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
	
	}
	
	public static void dowhileEx() {
		// 숫자를 입력받아 합산
		// 0을 입력받으면 반복을 종료
		// 최소 한번은 실행하거나 반복조건이 loop문 안에서 결정되는경우는 do~while 
		Scanner scanner = new Scanner(System.in);
		
		int num=0;
		int total = 0;
		
		do {
			System.out.println("정수입력.[0이면 종료]");
			
			num = scanner.nextInt();	
			total += num;
		}while(num !=0);
		System.out.println("0: 입력 종료]"+"total:"+total);
		
	}
	
	public static void whileEx() {
		// 반복문 사용해서 1-100 합 구하기
		
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
			System.out.println("30일");
			break;
		case 3:
			System.out.println("31일");
			break;
		default:
			System.out.println("관리자 문의");
		}
	}
	
	public static void switchEx() {
		// switch는 전달받은 변수의 값을  이용해서 흐름을 제어
		

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
			System.out.println("관리자 문의");
		
		}
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
