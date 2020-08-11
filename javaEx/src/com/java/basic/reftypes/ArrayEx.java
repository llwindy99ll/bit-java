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
		
		System.arraycopy(scores, // 원본 배열
				0, // 복사 시작 인덱스 
				scores2, //대상 배열 
				3, // 대상 배열 내 복사 시작 인덱스
				scores.length); //복사할 내용의 길이
		
		for(int value : scores2) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
	
	public static void arrayCopy() {
		// 배열은 크기변경이 안되기 때문에 추가 내용이 있다면 새 배열을 생성하고 값을 복사해야 한다
		
		int scores[] = {1,2,3};
		//10개로 확장
		int scores2[] = new int[10];
		
		//루프 복사
		for(int i=0; i< scores.length; i++)
			scores2[i] = scores[i];
		
		for(int i=0; i< scores2.length; i++)
			System.out.println("값 확인 : "+ scores2[i] );
	
		
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
		 // 루프를 이용한 배열 의 값 합산
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
		System.out.println("scores2 길이:" + scores2.length);
		System.out.println("scores2의 0번방 : " + scores2[0]);
		
		System.out.println("scores와 scores2는 같은 객체?"+ (scores == scores2));
		scores[0] = 100;
		System.out.println("scores2[0]"+ scores2[0]);
	}
	
	
	public static void arrayBasic() {
		
		String[] names;
		int scores[];
		
		names = new String[] {
				"홍길동",
				"장길산",
				"전우치",
				"임꺽정"
		};
		
		float heights[] = {
				175.3f,
				170.2f,
				165.3f,
				185.3f
		}; //생성과 동시에 할경우 가능
		
		// 빈배열 생성 후 값을 설정
		
		scores = new int[4];
		// 인덱스 접근 : 0부터 사용
		scores[0] = 80;
		scores[1] = 90;
		scores[2] = 85;
		scores[3] = 88;
		//scores[4] = 100;
		
		for(int i=0; i<scores.length; i++)
			System.out.printf("%s(%.2f): 점수 = %d%n", names[i], heights[i], scores[i]);
		
	}

}
