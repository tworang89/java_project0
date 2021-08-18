package 자바기본;

import java.util.Scanner;

public class 문제02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int sum = 0; 
		//int[] jumsu = {0,0,0,0,0};
		int[] jumsu =new int[12]; //배열은 자동초기화!
		for (int i = 0; i < 12; i++) {
		System.out.print("1~12월 한달 매출은 얼마인가요(만)?  ");
		int temp    =     sc.nextInt(); 
		
		if (temp <= 1000) {
			System.out.println(" 너무 적어요! 알바가 더 가져가요! 폐업위기!! ");
		} else {
			System.out.println(" 괜찮아요! 알바에게 칭찬을 해줘요! ");
			}
			jumsu[i] = temp;
			sum = sum + temp;
		
		}
	
		double avg = sum / 5.0; 
		System.out.println("작년 평균 매출은 " + avg);
		System.out.println("----------------");
		for (int i = 0; i < jumsu.length; i++) {
			System.out.print(jumsu[i]+" ");
			
		}
		sc.close(); 
		
		
}
	
	
}
