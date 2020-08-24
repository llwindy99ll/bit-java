package com.java.api.collection.hash;

// hash 계열 자료형이 객체의 동등성을 비교하는 방법
// 1. hashcode 의 비교
// 2. equals 를 이용한 비교
//
public class Student {
	private String name;
	private int code;
	
	public Student(int code, String name) {
		this.code = code;
		this.name = name;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// 체크후 다운케스팅
		if(obj instanceof Student) {
			Student other = (Student)obj;
			return name.equals(other.name) && code == other.code;
		}
	
		return super.equals(obj);
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();	// 메모리 주소
		return code;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", code=" + code + "]";
	}
	
	
}
