package 파일시스템;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 일기장만들기 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.LIGHT_GRAY);

		f.setSize(500, 1000);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("오늘의 날짜");
		l1.setFont(new Font("굴림", Font.BOLD, 25));
		l1.setBounds(24, 42, 155, 37);
		f.getContentPane().add(l1);

		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.BOLD, 25));
		t1.setBounds(220, 42, 229, 37);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		JLabel l2 = new JLabel("오늘의 제목");
		l2.setFont(new Font("굴림", Font.BOLD, 25));
		l2.setBounds(24, 128, 155, 37);
		f.getContentPane().add(l2);

		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.BOLD, 25));
		t2.setColumns(10);
		t2.setBounds(220, 128, 229, 37);
		f.getContentPane().add(t2);

		JLabel l3 = new JLabel("오늘의 내용");
		l3.setFont(new Font("굴림", Font.BOLD, 25));
		l3.setBounds(24, 353, 155, 37);
		f.getContentPane().add(l3);

		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.BOLD, 25));
		t3.setColumns(10);
		t3.setBounds(220, 228, 229, 287);
		f.getContentPane().add(t3);

		JButton b1 = new JButton("파일에 일기 저장");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				try {
					String day = t1.getText();
					String title = t2.getText();
					String content = t3.getText();

					FileWriter file = new FileWriter(day + ".txt");

					file.write(day + "\n");
					file.write(title + "\n");
					file.write(content + "\n");
					file.close();

					JOptionPane.showMessageDialog(null, "일기가 기록됨");

				} catch (IOException e) {

					System.out.println("파일을 저장하는 동안 에러가 발생 하였습니다.");

				}

			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 25));
		b1.setBounds(70, 634, 351, 77);
		f.getContentPane().add(b1);

		f.setVisible(true);
	}
}
