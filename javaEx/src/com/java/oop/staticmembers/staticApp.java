package com.java.oop.staticmembers;

public class staticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticEx s1 = new staticEx();
		System.out.println("RefCount: "+staticEx.refCount);
		
		staticEx s2 = new staticEx();
		//�տ��� ����ƽ �ʱ�ȭ �Ϸ� -> ������ ���ؼ�
		System.out.println("RefCount:"+ staticEx.refCount);
		
		s1 = null; // ������ü ����
		System.out.println("s1 ����:");
		System.out.println("RefCount:"+ staticEx.refCount);
		
		// ������ �ݷ��� ���� ����
		// ����: ���� ȣ�� ����
		System.gc();
		try {
			Thread.sleep(3000);
			System.out.println("RefCount:"+staticEx.refCount);
		}catch(Exception e) {
			
		}
	}
}
