package 문제풀이;

public class 문제풀이두번째1 {

	public static void main(String[] args) {
		// 1부터 1000까지 중 3씩 점프해주세요
		// 만약 더한 값이 100이 넘으면 더하기를 종료
		// 5의 배수는 더하지 않습니다
		
		int sum1 = 0 ;
		int count = 0 ;
		
		for (int i = 1; i <= 1000; i=i+3) {
			
			
			
			
			if (i%5==0) {
				
				continue;//이번 횟수만 제외하고 for문은 계속 되라.
				
				
				
			}
			
			if (sum1 > 100) {
				
				break;
				
			}
			
			sum1 = sum1 + i ;
			count++;
			
		}
		
		
		
		System.out.println(sum1);
		System.out.println(count);
		
		
		

	}

}
