package com.java.api.arrays;
import java.util.Arrays;

//arrays ��ƿ��Ƽ Ŭ���� Ȱ�� : �迭�� ����, ������, �˻�
public class ArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		arraysCopyEx();
	}
	
	private static void arraysCopyEx() {
		char src[] = "Java Programming".toCharArray();
		char target[]  = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length);
	}

}
