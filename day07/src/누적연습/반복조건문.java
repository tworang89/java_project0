package 누적연습;


public class 반복조건문 {

	public static void main(String[] args) {
		
		
		int sum1 = 0;
		
		for (int i = 1; i < 10; i++) {
			
			if (i % 3==0) {
				
				sum1 = sum1 + i;
				
			}
			
		}
		
		System.out.println(sum1);
		
		System.out.println("------------------");
		
		
		int sum2 = 0;
		for (int i = 1; i < 10; i++) {
			
			if (i%3==0) {
				
				continue;
				//반복문을 계속 하라는 의미 
				//조건에 맞는 경우 아래에 있는 코드는 더이상 실행되지 않는다.
				//제외의 의미이다.
				
			}
			
			if (sum2 > 20) {
				
				
				break;
			}
			
			
			sum2 = sum2 + i;
			
		}
		
		System.out.println(sum2);
		

	}

}
