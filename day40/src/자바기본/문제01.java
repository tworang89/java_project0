package 자바기본;

import java.util.Scanner;

public class 문제01 {

	public static void main(String[] args) {
		
		//문제 
		//1. 1~10 사이 좋아하는 숫자 입력 받음
		//2. 1~10 숫자가 아니면 재입력 문구
		//3. 1~10 사이 숫자가 걸리면 오늘은 럭키데이 문구 출력
		//4. 3번 반복
		
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			
		
		System.out.print("당신이 좋아하는 1~10 숫자는?");
		int fnum    =     sc.nextInt(); 
		
		if (fnum <= 10) {
			System.out.println("오늘은 럭키데이!");
		
		} else {
			System.out.println("1~10으로만 적어요.");

		}
		
		
		
		
		
		}
		sc.close(); 
		

	
	}
}
