package com.java.thread.v3;

public class AlphabetRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			for(char ch ='A'; ch<='Z'; ch++) {
				System.out.println("AlphabetRunnable: "+ ch);
				Thread.sleep(300);
			}
		
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
	}

}
