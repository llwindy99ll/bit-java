package com.java.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;

public class HashtableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hashtalbe : Map 형 자료형
		// key-value 형식으로 관리하며 key는 중복될수 없다
		
		Hashtable<String, Classroom> map = new Hashtable();
		
		map.put("101", new Classroom("Java", "R101"));
		map.put("202", new Classroom("C", "R202"));
		map.put("303", new Classroom("Python", "R303"));
		map.put("404", new Classroom("Linux", "R404"));
		
		System.out.println(map);
		
		//데이터 가져오기 :get
		System.out.println("303강의실의 강의: " + map.get("303") );
		
		// 데이터의 변경 : put -> 이미 있으면 데이터 덥어쓰기
		map.put("202", new Classroom("C#", "R202"));
		System.out.println(map);
		
		// 키가 있는지 확인 : containskey
		System.out.println("키에 202 가 있는기?"+ map.containsKey("202"));
		System.out.println("키에 501 가 있는기?"+ map.containsKey("501"));
		

		System.out.println("Java가 있는기?"+ map.containsValue("Java"));
		// hashtable에는 현재 Student 클래스가 담겨있어 일반적인 문자 비교는 안됨

		System.out.println("Java강의가 있는기?"+ map.containsValue( new Classroom("Java") ));
		// hashcode, equals 가 적절히 오버라이드 되어있어야 정상 작동
		
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			Classroom room = map.get(it.next());
			System.out.println(room);
			
		}
		map.clear();
		
		System.out.println(map);
			
	}

}



