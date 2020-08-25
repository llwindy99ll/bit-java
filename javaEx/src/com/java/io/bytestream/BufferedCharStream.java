package com.java.io.bytestream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class BufferedCharStream {
	static String rootPath = System.getProperty("user.dir")+"\\files\\";
	static String filename = rootPath + "last-leaf.txt";
	static String filtered = rootPath + "last-leaf-filtered.txt";
	// 문장을 한줄단위로 읽어서(readline) 해당라인에 leaf, leaves 단어가 포함되어 있으면 별도로 저장
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			// 주 스트림
			Reader fr = new FileReader(filename);
			Writer fw = new FileWriter(filtered);
			// 보조스트림
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//bufferedReader를 사용하면 줄단위 입력이 가능(br.readline)
			String line="";
			while( (line = br.readLine()) != null) {
				//체크 : leaf, leaves 포함?
				if(line.toLowerCase().contains("leaf") || line.toLowerCase().contains("leaves") ) {
					System.out.println(line);
					bw.write(line);
					bw.newLine();
				}
				
			}
			br.close();
			bw.close();
			System.out.println("필터링 완료");
			
		}catch(FileNotFoundException e){
			System.out.println("파일을 찾을수 없습니다");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
