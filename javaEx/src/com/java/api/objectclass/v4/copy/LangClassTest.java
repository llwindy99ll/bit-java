package com.java.api.objectclass.v4.copy;

public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scoreboard s1 = new Scoreboard(new int[] {10,20,30,40});
		System.out.println("s1="+s1);
		
		Point p1 = new Point(10,20);
		
		System.out.println("Cloneable="+ (p1 instanceof Cloneable) );
		
		
		
		//����
//		Scoreboard s2 = s1.getClone();
//		System.out.println("s2="+s2);
//		
//		System.out.println("s1==s2 ?  "+(s1==s2));
//		
//		System.out.println("s1.scores == s2.scores ?  " + (s1.getScores() == s2.getScores()));
//		//��ü�� ���� �Ǿ����� ���� �����ʵ尡 ������(���� ����)
	}


	
	

}
