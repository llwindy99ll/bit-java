package com.java.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First in First Out
		// Queue는 인터페이스만 제공
		// 실체클래스는  list 클래스 이용
		
		Queue<Integer> queue = new LinkedList();
		
		// 데이터의 제공 offer
		for(int i=1; i<=10; i++) {
			queue.offer(i);
			
		}
		System.out.println(queue);
		// 데이터의 인출
		System.out.println("데이터 인출: "+queue.poll());
		System.out.println(queue);
		
		System.out.println("peek:" + queue.peek());
		System.out.println(queue);
		
		
		while(!queue.isEmpty()) {
			System.out.println("Poll:" + queue.poll());
			System.out.println(queue);
				
		}
	}

}


