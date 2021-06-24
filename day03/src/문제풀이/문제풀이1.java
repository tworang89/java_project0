package 문제풀이;

import javax.swing.JOptionPane;

public class 문제풀이1 {

	public static void main(String[] args) {
		// 1. 변수에 저장: 커피갯수 5잔, 커피값 5000원
		// 총 커피 값을 계산하고 출력
		// 커피값이 20000원을 넘으면 "할인해드릴게요" 프린트
		// 넘지않으면, "총 커피값을 내세요"

		// 2. 내 현재 나이를 변수에 저장 100
		// 내 내년나이를 계산하고 출력
		// 내 내년나이가 100세를 넘으면 "이제부터시작"
		// 아니면 "아직 젊어요"

		// 3. 생수값 1000, 생수구매개수2
		// 마스크값 2000, 마스크구매개수3
		// 내가 지불해야할
		// 1) 생수값 금액은 얼마?
		// 2) 마스크값 금액은 얼마?
		// 3) 총 지불 금액은 얼마?

		// 4. "나는 짱"을 1000번 프린트

		// 5. 국어점수 75, 수학점수 50을 변수에 저장
		// 국어점수와 수학점수의 총합을 구해서 프린트
		// 평균을 구해서 프린트

		int a = 5;
		int b = 20000;
		int c = a * b;

		if (c < 20000) {

			JOptionPane.showMessageDialog(null, "할인해드릴게요.");

		} else {

			JOptionPane.showMessageDialog(null, "총 커피값을 내세요.");

		}

		int x = 33;
		int y = x + 1;

		if (y > 100) {

			JOptionPane.showMessageDialog(null, "이제부터시작");

		} else {

			JOptionPane.showMessageDialog(null, "아직젊어요");

		}

		int a1 = 1000;
		int a2 = a1 * 2;
		int b1 = 2000;
		int b2 = b1 * 3;
		int c1 = a2 + b2;

		JOptionPane.showMessageDialog(null, "1)생수값금액은얼마?" + a2 + "2)마스크값금액은얼마?" + b2 + "3)총지불금액은얼마?" + c1);

		for (int i = 0; i < 1000; i++) {
			System.out.println("나는짱");
		}

		int d1 = 75;
		int e1 = 50;
		int f1 = d1 + e1;
		double g1 = 

		System.out.println(f1);
		System.out.println(g1);

	}

}
