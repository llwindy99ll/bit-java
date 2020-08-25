package com.java.io.bytestream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

// byte ��Ʈ���� ���������� ������ϴ� Ŭ����
// �ֻ��� �θ� : Input/outputStream (�߻�)
public class ByteArrayStreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] inSrc = {0,1,2,3,4,56,7,8,9};
		
		byte[] outSrc = null;
				
		System.out.println("�Է¼ҽ�: " + Arrays.toString(inSrc));
		// ����
		// �����Ϳ� ������ ��Ʈ���� ����
		// �Է�/��� �ҽ��� ����
		// �����͸� ��Ʈ���� ���� �����
		
		try {
			// �߻�Ŭ���� 				��üŬ����(checked exception �߻�)
			InputStream bis = new ByteArrayInputStream(inSrc);
			OutputStream bos = new ByteArrayOutputStream();
			int data =0;
			
			//read�� �ϸ� ����Ʈ �����͸� �޾Ƽ� int �����ͷ� ��ȯ�Ͽ� ����
			data = bis.read();
			System.out.println("���� ������:"+ data);
			// read�� �о ���̻� ���� �����Ͱ� ���� �� -1�� ��ȯ
			while( (data = bis.read()) !=-1 ) {
				bos.write(data);
			}
			//���
			outSrc = ((ByteArrayOutputStream)bos).toByteArray();
			System.out.println("��� �迭: " + Arrays.toString(outSrc));
			
			bos.close();
			bis.close();
			
		}catch(IOException e) {
			// IO���ܴ�  Checked ����
			e.printStackTrace();
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
