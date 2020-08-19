package com.java.exception;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.text.DefaultEditorKit.CutAction;

public class ExceptionEx {
	
	public static void main(String[] args) {
		//arithmeticExceptionEx();
		//indexOutofBoundEx();
		//nullpointerExceptionEx();
		customException();
	}
	
	private static void customException() {
		// 사용자 정의 예외 활용
		ThrowExcept ex = new ThrowExcept();
		
		try {
			//ex.excuteCheckedException();	// 반드시 예외처리를 해야 에러 없어짐
			ex.excuteUncheckedException(); 	// 언체크드(런타임 에러)는 문법 오류 없음
		
			System.out.println("10/0="+ex.divide(10, 0));

		}
		
		 //catch(IOException e) { System.err.println("에외 메시지"+ e.getMessage()); }
		 catch(CustomArithmeticException e) {	
			//순서가 중요함 맨아래로 위치시 에러남
			// 런타임 예외의 자손이므로 런타임에러보다 위에서 캐치해줘야 에러 안남
			
			System.out.println("사용자 정의 메시지"+ e.getMessage());
			System.out.printf("예외상황 발생시 num1=%d, num2=%d", e.getNum1(), e.getNum2());
			
		}catch(RuntimeException e) {
			System.err.println("런타임 에러:"+ e.getMessage());
		}
		
		
		
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
