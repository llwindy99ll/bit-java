package com.java.io.characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.StringTokenizer;

// 기본구분자는 \t\n\r
public class StringTokenizerEx {
	static String rootPath = System.getProperty("user.dir")+"\\files\\";
	static String filename = rootPath + "sangbuk.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스트림 열기
		
		try {
			Reader freader = new FileReader(filename);
			BufferedReader br = new BufferedReader(freader);
			
			String member;
			while( (member = br.readLine()) !=null) {
				// 분절
				StringTokenizer st = new StringTokenizer(member,",");
				while(st.hasMoreTokens()) {
					System.out.print(st.nextToken()+" ");  
				}//한개의 라인을 읽어서 분절
				System.out.println(); //라인 출력후 줄바꿈
			}
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
