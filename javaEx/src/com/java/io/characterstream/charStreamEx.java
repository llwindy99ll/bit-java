package com.java.io.characterstream;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class charStreamEx {

	static String rootPath = System.getProperty("user.dir")+"\\files\\";
	static String filename = rootPath+ "char.txt";
	
	public static void main(String[] args) {
		// write : writer ��� stream�� �ְ� ����
		try {
			Writer fw = new FileWriter(filename);
			// ���
			fw.write("bit computer\r\n");
			fw.write("Java programming\r\n");
			fw.write("2020.08\r\n");
			
			fw.flush();
			fw.close();
			
			System.out.println("�������� �Ϸ�");
			
			Reader fr = new FileReader(filename);
			int data = 0;
			while( (data = fr.read()) !=-1 ) {
				System.out.print((char)data );
			}
			fr.close();
			System.out.println("�����б� �Ϸ�");
			
		}catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
