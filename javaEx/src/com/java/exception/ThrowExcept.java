package com.java.exception;

import java.io.IOException;

public class ThrowExcept {
	public void excuteCheckedException() throws IOException {
		System.out.println("체크드 예외 발생!!");
		
		throw new IOException("강제 IO 예외");
	}
	
	public void excuteUncheckedException() throws RuntimeException {
		System.out.println("언체크드 예외 발생");
		//언체크드 에외는 대부분 runtimeException의 자식 클래스

		throw new RuntimeException("강제 런타임 에러");
	}
	
	public double divide(int num1, int num2) 
			throws CustomArithmeticException{ // 아래 캐치에 있으나 클래스에 한번더 선언해서 코드 가독성을 높임
		
		double result =0;
		
		try {
		result = num1 / num2;
		}catch(ArithmeticException e) {
			// 일반적인 예외 발생시
			// 보다 구체적인 사용자 정의 예외로 전환하여 throw 하는 것이 가독성, 코드 디버그 작업에서 유리하다
			System.out.println();
			throw new CustomArithmeticException("사용자 정의 예외", num1, num2);
		}
		
		return result;
	}
}
