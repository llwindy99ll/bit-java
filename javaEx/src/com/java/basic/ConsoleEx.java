package com.java.basic;

import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//consoleOutput();
		consoleInput();
		
	}
	
	public static void consoleInput() {
		//��ĳ�ʸ� Ŭ������ Ȱ���� �پ��� �Է� �ҽ� ���
		// Tip 1. Ctrl + shift + o -> �ڵ� import
		// Tip 2. Ctrl + Space -> Code Assist
		
		Scanner scanner = new Scanner(System.in);
		String data = scanner.toString();

		System.out.println("�̸�?" );
		String name = scanner.next();
	
		System.out.println("���̴� ����Դϱ�?" );
		int age = scanner.nextInt();
		
		System.out.println("�̸�: "+ name);
		System.out.println("����: "+ age);
		
		
		
		
	}
	
	public static void consoleOutput() {
		// �ܼ���� : System.out.print, System.out.println, System.out.printf(����ȭ�� ���)
		
		System.out.print("Hello "  );
		System.out.println("JAVA");
		
		// �̽������� ����
		System.out.println("Hello\nJAVA");
		System.out.println("Hello\tJAVA");
		System.out.println("Hello\"JAVA\" ");
		
		//������ �ٷ�� �ϴ� ���
		String dir = "C:\\Setup.txt";
		
		System.out.println(dir);
		
	}

}
