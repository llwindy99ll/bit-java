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
		// write : writer 출력 stream의 최고 조상
		try {
			Writer fw = new FileWriter(filename);
			// 출력
			fw.write("bit computer\r\n");
			fw.write("Java programming\r\n");
			fw.write("2020.08\r\n");
			
			fw.flush();
			fw.close();
			
			System.out.println("파일저장 완료");
			
			Reader fr = new FileReader(filename);
			int data = 0;
			while( (data = fr.read()) !=-1 ) {
				System.out.print((char)data );
			}
			fr.close();
			System.out.println("파일읽기 완료");
			
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없습니다");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
