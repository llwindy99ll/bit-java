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
		// 1. Socket 생성
		Socket socket = null;
		
		try {
			socket = new Socket();
			
			System.out.println("<클라이언트 시작>");
			System.out.println(" ->연결을 요청합니다");
			// 2. 서버정보 확보
			InetSocketAddress remote = new InetSocketAddress("127.0.0.1", 10000);
			// --> 예외 발생가능
			
			// 3. 서버에 접속시도
			socket.connect(remote);
			
			System.out.println(" ->서버에 연결되었습니다");
			
			
			// 서버로 메시지 전송 : Stream IO 활용
			// outputstream 활용
			OutputStream os = socket.getOutputStream();	
			Writer osw = new OutputStreamWriter(os, "UTF-8");  // 실체객체 생성
			BufferedWriter bw = new BufferedWriter(osw);
			
			// 서버로터 메시지 수신을 위한 인풋 스트림 확보
			InputStream is = socket.getInputStream();
			Reader isr = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(isr);
			
			
//			String msg = "테스트 메시지";
//			bw.write(msg);
//			System.out.println("클라이언트 전송 메시지:"+msg);
//			bw.close();
//			
			// 키보드 입력을 받아서 서버로 연동
			BufferedReader KeyReader = new BufferedReader(new InputStreamReader(System.in));
			
			// q-> 전송 종료
			while(true) {
				String msg = KeyReader.readLine();
				if(msg.equals("/q")) {
					System.out.println("=>입력을 종료합니다");
					break;
				}
				
				bw.write(msg);
				bw.newLine();
				bw.flush();
				System.out.println("=>전송할 메시지:"+ msg);
			
				// 수신된 메시지
				String rcvMsg = br.readLine();
				System.out.println("<= 수신한 메시지:"+ rcvMsg);
					
			}
			KeyReader.close();
			bw.close();
			br.close();
					
			// 종료
			System.out.println("<클라이언트 종료>");
			
			
		}catch(ConnectException e) {
			System.out.println("<!!접속이 거부되었습니다!!>");
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
