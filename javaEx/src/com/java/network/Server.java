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
			Socket socket = serversocket.accept();
			// ������ Ŭ���̾�Ʈ ������ Ȯ��
			InetSocketAddress client = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println(" => Ŭ���̾�Ʈ�� ����Ǿ����ϴ�");
			System.out.println(" -> Clinet IP :"+ client.getAddress() + ":" + client.getPort());
			
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			// Ŭ���̾�Ʈ�� �����ֱ� ���� outputSteram
			OutputStream os = socket.getOutputStream();	
			Writer osw = new OutputStreamWriter(os);  // ��ü��ü ����
			BufferedWriter bw = new BufferedWriter(osw);
			
			String msg;
			while( (msg = br.readLine()) !=null ) {
				System.out.println("���ŵ� �޽���:"+ msg);
				
				//Echo back
				System.out.println("Echo back:"+ msg);			
				bw.write("[Echo]:" + msg);
				bw.flush();
			}
			
			bw.close();
			br.close();
			System.out.println("������ ����Ǿ����ϴ�");			
			
			// ��ó��
			System.out.println("=======================");
			System.out.println("<���� ����>");			
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
