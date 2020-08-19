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
			System.out.println("예외메시지: "+ e.getMessage());
			e.printStackTrace();
			
		}
		System.out.println("End of code");
		
	}
	
	public static void indexOutofBoundEx() {
		int[] intArray = new int[] {3,6,9};
		
		System.out.println("비열의 길이:"+intArray.length);
		try {
			System.out.println(intArray[3]);
		}catch(IndexOutOfBoundsException e) {
			System.out.println("예외메시지:"+ e.getMessage());
		}
	}
	
	public static void arithmeticExceptionEx() {
		
		Scanner scan = new Scanner(System.in);
		
		double result = 0;
		int num;
		
		System.out.println("정수를 입력하세요");
		
		try {
			num = scan.nextInt();
			result = 100/num;
		}catch(ArithmeticException e) {		
			//정수 입력에 대한 예외만 처리할 수 있음
			System.err.println("예외발생 : "+e.getMessage() );
		}catch(InputMismatchException e) {  
			//문자입력에 대한 에러를 처리하기 위해
			System.err.println("정수만 입력하시오 : "+e.getMessage() );
			
			//예외상황 전체를 확인하고자 할때
			e.printStackTrace();  
		}catch(Exception e) {
			// 최종적으로 남아있는 모든 예외를 처리
			// 일반적인 예외를 여기서 처리하고 위에서는 구체적인 예외를 처리
			e.printStackTrace();
		}finally{
			// 예외와 상관없이 항상 실행
			// 자원 정리 작업에 사용
			System.out.println();
		}
		
		System.out.println("결과:"+ result);
		scan.close();
		
		
	}
}
