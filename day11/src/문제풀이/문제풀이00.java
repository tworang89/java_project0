package 문제풀이;

import java.util.Scanner;

public class 문제풀이00 {

	public static void main(String[] args) {
		// 정수 5개 크기의 배열을 만들어서
		// 10,20,30,40,50을 순서대로 넣는다
		// 첫번째 값과 세번째 값을 더해서 프린트
		
		
		int[] num = new int[5];
		
		Scanner sc = new Scanner(System.in);

		System.out.println("숫자입력>>  ");

		for (int i = 0; i < num.length; i++) {

			num[i] = sc.nextInt();

		}

		System.out.println(num[0] + num[2]);
		sc.close(); // 스트림(연결통로)를 닫아라!

	}

}
