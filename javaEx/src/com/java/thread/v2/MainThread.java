package com.java.thread.v2;

public class MainThread {

	public static void main(String[] args) {
		// 메인스레드는 A 부터 Z 까지 0.3초 간격으로 출력
		// 메인스레드와 별도로 다른 작업이 필요하면 thread 생성
		
		Thread thread1 = new Thread(new DigitThread());
		thread1.setName("DigitThread");
		thread1.start();

		
		// runnable 이용한 thread 
		Thread thread2 = new Thread(new AlphabetRunnable());
		thread2.start();
		
		// 메인스레드가 종료되면 working 스레드가 통제할 수 없게외므로
		// 작업스레드의 흐름을 메인 스레드의 흐에 합류
		try{
			thread1.join(); 	//메인스레드 흐름에 합류
			thread2.join();
			
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("메인스레드 종료");
		
		
//		// 메인스레드
//		try {
//			for(char ch ='a'; ch<='z'; ch++) {
//				System.out.println("MainThread: "+ ch);
//				Thread.sleep(300);
//			}
//				
//
//		
//		}catch(InterruptedException e) {
//			e.printStackTrace();
//		}
	}
}
