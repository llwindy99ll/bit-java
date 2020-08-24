package com.java.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {

		// list에는 실제 구현과는 별도로 list에서 처리해야함
		// 기능의 목록만 선언되어있어 실제 클래스에서는 인터페이스를 구현한 실제 로직이 담겨있다
		List<String> linkedlist1 = new LinkedList<>(); 
		listEx(linkedlist1);
		
		List<String> linkedlist2 = new ArrayList<>(); 
		listEx(linkedlist2);
		 
	}
	
	private static void listEx(List list) {
		// list는 인터페이스로 실체 클래스는 교체 가능
		// 객체의 추가 : add 
		
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Python");
		
		System.out.println(list);
		
		//객체의 삽입, add
		list.add(2,"C#");
		System.out.println(list);
		
		//중복 삽입
		list.add(2,"C#");
		System.out.println(list);
		
		// 삭제
		// 1. 인덱스를 이용한 삭제
		list.remove(2);
		System.out.println(list);
		// 2. 객체를 이용한 삭제
		list.remove("Python");
		System.out.println(list);
		
		// 객체의 순회 : 객체를 하나씩 뽑아내기
		// list 와 set 등에서는 Iterator를 추출하여 순회
		
		Iterator<String> It = list.iterator();
		
		while(It.hasNext()) {
			String item = It.next();
			System.out.println("노드데이터:" + item);
		}
		
		list.clear();
		System.out.println(list);
		
	}

}








