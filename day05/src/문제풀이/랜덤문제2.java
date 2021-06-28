package 문제풀이;

import javax.swing.JOptionPane;

public class 랜덤문제2 {

	public static void main(String[] args) {

		// 1. 무한루프
		// 2. 게임 계속 물어보고
		// 3. 답변에 다르게 처리

		while (true) {
             // 반복문 생성

			String data = JOptionPane.showInputDialog("계속하실래요?(0:계속,종료:1)");
			// 메세지출력
			int data2 = Integer.parseInt(data); // 정수변환
			if (data2 == 1) { // 조건생성

				JOptionPane.showMessageDialog(null, "게임을 중지 합니다."); //메시지출력
				break; // 조건종료

			} else { //조건의반대값

				JOptionPane.showMessageDialog(null, "게임을 계속 합니다"); //메시지출력


				String n1 = JOptionPane.showInputDialog("사람1 숫자입력"); //입력값 생성1
				String n2 = JOptionPane.showInputDialog("사람2 숫자입력"); //입력값 생성2

				int n11 = Integer.parseInt(n1); //입력값1 정수변환
				int n22 = Integer.parseInt(n2); //입력값2 정수변환

				if (n11 > n22) { //조건생성
					JOptionPane.showMessageDialog(null, "사람1승리");//조건에 따른 메세지출력
				} else if (n11 < n22) { //조건생성2
					JOptionPane.showMessageDialog(null, "사람2승리");//조건에 따른 메세지출력2
				} else { //조건생성3
					JOptionPane.showMessageDialog(null, "무승부");//조건에 따른 메시지출력3
				}

			}

		}

	}

}
