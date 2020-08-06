package com.java.basic;

import java.util.Scanner;

public class ConsoleEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//consoleOutput();
		consoleInput();
		
	}
	
	public static void consoleInput() {
		//스캐너를 클래스를 활용한 다양한 입력 소스 사용
		// Tip 1. Ctrl + shift + o -> 자동 import
		// Tip 2. Ctrl + Space -> Code Assist
		
		Scanner scanner = new Scanner(System.in);
		String data = scanner.toString();

		System.out.println("이름?" );
		String name = scanner.next();
	
		System.out.println("나이는 몇살입니까?" );
		int age = scanner.nextInt();
		
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age);
		
		
		
		
	}
	
	public static void consoleOutput() {
		// 콘솔출력 : System.out.print, System.out.println, System.out.printf(형식화된 출력)
		
		System.out.print("Hello "  );
		System.out.println("JAVA");
		
		// 이스케이프 문자
		System.out.println("Hello\nJAVA");
		System.out.println("Hello\tJAVA");
		System.out.println("Hello\"JAVA\" ");
		
		//파일을 다뤄야 하는 경우
		String dir = "C:\\Setup.txt";
		
		System.out.println(dir);
		
	}

}
