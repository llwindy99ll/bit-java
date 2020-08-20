package com.java.api.objectclass.v5;

import java.util.Arrays;

public class Scoreboard  implements Cloneable{
	// ���������� ���ؼ��� ����Ÿ�� �ʵ嵵 ��������� ��
	private int scores[];
	
	public Scoreboard(int[] scores) {
		this.scores = scores;
		
	}
	
	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
		clone = (Scoreboard)clone();	//üũ�� exception ó�� �������
										// ����Ÿ�� �ʵ带 ���� --> �θ�Ŭ���� �������̵� �ʿ�
		
		}catch(CloneNotSupportedException e) {
			System.out.println("������ �������� �ʽ��ϴ�");

		}
		return clone;
	}
	



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Scoreboard clone = (Scoreboard)super.clone();		//���� ���� ����
		//���� �����ʵ带 ����
		clone.scores = Arrays.copyOf(scores, scores.length);
		return clone;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return  "Scores ["+Arrays.toString(scores)+"]" ;
	}

	public int[] getScores() {
		return scores;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
	}

}
