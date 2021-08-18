package 스레드;

import java.util.Date;

public class Timer1 extends Thread {
	@Override
	public void run() {
		//i -- --> i = i-1;
		
		
		for (int i = 0; i < 1000; i++) {
			
			Date date = new Date();
			System.out.println(date);
			
			try {
				Thread.sleep(1000); //밀리세컨드(1/1000초)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
					
				}
				
			}
			
			
		
		
		
	}


