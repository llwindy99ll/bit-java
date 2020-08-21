package com.java.api.generics.v2;

// ���� ���� �� �ִ� �ڽ� ����
// Generics �߿�
// Ÿ�� �Ķ���� : T : type, R:return, K:key, V:value
// ����ϱ����ؼ��� Ŭ���� ���� <T> �����ؾ���
public class Box<T> {
	T content;	// ����� ��밡��

	// Getters / Setters
	public T getContent() {
		return content;
	}

	public void setContent(T content) {
		this.content = content;
	}

}
