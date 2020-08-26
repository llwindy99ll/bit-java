package com.java.io.characterstream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.util.StringTokenizer;

// �⺻�����ڴ� \t\n\r
public class StringTokenizerEx {
	static String rootPath = System.getProperty("user.dir")+"\\files\\";
	static String filename = rootPath + "sangbuk.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��Ʈ�� ����
		
		try {
			Reader freader = new FileReader(filename);
			BufferedReader br = new BufferedReader(freader);
			
			String member;
			while( (member = br.readLine()) !=null) {
				// ����
				StringTokenizer st = new StringTokenizer(member,",");
				while(st.hasMoreTokens()) {
					System.out.print(st.nextToken()+" ");  
				}//�Ѱ��� ������ �о ����
				System.out.println(); //���� ����� �ٹٲ�
			}
			br.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
