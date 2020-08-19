package com.java.exception;

import java.io.IOException;

public class ThrowExcept {
	public void excuteCheckedException() throws IOException {
		System.out.println("üũ�� ���� �߻�!!");
		
		throw new IOException("���� IO ����");
	}
	
	public void excuteUncheckedException() throws RuntimeException {
		System.out.println("��üũ�� ���� �߻�");
		//��üũ�� ���ܴ� ��κ� runtimeException�� �ڽ� Ŭ����

		throw new RuntimeException("���� ��Ÿ�� ����");
	}
	
	public double divide(int num1, int num2) 
			throws CustomArithmeticException{ // �Ʒ� ĳġ�� ������ Ŭ������ �ѹ��� �����ؼ� �ڵ� �������� ����
		
		double result =0;
		
		try {
		result = num1 / num2;
		}catch(ArithmeticException e) {
			// �Ϲ����� ���� �߻���
			// ���� ��ü���� ����� ���� ���ܷ� ��ȯ�Ͽ� throw �ϴ� ���� ������, �ڵ� ����� �۾����� �����ϴ�
			System.out.println();
			throw new CustomArithmeticException("����� ���� ����", num1, num2);
		}
		
		return result;
	}
}
