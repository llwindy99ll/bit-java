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
import java.net.Socket;

public class ServerThread extends Thread{
	// �ʵ� : ����� ���� ����
	private Socket socket;
	
	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {

			// 3. ���� ���

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
				bw.newLine();
				bw.flush();
			}
			
			bw.close();
			br.close();
			System.out.println("Ŭ���̾�Ʈ ������ ����Ǿ����ϴ�");
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	
}
