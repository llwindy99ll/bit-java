package com.java.basic.reftypes;

public class ArrayEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arrayBasic();
		//arrayMemoryTest();
		//arrayNDim();
		//arrayCopy();
		arrayCopySystem();
	
	}
	
	public static void arrayCopySystem() {
		int scores[] = {1,2,3};
		int scores2[] = new int[10];
		
		System.arraycopy(scores, // ���� �迭
				0, // ���� ���� �ε��� 
				scores2, //��� �迭 
				3, // ��� �迭 �� ���� ���� �ε���
				scores.length); //������ ������ ����
		
		for(int value : scores2) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	public static void arrayCopy() {
		// �迭�� ũ�⺯���� �ȵǱ� ������ �߰� ������ �ִٸ� �� �迭�� �����ϰ� ���� �����ؾ� �Ѵ�
		
		int scores[] = {1,2,3};
		//10���� Ȯ��
		int scores2[] = new int[10];
		
		//���� ����
		for(int i=0; i< scores.length; i++)
			scores2[i] = scores[i];
		
		for(int i=0; i< scores2.length; i++)
			System.out.println("�� Ȯ�� : "+ scores2[i] );
	
		
	}
	
	public static void arrayNDim() {
		int[][] twoDim = new int[3][5];
		 int table[][] = {
				 {1,2,3,4,5},
				 {2,3,4,5,1},
				 {3,4,5,1,2}
		 };
		 
		 System.out.println("table.length:"+table.length);
		 System.out.println("table[0].length:"+table[0].length);
		 int sum=0;
		 // ������ �̿��� �迭 �� �� �ջ�
		 for(int i=0; i<table.length; i++) {
			 for(int k=0; k<table[i].length; k++) {
				 sum +=table[i][k];
			 }
		 }
		 System.out.println("sum:"+sum);
		 
		 
	}
	
	public static void arrayMemoryTest() {
		int scores[] = {
				80,90,100,70
		};
		
		int scores2[] = scores;
		System.out.println("scores2 ����:" + scores2.length);
		System.out.println("scores2�� 0���� : " + scores2[0]);
		
		System.out.println("scores�� scores2�� ���� ��ü?"+ (scores == scores2));
		scores[0] = 100;
		System.out.println("scores2[0]"+ scores2[0]);
	}
	
	
	public static void arrayBasic() {
		
		String[] names;
		int scores[];
		
		names = new String[] {
				"ȫ�浿",
				"����",
				"����ġ",
				"�Ӳ���"
		};
		
		float heights[] = {
				175.3f,
				170.2f,
				165.3f,
				185.3f
		}; //������ ���ÿ� �Ұ�� ����
		
		// ��迭 ���� �� ���� ����
		
		scores = new int[4];
		// �ε��� ���� : 0���� ���
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
		//scores[4] = 100;
		
		for(int i=0; i<scores.length; i++)
			System.out.printf("%s(%.2f): ���� = %d%n", names[i], heights[i], scores[i]);
		
	}

}
