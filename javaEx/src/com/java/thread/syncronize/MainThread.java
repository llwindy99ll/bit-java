package com.java.thread.syncronize;


// 객체를 공유하는 작업 쓰레드의 경우 임계 영역을 적절히 제어해 줘야 한다
public class MainThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SharedMemory memory = new SharedMemory();
		User user1 = new User("철수", memory, 100);
		user1.start();
		
		User user2 = new User("영이", memory, 200);
		user2.start();
		
		User user3 = new User("호철", memory, 300);
		user3.start();
		
		
	}

}
