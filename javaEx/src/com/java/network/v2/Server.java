package com.java.network.v2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		// 1. �������� ����
		ServerSocket serversocket = null;
		
		try {
			serversocket = new ServerSocket();
			
			// 2. bind :�ּ�,��Ʈ :���� ��Ʈ�� ����ϴ� ���μ����� ������ ���α׷� ���� �Ұ��ϹǷ� ����
			InetSocketAddress local = new InetSocketAddress( "127.0.0.1", 10000 );
			serversocket.bind(local);
			
			System.out.println("<��������>");
			System.out.println(" -> ������ ��ٸ��ϴ�.");
			
			// 3. ���� ���
			while(true) {
				Socket socket = serversocket.accept();
				// �� ���������带 ���� ������ ����
				
				Thread thread = new ServerThread(socket);
				thread.start();
			}
			
			
			
		}catch(IOException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally{
			try {
				serversocket.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
	}

}
