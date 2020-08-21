package com.java.api.collection.list;

import java.util.Enumeration;
import java.util.Vector;

import com.sun.jmx.snmp.Enumerated;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<Integer> v = new Vector();
		System.out.println("vector:" + v);
		
		System.out.println("size:"+ v.size() + ",   capacity:"+v.capacity());
		
		for(int i=1; i<=10; i++)
			v.addElement(i);
		System.out.println("size:"+ v.size() + ",   capacity:"+v.capacity());
		v.addElement(11);
		System.out.println("size:"+ v.size() + ",   capacity:"+v.capacity());
		
		System.out.println("vector:" + v);
		v.insertElementAt(5, 7);
		System.out.println("vector:" + v);
		
		System.out.println("���°�ü�� �ε���:" + v.indexOf(0));
		
		//���� ����
		v.clear();
		System.out.println("vector:" + v);
		System.out.println("size:"+ v.size() + ",   capacity:"+v.capacity());
		//�þ ���۴� ������
		
		//Generics : nu��berŬ������ �θ�ΰ��� ��� �ڽ�Ŭ������ ���� ����
		Vector<? super Number> v2 = new Vector();
		v2.addElement(2020);
		v2.addElement(3.14159f);
		//v2.addElement(true);  //number�� �ڽ�Ŭ������ �ƴ�
		System.out.println("vector:" + v2);
		
		// Enumeration ���ؼ� �ϳ��� ������ ����
		Enumeration<? super Number> e = v2.elements();
		
		while(e.hasMoreElements()) {
			System.out.println("���: "+ 	e.nextElement());
			
			
		}
			
	}

}
