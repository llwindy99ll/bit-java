package com.java.basic.reftypes;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringBasic();
		stringFormat();
	}
	
	public static void stringFormat() {
		String fruit = "���";
		int total =10;
		int eat =3;
		
		String fmt = "%d���� %s�߿��� %d���� �Ծ���%n";
		System.out.printf(fmt, total, fruit, eat);
		// ǥ�� ���� ������ ����
		// ���ο� ���ڿ��� �����Ҷ� Ȱ���Ѵ�
		String  res = String.format("���̻���� %s �Դϴ�", Math.PI);
		System.out.println(res);
		res = String.format("���̻���� %.3f �Դϴ�", Math.PI);
		System.out.println(res);
	}

	public static void stringBasic() {
		String str1;
		str1 = "java"; // ���ͷ� ����
		String str2 = "java";
		String str3 = new String("java");
		
		//���ͷ��� ��� ������ ������ �ּҰ� ����
		System.out.println((str1==str2));
		System.out.println((str2==str3) );
		
		System.out.println(str1.equals(str2));
		System.out.println(str2.equals(str3));
		
		
	}
}
