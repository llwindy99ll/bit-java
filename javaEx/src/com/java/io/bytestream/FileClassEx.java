package com.java.io.bytestream;

import java.io.File;
import java.io.IOException;

public class FileClassEx {
	static String rootPath = System.getProperty("user.dir")+"\\files\\";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File root = new File(rootPath);
		// 실제로 있는 파일있느 확인
		
		System.out.println("rootPaht exists ? "+ root.exists());
		
		if(!root.exists()) {
			root.mkdirs();
		}
		
		File file = new File(rootPath+"myfile.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("파일 생성완료");	
			}catch(IOException e) {
				System.out.println("파일을 생성하지못함");
			}
		}
		prinFileinfo(root);
		file.delete();
		prinFileinfo(root);
	}
	
	private static void prinFileinfo(File f) {
		System.out.println("------------");
		
		if(f.isDirectory()) {
			// 내부 파일 목록 확인
			System.out.println("Directory:"+f.getName());
			// 목록확인
			File[] file = f.listFiles();
			
			for(File fs : file) {
				System.out.print(fs.isDirectory() ? "d:":"f:");
				System.out.printf("%s - %d%n", fs.getName(), fs.length() );
				
			}
		}
	}

}
