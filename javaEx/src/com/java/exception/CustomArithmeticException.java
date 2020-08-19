package com.java.exception;

// ArithmeticException 을 확장한 사용자 정의 예외 객체
// 상황정보를 추가한 커스텀 예외 객체
public class CustomArithmeticException extends ArithmeticException {
	// 필드 : 예외발생 당시의 상황정보 : 데이터
	
	private int num1;
	private int num2;
	
	public CustomArithmeticException(String msg, int num1, int num2) {
		super(msg);  //기존 getmessage를 부모생성자로 전달
		
		this.num1 = num1;
		this.num2 = num2;
	
			
	}
	
	// getter/setter
	public int getNum1() {
		return num1;
	}

	public void setNum1(int num1) {
		this.num1 = num1;
	}

	public int getNum2() {
		return num2;
	}

	public void setNum2(int num2) {
		this.num2 = num2;
	}
	

}
