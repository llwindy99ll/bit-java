package com.java.api;

public class StringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stringBasic();
		stringMethods();
	}
	
	public static void stringMethods() {
		String s = "Java Programming is fun ?";
		
		System.out.println("����:" + s.length());
		System.out.println("�빮�ڷ�:"+ s.toUpperCase());
		System.out.println("�ҹ��ڷ�:"+ s.toLowerCase());
		
		// ��ȯ �޼��带 �����ص� ���ε����ʹ� ������� ���� , replace, substring ��
		
		//
		StringBuffer sb = new StringBuffer("This is");
		sb.append(" pen");
		System.out.println(sb);
		
		sb.insert(8,"my ");
		System.out.println(sb);
		
		sb.replace(8, 10, "your");
		System.out.println(sb);
		
		
		
		
	}

	public static void stringBasic() {
		String s1 = "Java";  // ���ͷ� - �ҽ��ڵ忡 ���� �Է�
		String s2 = new String("Java"); //�޸𸮿� �� ��ü
		String s3 = "Java"; // ���ͷ�
		
		// ���� ���� �������� ���ͷ��� �� ��ü�� ��
		System.out.println("s1==s2 ?  "+ (s1==s2));
		// ���� ���ä��� ���� �� ��ü ���ͷ��� ��
		System.out.println("s1==s3 ?  "+ (s1==s3));
		
		// char�� �迭�� ����� ���ڿ��� ����
		char[] letters= {'J','a','v','a'};
		String s4 = new String(letters);
		System.out.println("s4  "+ s4);
		
		// �⺻ Ÿ���� ���ڿ� ��ü�� ��ȯ
		String s5 = String.valueOf((Math.PI));
		System.out.println("s5 "+ s5);
		

		
	}
}
