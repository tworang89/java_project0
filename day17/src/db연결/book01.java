package db연결;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class book01 {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JTextField t6;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.ORANGE);
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("도서No");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel.setBounds(454, 55, 113, 53);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("도서명");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1.setBounds(454, 135, 113, 53);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("지은이");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1_1.setBounds(454, 217, 113, 53);
		f.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("장르");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1_1_1.setBounds(454, 304, 113, 53);
		f.getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("가격");
		lblNewLabel_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1.setBounds(58, 478, 113, 53);
		f.getContentPane().add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("판매량");
		lblNewLabel_1_1_1_1_1.setFont(new Font("굴림", Font.PLAIN, 25));
		lblNewLabel_1_1_1_1_1.setBounds(517, 478, 113, 53);
		f.getContentPane().add(lblNewLabel_1_1_1_1_1);

		t1 = new JTextField();
		t1.setBounds(579, 55, 343, 53);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(579, 135, 343, 53);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(579, 217, 343, 53);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(579, 304, 343, 53);
		f.getContentPane().add(t4);

		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(183, 478, 280, 53);
		f.getContentPane().add(t5);

		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(642, 478, 280, 53);
		f.getContentPane().add(t6);

		JButton b1 = new JButton("등록");
		b1.setFont(new Font("굴림", Font.BOLD, 40));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookid = t1.getText();
				String bookname = t2.getText();
				String writer = t3.getText();
				String genre = t4.getText();
				String price = t5.getText();
				String sold = t6.getText();

				book01DB db = new book01DB();

				try {
					db.create(bookid, bookname, writer, genre, price, sold);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				t6.setText("");
				
				System.out.println(bookid + bookname);

			}
			
			
			
		});
		b1.setBounds(58, 583, 280, 94);
		f.getContentPane().add(b1);

		JButton b3 = new JButton("취소");
		b3.setFont(new Font("굴림", Font.BOLD, 40));
		b3.setBounds(642, 583, 280, 94);
		f.getContentPane().add(b3);

		JButton b2 = new JButton("삭제");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookid = JOptionPane.showInputDialog("삭제 할 도서No 입력");

				book01DB db = new book01DB();
				try {
					int result = db.delete(bookid);// 1
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "삭제되었습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "없는 도서No 입니다.");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 40));
		b2.setBounds(350, 583, 280, 94);
		f.getContentPane().add(b2);
		f.setVisible(true);

	}
}
