package 순차문;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 순차문6 {
	private static JTextField textField;
	private static JTextField textField_2;
	private static JTextField textField_4;
	private static JTextField textField_5;
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JButton btnNewButton;
	private static JButton btnNewButton_1;
	private static JButton btnNewButton_2;

	public static void main(String[] args) {

		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.PINK);
		f.setSize(500, 600);
		f.getContentPane().setLayout(null);

		textField = new JTextField();
		textField.setForeground(Color.WHITE);
		textField.setFont(new Font("굴림", Font.PLAIN, 18));
		textField.setBackground(Color.ORANGE);
		textField.setText("먹고싶은음식");
		textField.setBounds(36, 63, 123, 47);
		f.getContentPane().add(textField);
		textField.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setText("당신의 나이는");
		textField_2.setForeground(Color.WHITE);
		textField_2.setFont(new Font("굴림", Font.PLAIN, 18));
		textField_2.setColumns(10);
		textField_2.setBackground(Color.ORANGE);
		textField_2.setBounds(36, 250, 123, 40);
		f.getContentPane().add(textField_2);

		textField_4 = new JTextField();
		textField_4.setText("국어점수");
		textField_4.setForeground(Color.WHITE);
		textField_4.setFont(new Font("굴림", Font.PLAIN, 18));
		textField_4.setColumns(10);
		textField_4.setBackground(Color.ORANGE);
		textField_4.setBounds(36, 381, 123, 40);
		f.getContentPane().add(textField_4);

		textField_5 = new JTextField();
		textField_5.setText("수학점수");
		textField_5.setForeground(Color.WHITE);
		textField_5.setFont(new Font("굴림", Font.PLAIN, 18));
		textField_5.setColumns(10);
		textField_5.setBackground(Color.ORANGE);
		textField_5.setBounds(36, 447, 123, 40);
		f.getContentPane().add(textField_5);

		t1 = new JTextField();
		t1.setBackground(Color.GREEN);
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setBounds(235, 63, 160, 47);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setBackground(Color.MAGENTA);
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setColumns(10);
		t2.setBounds(235, 243, 160, 47);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setBackground(Color.CYAN);
		t3.setFont(new Font("굴림", Font.PLAIN, 30));
		t3.setColumns(10);
		t3.setBounds(235, 374, 160, 47);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setBackground(Color.CYAN);
		t4.setFont(new Font("굴림", Font.PLAIN, 30));
		t4.setColumns(10);
		t4.setBounds(235, 440, 160, 47);
		f.getContentPane().add(t4);

		btnNewButton = new JButton("어디로갈까?");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 버튼을 클릭 했을때 자동으로 이 함수가 실행됨
				// 버튼을 클릭 했을때 처리내용을 넣으면 됨
				

		
		
		
		
			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 17));
		btnNewButton.setBounds(80, 163, 275, 47);
		f.getContentPane().add(btnNewButton);

		btnNewButton_1 = new JButton("나의 내년 나이는?");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 17));
		btnNewButton_1.setBounds(80, 319, 275, 47);
		f.getContentPane().add(btnNewButton_1);

		btnNewButton_2 = new JButton("두 과목 점수의 평균은?");
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 17));
		btnNewButton_2.setBounds(80, 504, 275, 47);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);

	}
}
