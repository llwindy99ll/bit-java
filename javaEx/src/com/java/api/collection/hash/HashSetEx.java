package com.java.api.collection.hash;

import java.util.HashSet;

public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//basicHashSet();
		customHashSet();
	}
	
	private static void customHashSet() {
		// ����� ���� Ŭ������ hash �ڷ��������� ���
		HashSet<Student> hs = new HashSet();
		
		Student s1 = new Student(10,"ȫ�浿");
		Student s2 = new Student(20,"����");
		Student s3 = new Student(10,"ȫ�浿");
		
		hs.add(s1);
		hs.add(s2);
		hs.add(s3);

		System.out.println(hs);
		System.out.println("hash code:"+s1.hashCode());
		System.out.println("hash code:"+s2.hashCode());
		System.out.println("hash code:"+s3.hashCode());
		

		System.out.println("S1,S3 same hashcode?: "+ (s1.hashCode()==s3.hashCode()));
		System.out.println("S1,S3 same object?: "+ s1.equals(s3));
	}
	
	private static void basicHashSet() {
		// ������ �߿����� �ʰ� �ߺ��� ������� �ʴ� ������ set
		HashSet<String> hs =  new HashSet();
		
		// ��ü�� �߰�
		hs.add("Java");
		hs.add("C");
		hs.add("C++");
		hs.add("Python");
		
		System.out.println("SET:"+hs);
		System.out.println("ũ��:"+hs.size());
	
		// ���Կ��� Ȯ��
		System.out.println("C++ ����? :"+hs.contains("C++"));
		System.out.println("Linux ����? :"+hs.contains("Linux"));
		
		// ����  : ���� �ε����� �����Ƿ� ��ü ������ ����
		hs.remove("C++");
		System.out.println(hs);
		
		
			
	}

}
