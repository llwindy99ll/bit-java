package com.java.io.bytestream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// datainputstream, dataoutputstream�� �ڹ��� �⺻Ÿ���� binary�� �����ϴ� ���� ��Ʈ��
public class DataStreamEx {
	static String rootPath = System.getProperty("user.dir")+"\\files\\";
	static String filename = rootPath + "primitives.txt";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// �� ��Ʈ��
			OutputStream fos = new FileOutputStream(filename);
			// ������Ʈ��
			DataOutputStream dos = new DataOutputStream(fos);
			
			dos.writeUTF("Ȩ�浿");
			dos.writeBoolean(true);
			dos.writeInt(20);
			dos.writeFloat(80.9f);
		
			dos.writeUTF("��浿");
			dos.writeBoolean(false);
			dos.writeInt(50);
			dos.writeFloat(74f);
			
			dos.close();
			
			//�о����
			// �� ��Ʈ��
			InputStream fis = new FileInputStream(filename);
			// ������Ʈ��
			DataInputStream dis = new DataInputStream(fis);
			
			//���� ��������ǲ��Ʈ������ �����ҋ��� ������ ������Ÿ���� ������� �о����
			for(int i=0; i<2; i++) {
				String s = dis.readUTF();
				boolean b = dis.readBoolean();
				int v = dis.readInt();
				float f = dis.readFloat();
				
				System.out.printf("%s:%b:%d:%f:\n",s,b,v,f);	
			}
			
			
		}catch(FileNotFoundException e) {
			System.out.println("������ ã�� ���߽��ϴ�");
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
