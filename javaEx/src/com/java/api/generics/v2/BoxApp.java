package com.java.api.generics.v2;

public class BoxApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Box<Integer> intbox = new Box<Integer>();
		//Box<Integer> intbox = new Box<��������>();
		Box<Integer> intbox = new Box<>();

		//intbox.setContent("10"); //�����Ϸ��� Generics �� üũ --> Object ������ ���� �ȳ�
		intbox.setContent(10);
		//�ٿ�ĳ���� �ʿ� --> ĳ���� ���ʿ�
		int contents = intbox.getContent();
		System.out.println("Contents: " + intbox.getContent());
		
		Box<String> strbox = new Box<String>();
		strbox.setContent("Java");
		//�ٿ�ĳ���� �ʿ�
		String contents2 = strbox.getContent();
		System.out.println("Contents: " + strbox.getContent());
		
		//object ���� �����߻��� ������ ����  �Ʒ� �� �����ڵ�
		//contents2 = (String)intbox.getContent();  --> ĳ���� �߸��ϸ� ������ ��ü�� �ȵ�
		System.out.println("Contents: " + contents2);
		
		
		
	}

}
