package com.java.api.collection.list;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// First in First Out
		// Queue�� �������̽��� ����
		// ��üŬ������  list Ŭ���� �̿�
		
		Queue<Integer> queue = new LinkedList();
		
		// �������� ���� offer
		for(int i=1; i<=10; i++) {
			queue.offer(i);
			
		}
		System.out.println(queue);
		// �������� ����
		System.out.println("������ ����: "+queue.poll());
		System.out.println(queue);
		
		System.out.println("peek:" + queue.peek());
		System.out.println(queue);
		
		
		while(!queue.isEmpty()) {
			System.out.println("Poll:" + queue.poll());
			System.out.println(queue);
				
		}
	}

}


