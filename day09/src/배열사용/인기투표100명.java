package 배열사용;

import java.util.Scanner;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class 인기투표100명 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = { "아이유", "유재석", "방탄" };

		int[] tv = new int[3]; // 투표수 {0,0,0}

		// System.out.println(name[0]+":"+tv[0]);

		Scanner sc = new Scanner(System.in);

		while (true) {

			// 사용자가 사용할 수 있는도록 화면을 만들어보자

			System.out.println("인기투표 0)아이유, 1)유재석, 2)방탄, 3)종료");
			System.out.println("선택번호>>  ");
			int num = sc.nextInt(); //

			if (num == 3) {

				System.out.println("시스템을 종료 합니다.");

				for (int i = 0; i < tv.length; i++) {

					System.out.println(name[i] + ": " + tv[i] + "표");

				}

			// System.out.println(name[0]+": "+tv[0]+"표");
		    // System.out.println(name[1]+": "+tv[1]+"표");
			// System.out.println(name[2]+": "+tv[2]+"표");

				System.exit(0);

			}

			// 해당 인덱스에 있는 배열의 값을 1 증가

			tv[num]++;
			System.out.println(name[num] + "표 득표");

		}

	}

}
