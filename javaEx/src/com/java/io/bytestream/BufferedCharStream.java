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
	// ������ ���ٴ����� �о(readline) �ش���ο� leaf, leaves �ܾ ���ԵǾ� ������ ������ ����
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		try {
			// �� ��Ʈ��
			Reader fr = new FileReader(filename);
			Writer fw = new FileWriter(filtered);
			// ������Ʈ��
			BufferedReader br = new BufferedReader(fr);
			BufferedWriter bw = new BufferedWriter(fw);
			
			//bufferedReader�� ����ϸ� �ٴ��� �Է��� ����(br.readline)
			String line="";
			while( (line = br.readLine()) != null) {
				//üũ : leaf, leaves ����?
				if(line.toLowerCase().contains("leaf") || line.toLowerCase().contains("leaves") ) {
					System.out.println(line);
					bw.write(line);
					bw.newLine();
				}
				
			}
			br.close();
			bw.close();
			System.out.println("���͸� �Ϸ�");
			
		}catch(FileNotFoundException e){
			System.out.println("������ ã���� �����ϴ�");
			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
