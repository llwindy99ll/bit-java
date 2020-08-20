package com.java.api.arrays;

public class Member implements Comparable{
	private String name;
	
	public Member(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Member name: "+ name;
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		
		if(o instanceof Member) {
			return name.compareTo( ((Member)o).name);
		}
		
		return 0;
	}
	
	
}
