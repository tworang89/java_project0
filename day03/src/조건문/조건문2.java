package 조건문;

import javax.swing.JOptionPane;

public class 조건문2 {

	public static void main(String[] args) {

		int x = 111;
		int y = 222;

		if (x > y) {
			// 조건이 true이면 실행시키고 싶은 부분 코드
			JOptionPane.showMessageDialog(null, "x가더커요.");
		} else {

			JOptionPane.showMessageDialog(null, "Y가더크거나같아요.");
			// 조건이 false 이면 실행시키고 싶은 부분 코드
		}

	}

}
