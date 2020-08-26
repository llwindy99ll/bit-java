package com.java.thread.v1;

public class MainThread {

	public static void main(String[] args) {
		// 메인스레드는 A 부터 Z 까지 0.3초 간격으로 출력
		// 메인스레드와 별도로 다른 작업이 필요하면 thread 생성
		
		// 보조스레드
		DigitThread dt = new DigitThread();
		dt.setName("DigitThread");
		dt.start();
		
		// 메인스레드
		try {
			for(char ch ='A'; ch<='Z'; ch++) {
				System.out.println("MainThread: "+ ch);
				Thread.sleep(300);
			}
				

		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
}
