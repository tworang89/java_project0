package 문제풀이;

import java.time.chrono.ChronoLocalDateTime;

import javax.swing.JOptionPane;

public class 조별문제풀이 {

	public static void main(String[] args) {
		
		// 문제 : 당신이 하고 싶은 취미는 ? 입력 (자전거 , 운동 , 볼링)
		//       자전거면 밖으로 나가요
		//       운동이면 헬스하러 가요
		//       볼링이면 볼링장으로 가요
		//       출력

		String b1 = JOptionPane.showInputDialog("당신이 하고 싶은 취미는?");
		

		switch (b1) {
		case "자전거":

			System.out.println("밖으로나가요.");

			break;
		case "운동":

			System.out.println("헬스하러가요.");

			break;
		case "볼링":

			System.out.println("볼링장으로 가요.");

			break;
		}

	}

}
