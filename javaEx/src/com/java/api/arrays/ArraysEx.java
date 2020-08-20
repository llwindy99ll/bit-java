package com.java.api.arrays;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

import sun.security.provider.certpath.CollectionCertStore;

// ����� ���� ��ü�� ����, �񱳱���� �����ϱ� ���ؼ��� comparalbe �������̽��� �����ؾ��Ѵ�
//arrays ��ƿ��Ƽ Ŭ���� Ȱ�� : �迭�� ����, ������, �˻�
public class ArraysEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//arraysCopyEx();
		//basicSortTest();
		//customsortEx();
		//basicSearch();
		customSearch();
	}
	
	private static void customSearch() {
		Member[] members = {
				new Member("ȫ�浿"),
				new Member("��浿"),
				new Member("�Ӳ���"),
				new Member("����")
		};
		
		System.out.println("���� �迭: "+Arrays.toString(members) );
		
		int index = Arrays.binarySearch(members, "����");	//���ڿ��� �˻��� ����Ȯ�� ���� ����
		System.out.println("���� �ε�����?: " + index);
		// ����� ���� ��ü�� ������ ��ü�� �Ѱ���� ��
		index = Arrays.binarySearch(members, new Member("����") );	//���� compareto �޼��� �����Ǿ� �־ ��Ȯ�� �� ����
		System.out.println("���� �ε�����?: " + index);
		
		Arrays.sort(members);
		System.out.println("���ĵ� �迭: "+Arrays.toString(members) );
		index = Arrays.binarySearch(members, new Member("����") );
		System.out.println("���ĵ� ���� �ε�����?: " + index);
		
		
	}
	
	//�ڹٴ� �⺻������ ���̳ʸ� ��ġ�� ä��
	private static void basicSearch() {
		int[] num = {5,4,6,2,3,4,8,1,7};
		
		System.out.println("���� �迭: "+Arrays.toString(num) );
		Arrays.sort(num);
		System.out.println("���� �迭: "+Arrays.toString(num) );
		int index = Arrays.binarySearch(num, 3);
		System.out.println("3�� �ε�����?: " + index);
		
		
		String[] items = {"Java","C","C++", "Python","Linux"};
		System.out.println("���� �迭: "+Arrays.toString(items) );
		
		int index2 = Arrays.binarySearch(items, "Linux");
		System.out.println("Linux�� �ε�����?: " + index2);
		
		Arrays.sort(items);
		System.out.println("���� �迭: "+Arrays.toString(items) );
		index2 = Arrays.binarySearch(items, "Linux");
		System.out.println("Linux�� �ε�����?: " + index2);
		
		
		
		
		//System.out.println("3�� �ε�����?: " + index);
		
	}
	
	private static void customsortEx() {
		Member[] members = {
				new Member("ȫ�浿"),
				new Member("��浿"),
				new Member("�Ӳ���"),
				new Member("����")
		};
		
		System.out.println("���� �迭: "+Arrays.toString(members) );
		
		
		Arrays.sort(members);
		System.out.println("���ĵ� �迭: "+Arrays.toString(members) );
		
		
	}
	
	private static void  basicSortTest() {
		int[] scores = {10,20,30,40,22,90,88,44};
		
		System.out.println(Arrays.toString(scores) );
		
		// �������� ����
		Arrays.sort(scores);
		System.out.println(Arrays.toString(scores) );
		
		Integer[] intger = {10,20,30,40,22,90,88,44};
		
		// �������� ����
		Arrays.sort(intger, Collections.reverseOrder());
		System.out.println(Arrays.toString(intger) );
		
	}
	
	private static void arraysCopyEx() {
		char src[] = "Java Programming".toCharArray();
		char target[]  = new char[src.length];
		System.arraycopy(src, 0, target, 0, src.length);
		
		System.out.println("target : "+target);
		System.out.println(Arrays.toString(target));
		
		// arrays.copyof Ȱ��
		target = Arrays.copyOf(src, src.length);
		System.out.println(Arrays.toString(target));
		
		target = Arrays.copyOfRange(src, 5, 11);
		System.out.println(Arrays.toString(target));
		
	}

}
