package com.java.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

// byte 스트림은 이진파일을 입출력하는 클래스
// 최상위 부모 : Input/outputStream (추상)
public class ByteArrayStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = {0,1,2,3,4,56,7,8,9};
		
		byte[] outSrc = null;
				
		System.out.println("입력소스: " + Arrays.toString(inSrc));
		// 순서
		// 데이터에 적합한 스트림을 열고
		// 입력/출력 소스를 연결
		// 데이터를 스트름을 통해 입출력
		
		try {
			// 추상클래스 				실체클래스(checked exception 발생)
			InputStream bis = new ByteArrayInputStream(inSrc);
			OutputStream bos = new ByteArrayOutputStream();
			int data =0;
			
			//read를 하면 바이트 데이터를 받아서 int 데이터로 변환하여 리턴
			data = bis.read();
			System.out.println("읽은 데이터:"+ data);
			// read로 읽어서 더이상 읽을 데이터가 없을 때 -1을 반환
			while( (data = bis.read()) !=-1 ) {
				bos.write(data);
			}
			//출력
			outSrc = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("대상 배열: " + Arrays.toString(outSrc));
			
			bos.close();
			bis.close();
			
		}catch(IOException e) {
			// IO예외는  Checked 예외
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
