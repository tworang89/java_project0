package 문제풀이;

import java.util.Scanner;

public class 영화예매 {

	public static void main(String[] args) {
		// 1. UI를 먼저만들기
		int[] seat = new int[10];// 배열은 자동으로 초기화됨, 누적된 값을 나타낼땐 반복문 밖으로
		Scanner sc = new Scanner(System.in);// 반복문안에 들어갈필요없음. 1개만있어두되니까!

		int count = 0;
		final int Money = 10000;// int앞에 final이 붙어있으면 고정값임!
		// 항상 똑같은 수가 들어가는 변수 = 상수
		// final은 상수를 나타냄, 변경불가능!
		// 상수의 변수명의 첫글자는 주로 대문자로 기입, 소문자도 문제는 없음

		while (true) {
			System.out.println("---------------------");

			for (int i = 0; i < 10; i++) {
				System.out.print(i + " ");
			}

			System.out.println();
			System.out.println("---------------------");

			for (int j = 0; j < seat.length; j++) {
				System.out.print(seat[j] + " ");
			}
			System.out.println();
			System.out.println("원하는 자리 번호 입력(종료:-1)>>");
			System.out.println();

			int no = sc.nextInt();

			if (no == -1) {
				System.out.println("예약 시스템을 종료합니다.");
				int total = count * Money;
				System.out.println("당신의 지불 금액은 " + total + "원");
				break;
			}

		}
	}
}

// 예약처리하기 전에 이미 그 자리가 예약된 자리인지 확인!해야함.
// 종료조건을 먼저 적기
