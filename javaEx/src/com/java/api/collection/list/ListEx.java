package com.java.api.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ListEx {

	public static void main(String[] args) {

		// list���� ���� �������� ������ list���� ó���ؾ���
		// ����� ��ϸ� ����Ǿ��־� ���� Ŭ���������� �������̽��� ������ ���� ������ ����ִ�
		List<String> linkedlist1 = new LinkedList<>(); 
		listEx(linkedlist1);
		
		List<String> linkedlist2 = new ArrayList<>(); 
		listEx(linkedlist2);
		 
	}
	
	private static void listEx(List list) {
		// list�� �������̽��� ��ü Ŭ������ ��ü ����
		// ��ü�� �߰� : add 
		
		list.add("Java");
		list.add("C");
		list.add("C++");
		list.add("Python");
		
		System.out.println(list);
		
		//��ü�� ����, add
		list.add(2,"C#");
		System.out.println(list);
		
		//�ߺ� ����
		list.add(2,"C#");
		System.out.println(list);
		
		// ����
		// 1. �ε����� �̿��� ����
		list.remove(2);
		System.out.println(list);
		// 2. ��ü�� �̿��� ����
		list.remove("Python");
		System.out.println(list);
		
		// ��ü�� ��ȸ : ��ü�� �ϳ��� �̾Ƴ���
		// list �� set ����� Iterator�� �����Ͽ� ��ȸ
		
		Iterator<String> It = list.iterator();
		
		while(It.hasNext()) {
			String item = It.next();
			System.out.println("��嵥����:" + item);
		}
		
		list.clear();
		System.out.println(list);
		
	}

}








