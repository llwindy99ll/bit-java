package com.java.oop.summary;

public class summaryApp {
	static kungfu[] dojang;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		panda p1 = new panda("��", 30);
		p1.say();
		
		human h1 = new human("Ȩ�浿", 28);
		h1.say();
		
		panda p2 = new kungfupanda("��", 15);
		p2.say();
		
		human h2 = new theOne("�׿�", 50);
		h2.say();
		System.out.println("=====================================");
		
		fight(p1);
		fight(p2);
		fight(h1);
		fight(h2);

		System.out.println("=====================================");
		
		dojang = new kungfu[] {
				(kungfu)h2,
				(kungfu)p2
		};
		
		for(kungfu actor: dojang) {
			actor.kungfu();
		}
	}
	
	private static void fight(Animal actor) {
		// Actor �� kungfu �޼��带 ���������� ��밡��
		if(actor instanceof kungfu )
			((kungfu)actor).kungfu();
		else
			actor.say();
			//System.out.println("��Ǫ ����");
			
	}

}
