package com.java.oop.casting;

public class Animal {
	// �ڽ�Ŭ�������� ����ϱ� ���� protected ���
	protected String name;
	
	public Animal(String name) {
		this.name = name;
		
	}
	
	public void eat() {
		System.out.println(name+"�� �԰��ֽ��ϴ�");
	}
	
	public void walk() {
		System.out.println(name+"�� �Ȱ��ִ�");
	}

}
