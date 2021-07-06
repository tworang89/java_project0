package 문제풀이;

import java.util.Scanner;

public class 문제풀이01 {

	public static void main(String[] args) {
		// ================
		// 좋아하는 과일은? 0)사과 01)바나나 02)포도 03)키위 04)종료 >> 1
		// ================
		// 사과가 선택되었습니다.

		// ================
		// 좋아하는 과일은? 0)사과 01)바나나 02)포도 03)키위 04)종료 >> 2
		// ================
		// 바나가 선택되었습니다.

		// ================
		// 좋아하는 과일은? 0)사과 01)바나나 02)포도 03)키위 04)종료 >> 0
		// ================
		// 시스템이 종료됩니다.

		// 사과:3개
		// 바나나:2개
		// 포도:1개
		// 키위:2개
		// 구매하려면 전체 금액은________원 입니다.

		// 사과,바나나는 2000원씩 포도,키위는 3000원씩

		Scanner sc = new Scanner(System.in);

		String[] fruits = { "사과", "바나나", "포도", "키위" };

		int[] count = new int[4];

		while (true) {

			System.out.println("=================");
			System.out.print("좋아하는 과일은? 0)사과 01)바나나 02)포도 03)키위 04)종료");
			int select = sc.nextInt();
			System.out.println("=================");

			if (select == 0) {

				System.out.println("시스템이종료됩니다.");
				for (int i = 0; i < fruits.length; i++) {

					System.out.println(fruits[i] + ":  " + count[i] + " 개");

				}

				int total = (count[0] + count[1]) * 2000 + (count[2] + count[3]) * 3000;

				System.out.println("구매하려면 전체금액은" + total + "원입니다.");

				break;
			}

			count[select - 1]++;
			System.out.println(fruits[select - 1] + "가 선택되었습니다.");
			System.out.println();

		}

		sc.close();

	}

}
