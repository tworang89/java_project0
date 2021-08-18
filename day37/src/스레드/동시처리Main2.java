package 스레드;

public class 동시처리Main2 {

	public static void main(String[] args) {
		
		
	
		
		//threard 객체 생성
		
				동시3 thread3 = new 동시3();
				동시4 thread4 = new 동시4();
				동시5 thread5 = new 동시5();
				
				//CPU에 스레드를 등록해주어야 함.
				
				thread3.start();
				thread4.start();
				thread5.start();

				System.out.println("스레드 종료");
				
		
		
	}

}
