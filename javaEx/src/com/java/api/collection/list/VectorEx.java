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
		
		System.out.println("없는객체의 인덱스:" + v.indexOf(0));
		
		//버퍼 비우기
		v.clear();
		System.out.println("vector:" + v);
		System.out.println("size:"+ v.size() + ",   capacity:"+v.capacity());
		//늘어난 버퍼는 유지됨
		
		//Generics : nuㅡber클래스를 부모로가진 모든 자식클래스를 참조 가능
		Vector<? super Number> v2 = new Vector();
		v2.addElement(2020);
		v2.addElement(3.14159f);
		//v2.addElement(true);  //number의 자식클래스가 아님
		System.out.println("vector:" + v2);
		
		// Enumeration 통해서 하나씩 꺼낼수 있음
		Enumeration<? super Number> e = v2.elements();
		
		while(e.hasMoreElements()) {
			System.out.println("요소: "+ 	e.nextElement());
			
			
		}
			
	}

}
