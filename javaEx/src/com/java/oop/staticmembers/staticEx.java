package com.java.oop.staticmembers;

public class staticEx {
	public static int refCount; //Ŭ���� ����
	public static String classVar; // Ŭ���� ����
	public String instanceVar;
	
	// static ������ �ʱ�ȭ
	static {
		refCount = 0;
		classVar = "Static Member";
		//instanceVar = "Instance Memeber";  <-- Error : static �������� instance ���� �Ұ�
		
		System.out.println("Static Block");
	}
	public staticEx() {
		refCount++; // static ���������� ��� instance ���� ���� ����
		instanceVar = "Instance Member";
		
		System.out.println("refCount:"+ refCount);
		System.out.println("�ν��Ͻ� ����");
	}
	
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		super.finalize();
		System.out.println("�Ҹ��� ȣ��");
	}
}
