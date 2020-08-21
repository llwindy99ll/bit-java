package com.java.api;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date now = new Date();
		
		String nowstr = now.toString();
		
		System.out.println("���� ��¥: "+ nowstr );
		System.out.println("���� ��¥: "+ now.toLocaleString() );
		
		// ����ȭ�� ��� : DateFormat
		DateFormat df = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("���� ��¥: "+ df.format(now) );
		df = DateFormat.getDateInstance(DateFormat.LONG);
		System.out.println("���� ��¥: "+ df.format(now) );
		
		// �����ο� ��¥ ������ ������
		SimpleDateFormat sdf = new SimpleDateFormat("yyy�� MM�� dd�� HH�� mm�� ss��");
		System.out.println("���� ��¥: "+ sdf.format(now) );
		
		
	}

}
