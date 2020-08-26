package com.java.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressEx {

	public static void main(String[] args) {
		// 원격서버의 IP주소를 확인
		
		printServerIP("www.google.co.kr");
		printServerIP("www.naver.co.kr");
		
		
	}
	
	private static void printServerIP(String hostname) {
		try {
			// local ip 확인
			InetAddress local = InetAddress.getLocalHost();
			System.out.println("내  IP: "+local.getHostAddress() );
			
			// hostname ip확인
			InetAddress[] addrs = InetAddress.getAllByName(hostname);
			
			for(InetAddress remote : addrs) {
				System.out.println(hostname+": "+remote.getHostAddress() );	
				
			}
			
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
