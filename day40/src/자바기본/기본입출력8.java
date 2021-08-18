package 자바기본;

import java.util.ArrayList;
import java.util.Scanner;

public class 기본입출력8 {

	public static void main(String[] args) {
		// 시작할 값 입력, 종료할 값 입력, 1020, 3333
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("시작 값을 입력: ");
		int sn = sc.nextInt();
		System.out.print("종료 값을 입력: ");
		int en = sc.nextInt();
		int sum = 0;
		//int count5 = 0;
		ArrayList<Integer>list = new ArrayList<Integer>();
		for (int i = sn; i < en; i++) {
		// 5의 배수만 더해서 출력	
			if (i % 5 == 0) {
				sum += i;
				//count5++;
				list.add(i);
			}
			
		}
		System.out.println("5의 배수를 더한 합계: " + sum);
		// 5의 배수의 갯수 
		//System.out.println("5의 배수의 갯수: " + count5);
		System.out.println("5의 배수의 갯수: " + list.size());
		// 5의 배수의 목록
		System.out.println(list);
		// 5의 배수의 평균값
		System.out.println((double)sum / list.size());
		sc.close();
	}

}
