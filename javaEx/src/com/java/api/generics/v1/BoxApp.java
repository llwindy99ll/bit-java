package com.java.api.generics.v1;

public class BoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box intbox = new Box();
		intbox.setContent(10);
		//�ٿ�ĳ���� �ʿ�
		int contents = (int)intbox.getContent();
		System.out.println("Contents: " + intbox.getContent());
		
		Box strbox = new Box();
		strbox.setContent("Java");
		//�ٿ�ĳ���� �ʿ�
		String contents2 = (String)strbox.getContent();
		System.out.println("Contents: " + strbox.getContent());
		
		//object ���� �����߻��� ������ ����  �Ʒ� �� �����ڵ�
		contents2 = (String)intbox.getContent();
		System.out.println("Contents: " + contents2);
		
		
		
	}

}
