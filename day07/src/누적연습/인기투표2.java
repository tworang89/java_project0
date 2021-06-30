package 누적연습;

import javax.swing.JOptionPane;

public class 인기투표2 {

	public static void main(String[] args) {

		int iu = 0;
		int bts = 0;
		int you = 0;

		for (int i = 0; i < 10; i++) {
			String reply = JOptionPane.showInputDialog("좋아하는 연예인 투표 (아이유는 1번, bts는 2번, 유재석은 3번");

			switch (reply) {
			case "1":

				iu++;

				break;

			case "2":

				bts++;

				break;

			case "3":

				you++;

				break;

			default:

				JOptionPane.showMessageDialog(null, "1,2,3번중에 선택해주세요");
				i--;
				break;
			}

		} 
		System.out.println("아이유가 좋은 사람" + iu + "명");
		System.out.println("방탄소년단이 좋은 사람" + bts + "명");
		System.out.println("유재석이 좋은 사람" + you + "명");

	}

}
