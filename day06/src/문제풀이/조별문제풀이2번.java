package 문제풀이;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 조별문제풀이2번 {

	public static void main(String[] args) {
		// 문제 버튼 4개 색성
		// 색상 넣어서 출력
		// 1번 검은색
		// 2번 마젠타색
		// 3번 회색
		// 4번 그린
		
		JFrame f = new JFrame("나의 버튼 3개");
		f.getContentPane().setBackground(Color.WHITE);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1번");
		btnNewButton.setBackground(Color.BLACK);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("검은색");
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton.setBounds(170, 10, 132, 57);
		f.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2번");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("마젠타색");
			}
		});
		btnNewButton_1.setBackground(Color.MAGENTA);
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_1.setBounds(170, 145, 132, 58);
		f.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3번");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("회색");
			}
		});
		btnNewButton_2.setBackground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_2.setBounds(170, 272, 132, 57);
		f.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("4번");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.out.println("그린");
			}
		});
		btnNewButton_3.setBackground(Color.GREEN);
		btnNewButton_3.setFont(new Font("굴림", Font.BOLD, 30));
		btnNewButton_3.setBounds(170, 394, 132, 57);
		f.getContentPane().add(btnNewButton_3);
		f.setVisible(true);
		
		
		
		
		
		
		

	}

}
