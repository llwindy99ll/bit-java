package com.java.api.objectclass.v5;

import java.util.Arrays;

public class Scoreboard  implements Cloneable{
	// 깊은복제를 위해서는 참조타입 필드도 복제해줘야 함
	private int scores[];
	
	public Scoreboard(int[] scores) {
		this.scores = scores;
		
	}
	
	public Scoreboard getClone() {
		Scoreboard clone = null;
		
		try {
		clone = (Scoreboard)clone();	//체크드 exception 처리 해줘야함
										// 참조타입 필드를 복제 --> 부모클래스 오버라이드 필요
		
		}catch(CloneNotSupportedException e) {
			System.out.println("복제를 지원하지 않습니다");

		}
		return clone;
	}
	



	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Scoreboard clone = (Scoreboard)super.clone();		//얕은 복제 수행
		//내부 참조필드를 복제
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
