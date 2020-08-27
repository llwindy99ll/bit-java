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
			while(true) {
				Socket socket = serversocket.accept();
				// 새 서버스레드를 만들어서 로직을 수행
				
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
