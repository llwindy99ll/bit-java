package com.java.api.collection.hash;

public class Classroom {
	private String roomname;
	private String subject;
	
	public Classroom(String subject) {
		this.subject = subject;
	
	}
	
	public Classroom(String roomname, String subject) {
		this(subject);
		this.roomname = roomname;
		
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Classroom) {
			return hashCode() == obj.hashCode();
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// 과목명이 같으면 같은 해시코드 반환
		return subject.hashCode();
	}

	@Override
	public String toString() {
		return "Classroom [roomname=" + roomname + ", subject=" + subject + "]";
	}
	
	
	
}
