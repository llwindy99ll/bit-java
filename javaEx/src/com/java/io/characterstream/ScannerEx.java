package com.java.io.characterstream;

import java.io.File;
import java.util.Scanner;

public class ScannerEx {
	static String rootPath = System.getProperty("user.dir")+"\\files\\";
	static String filename = rootPath + "thieves.txt";
	public static void main(String[] args) {
		// 스캐너는 단순히 표준입력(키보드)만을 위한 클랫가 아니다 생성자의 인자료 입력소스를 지정하면 파일,네트워크 등 다른 입력소스로부터 데이터를 읽을 수 있다
		
		File file = new File(filename);
		
		try {
			Scanner scanner = new Scanner(file);
			String name;
			float height;
			float weight;

			// 더이상 읽을 라인이 없을 때까지 루프
			while(scanner.hasNextLine()) {
				name = scanner.next();   // 입력과 변환을 동시에
				height = scanner.nextFloat();
				weight = scanner.nextFloat();
			
				System.out.printf("%s, 키:%f, 체중:%f%n", name,height, weight);
				scanner.nextLine(); // 남아있는 데이터를 읽어들임
				
			}
			
			scanner.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}
	
}
