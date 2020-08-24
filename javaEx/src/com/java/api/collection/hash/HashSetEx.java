package com.java.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//basicHashSet();
		customHashSet();
	}
	
	private static void customHashSet() {
		// 사용자 정의 클래스의 hash 자료형에서의 사용
		HashSet<Student> hs = new HashSet();
		
		Student s1 = new Student(10,"홍길동");
		Student s2 = new Student(20,"장길산");
		Student s3 = new Student(10,"홍길동");
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);

		System.out.println(hs);
		System.out.println("hash code:"+s1.hashCode());
		System.out.println("hash code:"+s2.hashCode());
		System.out.println("hash code:"+s3.hashCode());
		

		System.out.println("S1,S3 same hashcode?: "+ (s1.hashCode()==s3.hashCode()));
		System.out.println("S1,S3 same object?: "+ s1.equals(s3));
	}
	
	private static void basicHashSet() {
		// 순서가 중요하지 않고 중복을 허용하지 않는 데이터 set
		HashSet<String> hs =  new HashSet();
		
		// 객체의 추가
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		
		System.out.println("SET:"+hs);
		System.out.println("크기:"+hs.size());
	
		// 포함여부 확인
		System.out.println("C++ 포함? :"+hs.contains("C++"));
		System.out.println("Linux 포함? :"+hs.contains("Linux"));
		
		// 삭제  : 순서 인덱스가 없으므로 객체 삭제만 가능
		hs.remove("C++");
		System.out.println(hs);
		
		
			
	}

}
