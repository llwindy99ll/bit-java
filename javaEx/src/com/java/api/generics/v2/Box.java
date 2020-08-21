package com.java.api.generics.v2;

// 모든걸 담을 수 있는 박스 생성
// Generics 중요
// 타입 파라미터 : T : type, R:return, K:key, V:value
// 사용하기위해서는 클래스 옆에 <T> 선언해야함
public class Box<T> {
	T content;	// 모든지 사용가능

	// Getters / Setters
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

}
