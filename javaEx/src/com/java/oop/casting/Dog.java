package com.java.oop.casting;

public class Dog extends Animal {

	public Dog(String name) {
		super(name);	//�θ��� �����ڴ� �ݵ�� ȣ���ؾ���, �ڽ� ������ �ȸ���� �ڵ����� default �ڽ� ������ ���� �θ������ ȣ��
		
	}
	
	public void bark() {
		System.out.println(name+": �۸�");
		
	}
}
