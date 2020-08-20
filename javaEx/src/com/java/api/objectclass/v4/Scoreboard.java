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
		clone = (Scoreboard)clone();	//체크드 exception 처리 해줘야함
		
		}catch(CloneNotSupportedException e) {
			System.out.println("복제를 지원하지 않습니다");

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
