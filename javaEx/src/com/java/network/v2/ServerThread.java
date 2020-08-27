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
	// 필드 : 통신을 위한 소켓
	private Socket socket;
	
	public ServerThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		try {

			// 3. 접속 대기

			// 접속후 클라이언트 정보를 확인
			InetSocketAddress client = (InetSocketAddress)socket.getRemoteSocketAddress();
			System.out.println(" => 클라이언트가 연결되었습니다");
			System.out.println(" -> Clinet IP :"+ client.getAddress() + ":" + client.getPort());
			
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is, "UTF-8");
			BufferedReader br = new BufferedReader(isr);
			
			// 클라이언트로 돌려주기 위한 outputSteram
			OutputStream os = socket.getOutputStream();	
			Writer osw = new OutputStreamWriter(os);  // 실체객체 생성
			BufferedWriter bw = new BufferedWriter(osw);
			
			String msg;
			while( (msg = br.readLine()) !=null ) {
				System.out.println("수신된 메시지:"+ msg);
				
				//Echo back
				System.out.println("Echo back:"+ msg);			
				bw.write("[Echo]:" + msg);
				bw.newLine();
				bw.flush();
			}
			
			bw.close();
			br.close();
			System.out.println("클라이언트 접속이 종료되었습니다");
			
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	
}
