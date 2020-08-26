package com.java.thread.v2;

public class DigitThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		// 주의 : run 메소드를 직접 호출하면 Thread 동작하지 않고 일반 메서드로 동작
		// start() 메서드로 실행
		super.run();
		
		// 보조스레드
		try {
			for(int i =1; i<=30; i++) {
				System.out.println(getName()+": "+ i);
				Thread.sleep(300);
			}
				
		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
	}


	
}
