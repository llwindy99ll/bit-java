package com.java.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(10,20);
		System.out.println("Cloneable="+ (p instanceof Cloneable) );
		
		//JAVA�� �ֻ��� Ŭ������ Object
		// ���Ŭ������ Object�� �����  �����޴´�
		// Object �κ��� ���� ���
		
		System.out.println(p.getClass().getSimpleName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());	// Ŭ������@�ּ�
		System.out.println(p);
		
		//�θ����� Ȯ��
		System.out.println(p.getClass().getSuperclass().getName() );
		System.out.println(p.getClass().getSuperclass().getSimpleName());
				
	}

	// toString : print Ȥ�� ���ڿ��� ����� �� ȣ��Ǿ
	// ��°��� ����
	@Override
	public String toString() {
		return "LangClassTest [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
