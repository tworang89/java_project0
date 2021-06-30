package 그래픽;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class 버튼만들기 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {

		JFrame f = new JFrame("로그인 처리 화면");
		f.getContentPane().setBackground(Color.YELLOW);

		f.setSize(500, 500);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("아이디:");
		l1.setFont(new Font("굴림", Font.BOLD, 30));
		l1.setBounds(30, 78, 147, 49);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel("패스워드:");
		l2.setFont(new Font("굴림", Font.BOLD, 30));
		l2.setBounds(30, 167, 147, 49);
		f.getContentPane().add(l2);

		JButton b2 = new JButton("지우기");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				t1.setText("");
				t2.setText("");

			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 25));
		b2.setBounds(240, 291, 214, 49);
		f.getContentPane().add(b2);
		
		JLabel result = new JLabel("결과보이는곳");
		result.setForeground(Color.RED);
		result.setFont(new Font("굴림", Font.BOLD, 30));
		result.setBounds(140, 378, 214, 49);
		f.getContentPane().add(result);

		JButton b1 = new JButton("로그인확인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 누룰때 마다 실행
				String s1 = t1.getText(); // apple
				String s2 = t2.getText(); // pass
				// getText(); 입력 값을 가져오는 함수

				if (s1.equals("apple") && s2.equals("pass")) {
		               result.setText("로그인 성공@@@@");
		            } else {
		               result.setText("로그인 실패@@@@");
		            }

			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 25));
		b1.setBounds(30, 291, 192, 49);
		f.getContentPane().add(b1);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 30));
		t1.setBounds(240, 78, 214, 49);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 30));
		t2.setColumns(10);
		t2.setBounds(240, 167, 214, 49);
		f.getContentPane().add(t2);


		f.setVisible(true);

	}
}
