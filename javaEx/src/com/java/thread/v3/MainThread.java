package com.java.thread.v3;

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
		
		// 스레드의 실행 우선순위 : 자원이 부족할 경우 먼저 수행해야할 스레드의 우선순위
		// 1~10 : 높은 숫자가 최우선, 일반적인 우선순위는 5(NORM_PRIORITY)
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread2.setPriority(Thread.MAX_PRIORITY);
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
