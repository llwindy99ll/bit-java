package com.java.oop.staticmembers;


// ���Ȳ������ �ݵ�� �ϳ��� �ν��Ͻ��� �����ؾ� �ϴ� ���
public class Singleton {
	
	// �ν��Ͻ��� static����  ����, Ŭ���� ������ ���ѹ� ȣ���
	private static Singleton instance =  new Singleton();
	
	// ������
	private Singleton() {
	//���� �ι� ȣ��Ǹ� �ȵ�
		
	}
	
	// getter�� Ȱ���ؼ� ��ȸ ����
	public static Singleton getInstance() {
		return instance;
	}

}
