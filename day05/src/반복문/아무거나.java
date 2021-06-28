package 반복문;

import java.util.Random;

//import javax.swing.JButton;
//import javax.swing.JFileChooser;
//import javax.swing.JFrame;
//import javax.swing.JLabel;
//import javax.swing.JTabbedPane;
//import javax.swing.JTextField;

public class 아무거나 {

	public static void main(String[] args) {

		// new: 벽돌처럼 사용할때 ram에 새롭게 복사해서
		// 부품을 사용함.

		// JFrame f = new JFrame();
		// JButton b1 = new JButton();
		// JTextField t1 = new JTextField();
		// JLabel l = new JLabel();

		Random r = new Random(); // 씨앗값(seed)
		int num = r.nextInt(100); // 0~99
		System.out.println(num);

		// 50보다 작은 임의의 수 생성
		// 5~49

		int num2 = r.nextInt(45) + 5;
		System.out.println(num2);

		int num3 = r.nextInt(900) + 100;
		System.out.println(num3);
		// 1000보다 작은 임의의수 생성
		// 0~899
		
		int num4 = r.nextInt(20) + 3 ;
		System.out.println(num4);

	}

}
