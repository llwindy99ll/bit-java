package com.java.api.objectclass.v5;

// v5 ����Ÿ���� ���� Ŭ������ ���� ���� v4�� �ڵ�� ����, Scoreboard Ŭ������ Ŭ�� �޼��� ����
public class LangClassTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scoreboard s1 = new Scoreboard(new int[] {10,20,30,40});
		System.out.println("s1="+s1);
		
		//����
		Scoreboard s2 = s1.getClone();
		System.out.println("s2="+s2);
		
		System.out.println("s1==s2 ?  "+(s1==s2));
		
		System.out.println("s1.scores == s2.scores ?  " + (s1.getScores() == s2.getScores()));
		//��ü �����ǰ� ���� ���� �ʵ嵵 �����Ǿ� �и���(���� ����)
	}


	
	

}
