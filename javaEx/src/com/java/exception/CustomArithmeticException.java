package com.java.exception;

// ArithmeticException �� Ȯ���� ����� ���� ���� ��ü
// ��Ȳ������ �߰��� Ŀ���� ���� ��ü
public class CustomArithmeticException extends ArithmeticException {
	// �ʵ� : ���ܹ߻� ����� ��Ȳ���� : ������
	
	private int num1;
	private int num2;
	
	public CustomArithmeticException(String msg, int num1, int num2) {
		super(msg);  //���� getmessage�� �θ�����ڷ� ����
		
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
