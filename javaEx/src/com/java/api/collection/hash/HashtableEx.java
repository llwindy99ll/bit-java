package com.java.api.collection.hash;

import java.util.Hashtable;
import java.util.Iterator;

public class HashtableEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Hashtalbe : Map �� �ڷ���
		// key-value �������� �����ϸ� key�� �ߺ��ɼ� ����
		
		Hashtable<String, Classroom> map = new Hashtable();
		
		map.put("101", new Classroom("Java", "R101"));
		map.put("202", new Classroom("C", "R202"));
		map.put("303", new Classroom("Python", "R303"));
		map.put("404", new Classroom("Linux", "R404"));
		
		System.out.println(map);
		
		//������ �������� :get
		System.out.println("303���ǽ��� ����: " + map.get("303") );
		
		// �������� ���� : put -> �̹� ������ ������ �����
		map.put("202", new Classroom("C#", "R202"));
		System.out.println(map);
		
		// Ű�� �ִ��� Ȯ�� : containskey
		System.out.println("Ű�� 202 �� �ִ±�?"+ map.containsKey("202"));
		System.out.println("Ű�� 501 �� �ִ±�?"+ map.containsKey("501"));
		

		System.out.println("Java�� �ִ±�?"+ map.containsValue("Java"));
		// hashtable���� ���� Student Ŭ������ ����־� �Ϲ����� ���� �񱳴� �ȵ�

		System.out.println("Java���ǰ� �ִ±�?"+ map.containsValue( new Classroom("Java") ));
		// hashcode, equals �� ������ �������̵� �Ǿ��־�� ���� �۵�
		
		Iterator<String> it = map.keySet().iterator();
		
		while (it.hasNext()) {
			Classroom room = map.get(it.next());
			System.out.println(room);
			
		}
		map.clear();
		
		System.out.println(map);
			
	}

}



