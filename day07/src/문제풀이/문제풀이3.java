package 문제풀이;

public class 문제풀이3 {

	public static void main(String[] args) {
		// 문제 3번
		// 0 ~ 6000 까지 5씩 점프하면서 더해주세요.
		
		int sum = 0;
		
		for (int i = 0; i <= 6000; i= i + 5) {
			
			sum = sum + i ;
			
		}
		
		System.out.println(sum);

	}

}
