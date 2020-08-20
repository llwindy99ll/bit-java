package com.java.api.objectclass.v4;

import java.util.Arrays;

public class Scoreboard  implements Cloneable{
	
	private int scores[];
	
	public Scoreboard(int[] scores) {
		this.scores = scores;
		
	}
	
	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
		clone = (Scoreboard)clone();	//üũ�� exception ó�� �������
		
		}catch(CloneNotSupportedException e) {
			System.out.println("������ �������� �ʽ��ϴ�");

		}
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
