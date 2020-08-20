package com.java.api.arrays;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import sun.security.provider.certpath.CollectionCertStore;

// 사용자 정의 객체가 정렬, 비교기능을 수행하기 위해서는 comparalbe 인터페이스를 구현해야한다
//arrays 유틸리티 클래스 활용 : 배열의 복제, 정ㄹ렬, 검색
public class ArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arraysCopyEx();
		//basicSortTest();
		//customsortEx();
		//basicSearch();
		customSearch();
	}
	
	private static void customSearch() {
		Member[] members = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("임꺽정"),
				new Member("장길산")
		};
		
		System.out.println("원본 배열: "+Arrays.toString(members) );
		
		int index = Arrays.binarySearch(members, "장길산");	//문자열로 검색시 부정확한 값이 나옴
		System.out.println("장길산 인덱스는?: " + index);
		// 사용자 정의 객체의 정렬은 객체를 넘겨줘야 함
		index = Arrays.binarySearch(members, new Member("장길산") );	//내부 compareto 메서드 구현되어 있어서 정확한 값 나옴
		System.out.println("장길산 인덱스는?: " + index);
		
		Arrays.sort(members);
		System.out.println("정렬된 배열: "+Arrays.toString(members) );
		index = Arrays.binarySearch(members, new Member("장길산") );
		System.out.println("정렬된 장길산 인덱스는?: " + index);
		
		
	}
	
	//자바는 기본적으로 바이너리 서치를 채택
	private static void basicSearch() {
		int[] num = {5,4,6,2,3,4,8,1,7};
		
		System.out.println("원본 배열: "+Arrays.toString(num) );
		Arrays.sort(num);
		System.out.println("정렬 배열: "+Arrays.toString(num) );
		int index = Arrays.binarySearch(num, 3);
		System.out.println("3의 인덱스는?: " + index);
		
		
		String[] items = {"Java","C","C++", "Python","Linux"};
		System.out.println("원본 배열: "+Arrays.toString(items) );
		
		int index2 = Arrays.binarySearch(items, "Linux");
		System.out.println("Linux의 인덱스는?: " + index2);
		
		Arrays.sort(items);
		System.out.println("정렬 배열: "+Arrays.toString(items) );
		index2 = Arrays.binarySearch(items, "Linux");
		System.out.println("Linux의 인덱스는?: " + index2);
		
		
		
		
		//System.out.println("3의 인덱스는?: " + index);
		
	}
	
	private static void customsortEx() {
		Member[] members = {
				new Member("홍길동"),
				new Member("고길동"),
				new Member("임꺽정"),
				new Member("장길산")
		};
		
		System.out.println("원본 배열: "+Arrays.toString(members) );
		
		
		Arrays.sort(members);
		System.out.println("정렬된 배열: "+Arrays.toString(members) );
		
		
	}
	
	private static void  basicSortTest() {
		int[] scores = {10,20,30,40,22,90,88,44};
		
		System.out.println(Arrays.toString(scores) );
		
		// 오름차순 정렬
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores) );
		
		Integer[] intger = {10,20,30,40,22,90,88,44};
		
		// 내림차순 정렬
		Arrays.sort(intger, Collections.reverseOrder());
		System.out.println(Arrays.toString(intger) );
		
	}
	
	private static void arraysCopyEx() {
		char src[] = "Java Programming".toCharArray();
		char target[]  = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length);
		
		System.out.println("target : "+target);
		System.out.println(Arrays.toString(target));
		
		// arrays.copyof 활용
		target = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(target));
		
		target = Arrays.copyOfRange(src, 5, 11);
		System.out.println(Arrays.toString(target));
		
	}

}
