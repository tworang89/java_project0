package 문제풀이;

public class 문제풀이2 {

	public static void main(String[] args) {
		// 문제 2번
		// 55 ~ 4500 까지2씩 점프하면서 더해주세요.
		
		int sum = 0;
		
		for (int i = 55; i <= 4500; i= i + 2) {
			
			sum = sum + i ;
			
		}
		
		System.out.println(sum);

	}

}
