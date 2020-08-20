package com.java.api.objectclass.v5;

// v5 참조타입을 가진 클래스의 깊은 복제 v4와 코드는 동일, Scoreboard 클래스의 클론 메서드 수정
public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scoreboard s1 = new Scoreboard(new int[] {10,20,30,40});
		System.out.println("s1="+s1);
		
		//복제
		Scoreboard s2 = s1.getClone();
		System.out.println("s2="+s2);
		
		System.out.println("s1==s2 ?  "+(s1==s2));
		
		System.out.println("s1.scores == s2.scores ?  " + (s1.getScores() == s2.getScores()));
		//객체 복제되고 내부 참조 필드도 복제되어 분리됨(깊은 복제)
	}


	
	

}
