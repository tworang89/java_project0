package pack04;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;

public class Test04 {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		JFrame f = new JFrame("계산기");
		//부품 임포트
		
		f.setSize(500, 500);
		//사이즈
	
		f.getContentPane().setLayout(null);
		//레이아웃
		JLabel l1 = new JLabel("숫자1");
		l1.setFont(new Font("굴림", Font.PLAIN, 25));
		l1.setBounds(95, 92, 112, 40);
		f.getContentPane().add(l1);
		//l2 설정
		JLabel l2 = new JLabel("숫자2");
		l2.setFont(new Font("굴림", Font.PLAIN, 25));
		l2.setBounds(95, 171, 112, 40);
		f.getContentPane().add(l2);
		//l1 설정
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 30));
		t1.setBounds(244, 92, 124, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		//t1 설정
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 30));
		t2.setColumns(10);
		t2.setBounds(244, 171, 124, 34);
		f.getContentPane().add(t2);
		//t2 설정
		JButton b1 = new JButton("더하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			
			}
		});
		b1.setFont(new Font("굴림", Font.PLAIN, 30));
		b1.setBounds(67, 329, 140, 66);
		f.getContentPane().add(b1);
		//b1 버튼 설정
		
		JButton b2 = new JButton("빼기");
		b2.setFont(new Font("굴림", Font.PLAIN, 30));
		b2.setBounds(281, 329, 140, 66);
		f.getContentPane().add(b2);
		//b2 버튼 설정
		
		f.setVisible(true);//보여주는것

	}
}
