package com.java.network;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		// 1. Socket ����
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("<Ŭ���̾�Ʈ ����>");
			System.out.println(" ->������ ��û�մϴ�");
			// 2. �������� Ȯ��
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			// --> ���� �߻�����
			
			// 3. ������ ���ӽõ�
			socket.connect(remote);
			
			System.out.println(" ->������ ����Ǿ����ϴ�");
			
			
			// ������ �޽��� ���� : Stream IO Ȱ��
			// outputstream Ȱ��
			OutputStream os = socket.getOutputStream();	
			Writer osw = new OutputStreamWriter(os, "UTF-8");  // ��ü��ü ����
			BufferedWriter bw = new BufferedWriter(osw);
			
			// �������� �޽��� ������ ���� ��ǲ ��Ʈ�� Ȯ��
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			
//			String msg = "�׽�Ʈ �޽���";
//			bw.write(msg);
//			System.out.println("Ŭ���̾�Ʈ ���� �޽���:"+msg);
//			bw.close();
//			
			// Ű���� �Է��� �޾Ƽ� ������ ����
			BufferedReader KeyReader = new BufferedReader(new InputStreamReader(System.in));
			
			// q-> ���� ����
			while(true) {
				String msg = KeyReader.readLine();
				if(msg.equals("/q")) {
					System.out.println("=>�Է��� �����մϴ�");
					break;
				}
				
				bw.write(msg);
				bw.newLine();
				bw.flush();
				System.out.println("=>������ �޽���:"+ msg);
			
				// ���ŵ� �޽���
				String rcvMsg = br.readLine();
				System.out.println("<= ������ �޽���:"+ rcvMsg);
					
			}
			KeyReader.close();
			bw.close();
			br.close();
					
			// ����
			System.out.println("<Ŭ���̾�Ʈ ����>");
			
			
		}catch(ConnectException e) {
			System.out.println("<!!������ �źεǾ����ϴ�!!>");
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
			socket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	
		

	}

}
