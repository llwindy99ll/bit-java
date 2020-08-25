package com.java.io.bytestream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FilesStreamEx {
	static String rootPath = System.getProperty("user.dir")+"\\files\\";
	static String source = rootPath + "img.jpg";
	static String target = rootPath + "img_copy.jpg";

	public static void main(String[] args) {
		
		// source -> FIS -> DATA -> FOS -> target
		try{
			InputStream bis = new FileInputStream(source);
			OutputStream bos = new FileOutputStream(target);
			
			int data = 0;
			
			while( (data = bis.read()) != -1 ) {
				bos.write(data);
			}
			bos.close();
			bis.close();
			
			System.out.println("������ �����߽��ϴ�");
			
		}catch(FileNotFoundException e) {
			System.out.println("������ ã�� �� �����ϴ�");
		}catch(IOException e) {
			e.printStackTrace();
		}
	
	}

}
