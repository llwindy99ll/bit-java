package com.java.api.collection.list;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Stack �ڷ����� ���Լ���
		// ����� ������ �ѹ���
		
		Stack<Integer> stack = new Stack<>();
		
		for(int i=1; i<=10; i++) {
			stack.push(i);
			
		}
		System.out.println("STACK:"+stack);
		int out = stack.pop();
		System.out.println("POP:"+out);
		System.out.println("STACK:"+stack);
		System.out.println("Peek:"+stack.peek());
		System.out.println("STACK:"+stack);
		
		while( !(stack.isEmpty()) ) {
			out = stack.pop();
			System.out.println("POP:"+out);
			System.out.println("STACK:"+stack);			
		}
		
	}

}
