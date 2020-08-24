package com.java.api.collection.hash;

// hash �迭 �ڷ����� ��ü�� ����� ���ϴ� ���
// 1. hashcode �� ��
// 2. equals �� �̿��� ��
//
public class Student {
	private String name;
	private int code;
	
	public Student(int code, String name) {
		this.code = code;
		this.name = name;
	}

	
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		// üũ�� �ٿ��ɽ���
		if(obj instanceof Student) {
			Student other = (Student)obj;
			return name.equals(other.name) && code == other.code;
		}
	
		return super.equals(obj);
	}



	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		//return super.hashCode();	// �޸� �ּ�
		return code;
	}



	@Override
	public String toString() {
		return "Student [name=" + name + ", code=" + code + "]";
	}
	
	
}
