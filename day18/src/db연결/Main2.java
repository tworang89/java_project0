package db연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Main2 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {
		
		JFrame f = new JFrame("main창 여기서 시작!");
		f.setSize(572, 534);
		Font font = new Font("궁서", Font.BOLD,40);
		JButton b1 = new JButton("로그인처리");
		b1.setBounds(70, 193, 437, 81);
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				새창3 w3 = new 새창3();
				String id = t1.getText();
				String pw = t1.getText();
				w3.open3(id,pw);
			}
		});
		JButton b2 = new JButton("결정!!");
		b2.setBounds(136, 416, 257, 55);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String no =t3.getText();
				새창4 w4 = new 새창4();
				int no2 = Integer.parseInt(no);
				w4.open4(no2);
			}
		});
		f.getContentPane().setLayout(null);
		f.getContentPane().add(b1);
		
		t1 = new JTextField();
		t1.setBounds(229, 27, 278, 55);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		f.getContentPane().add(b2);
		b1.setFont(font);
		b2.setFont(font);
		b1.setBackground(Color.green);
		b2.setBackground(Color.yellow);
		
		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(229, 106, 278, 55);
		f.getContentPane().add(t2);
		
		JLabel lblNewLabel = new JLabel("ID");
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel.setBounds(70, 27, 122, 55);
		f.getContentPane().add(lblNewLabel);
		
		JLabel lblPw = new JLabel("pw");
		lblPw.setFont(new Font("굴림", Font.BOLD, 30));
		lblPw.setBounds(70, 106, 122, 55);
		f.getContentPane().add(lblPw);
		
		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(229, 341, 278, 55);
		f.getContentPane().add(t3);
		
		JLabel lblNewLabel_1 = new JLabel("오늘의 온도");
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_1.setBounds(51, 341, 166, 55);
		f.getContentPane().add(lblNewLabel_1);
		
		
		
		f.setVisible(true);

	}

}
