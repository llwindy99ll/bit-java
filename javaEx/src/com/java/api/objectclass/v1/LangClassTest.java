package com.java.api.objectclass.v1;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point p = new Point(10,20);
		System.out.println("Cloneable="+ (p instanceof Cloneable) );
		
		//JAVA의 최상위 클래스는 Object
		// 모든클래스는 Object의 기능을  물려받는다
		// Object 로부터 받은 기능
		
		System.out.println(p.getClass().getSimpleName());
		System.out.println(p.hashCode());
		System.out.println(p.toString());	// 클래스명@주소
		System.out.println(p);
		
		//부모정보 확인
		System.out.println(p.getClass().getSuperclass().getName() );
		System.out.println(p.getClass().getSuperclass().getSimpleName());
				
	}

	// toString : print 혹은 문자열과 연결될 때 호출되어서
	// 출력값을 지정
	@Override
	public String toString() {
		return "LangClassTest [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	

}
