package com.java.oop.staticmembers;

public class staticEx {
	public static int refCount; //클래스 변수
	public static String classVar; // 클래스 변수
	public String instanceVar;
	
	// static 영역의 초기화
	static {
		refCount = 0;
		classVar = "Static Member";
		//instanceVar = "Instance Memeber";  <-- Error : static 영역에서 instance 접근 불가
		
		System.out.println("Static Block");
	}
	public staticEx() {
		refCount++; // static 영역변수로 모든 instance 에서 접근 가능
		instanceVar = "Instance Member";
		
		System.out.println("refCount:"+ refCount);
		System.out.println("인스턴스 생성");
	}
	
	@Override
	protected void finalize() throws Throwable {
		refCount--;
		super.finalize();
		System.out.println("소멸자 호출");
	}
}
