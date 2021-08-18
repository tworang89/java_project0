package 자바기본;

import java.util.Scanner;

public class 기본입출력5 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0; 
		int[] jumsu = {0,0,0,0,0};
		int i2 = 0;
		while (true) {
		System.out.print("오늘 온도는 몇도인가요?");
		int temp    =     sc.nextInt(); 
		
		if (temp >= 30) {
			System.out.println("너무 더워요!");
		} else {
			System.out.println("괜찮아요!");
			}
			jumsu[i2] = temp;
			sum += temp;
			i2++;
			if (i2==5) {
				
				break;
				
			}
		}
		double avg = sum / 5.0; 
		System.out.println("평균은" + avg);
		System.out.println("----------------");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i]+" ");
			
		}
		sc.close(); 
		
		
}
	
	
}
