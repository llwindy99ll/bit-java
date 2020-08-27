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
		// 1. 서버소켓 생성
		ServerSocket serversocket = null;
		
		try {
			serversocket = new ServerSocket();
			
			// 2. bind :주소,포트 :같은 포트를 사용하는 프로세스가 있으면 프로그램 실행 불가하므로 주의
			InetSocketAddress local = new InetSocketAddress( "127.0.0.1", 10000 );
			serversocket.bind(local);
			
			System.out.println("<서버시작>");
			System.out.println(" -> 연결을 기다립니다.");
			
			// 3. 접속 대기
			Socket socket = serversocket.accept();
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
				bw.flush();
			}
			
			bw.close();
			br.close();
			System.out.println("접속이 종료되었습니다");			
			
			// 후처리
			System.out.println("=======================");
			System.out.println("<서버 종료>");			
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
