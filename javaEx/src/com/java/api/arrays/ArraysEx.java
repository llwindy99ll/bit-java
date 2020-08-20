package com.java.api.arrays;
import java.util.Arrays;

//arrays 유틸리티 클래스 활용 : 배열의 복제, 정ㄹ렬, 검색
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
