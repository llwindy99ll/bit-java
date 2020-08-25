package com.java.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// datainputstream, dataoutputstream은 자바의 기본타입을 binary로 저장하는 보조 스트림
public class DataStreamEx {
	static String rootPath = System.getProperty("user.dir")+"\\files\\";
	static String filename = rootPath + "primitives.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// 주 스트림
			OutputStream fos = new FileOutputStream(filename);
			// 보조스트림
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("홈길동");
			dos.writeBoolean(true);
			dos.writeInt(20);
			dos.writeFloat(80.9f);
		
			dos.writeUTF("고길동");
			dos.writeBoolean(false);
			dos.writeInt(50);
			dos.writeFloat(74f);
			
			dos.close();
			
			//읽어오기
			// 주 스트림
			InputStream fis = new FileInputStream(filename);
			// 보조스트림
			DataInputStream dis = new DataInputStream(fis);
			
			//주의 데이터인풋스트림에서 리드할떄는 지정된 데이터타입의 순서대로 읽어야함
			for(int i=0; i<2; i++) {
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int v = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s:%b:%d:%f:\n",s,b,v,f);	
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("파일을 찾지 못했습니다");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
