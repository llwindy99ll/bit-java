package com.java.basic;

//������ Ÿ���� �ٸ� ������ Ÿ������ ����(casting)
// 1.���� ǥ�� ���� ������ -> ���� ǥ�� ���� ������(promotion)
// 2.���� ǥ�� ���� ������ -> ���� ǥ�� ���� ������ (casting)
	
public class CastingEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//promotion();
		castingEx();
	}
	
	

	public static void promotion() {
		//implicit casting(�Ϲ��� ��ȯ)
		//
		byte b =25;
		System.out.println("����Ʈ:"+b);
		short s = b;
		System.out.println("short:"+s);
		
		int i = s;
		System.out.println("int:"+i);
		
		long l =1234567890123456789l ;
		System.out.println("long:"+l);
		
		float f = l;
		System.out.println("float:"+f);
			
	}
	
	public static void castingEx() {
		//explicit casting(����� ��ȯ)
		//�ڷ��� ���� �߻� ����
		//�����ڰ� ��������� ��ȯ�� �ڷ����� ����
		
		float f = 1234.5678f;
		System.out.println("float:"+f);
		
		long l =(long)f ;
		System.out.println("long:"+l);
		
		int i = (int)l;
		System.out.println("int:"+i);
		
		short s = (short)i;
		System.out.println("short:"+s);
		
		//1234 = 1111() 1111(128) 1111(15) =
		byte b =(byte)s;  
		System.out.println("����Ʈ:"+b);
		
		
		
	}
	
	
}
