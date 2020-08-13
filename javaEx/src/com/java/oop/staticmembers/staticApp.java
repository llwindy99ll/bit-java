package com.java.oop.staticmembers;

public class staticApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		staticEx s1 = new staticEx();
		System.out.println("RefCount: "+staticEx.refCount);
		
		staticEx s2 = new staticEx();
		//앞에서 스태틱 초기화 완료 -> 생성자 통해서
		System.out.println("RefCount:"+ staticEx.refCount);
		
		s1 = null; // 참조객체 해제
		System.out.println("s1 해제:");
		System.out.println("RefCount:"+ staticEx.refCount);
		
		// 가비지 콜렉터 강제 수행
		// 주의: 직접 호출 금지
		System.gc();
		try {
			Thread.sleep(3000);
			System.out.println("RefCount:"+staticEx.refCount);
		}catch(Exception e) {
			
		}
	}
}
