package 문제풀이;

import javax.swing.JOptionPane;

public class 조별문제풀이3번 {

	public static void main(String[] args) {

		// 지역번호 입력
		// 031 이면 경기
		// 02 이면 서울
		// 051 이면 부산

		String num1 = JOptionPane.showInputDialog("지역번호");


		switch (num1) {
		case "031":

			System.out.println("경기");

			break;

		case "02":

			System.out.println("서울");

			break;

		case "051":

			System.out.println("부산");

			break;

		default:
			break;
		}

	}

}
