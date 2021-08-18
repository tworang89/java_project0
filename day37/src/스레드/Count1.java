package 스레드;

public class Count1 extends Thread {
	@Override
	public void run() {
		
for (int i = 1000; i >= 0; i= i - 2) {
			
			System.out.println("count>> "+i);
			
		}

	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		e.printStackTrace();
	} //밀리세컨드(1/1000초)
			
		}
		
	}


