package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class 윈도우3 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;
	private static JTextField textField_4;
	private static JTextField textField_6;
	private static JTextField textField_7;
	private static JTextField textField_8;
	private static JTextField textField_9;
	private static JTextField textField_5;
	private static JTextField textField_10;
	private static JTextField textField_11;

	public static void main(String[] args) {
	 JFrame f = new JFrame();
	 f.getContentPane().setForeground(Color.WHITE);
	 f.getContentPane().setBackground(Color.WHITE);
	  f.setSize(500, 500);
	  f.getContentPane().setLayout(null);
	  
	  JButton btnNewButton = new JButton("일기저장");
	  btnNewButton.setForeground(Color.BLACK);
	  btnNewButton.setBackground(Color.BLUE);
	  btnNewButton.setFont(new Font("이사만루체 Bold", Font.PLAIN, 18));
	  btnNewButton.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent e) {
	  		JOptionPane.showMessageDialog(null, "저를 누르셨군요");
	  		
	  		
	  	}
	  });
	  btnNewButton.setBounds(35, 387, 116, 50);
	  f.getContentPane().add(btnNewButton);
	  
	  JButton btnNewButton_1 = new JButton("낙서장");
	  btnNewButton_1.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent e) {
	  		JOptionPane.showMessageDialog(null,"눌렀군요");
	  	}
	  });
	  btnNewButton_1.setFont(new Font("이사만루체 Bold", Font.PLAIN, 18));
	  btnNewButton_1.setBackground(Color.BLUE);
	  btnNewButton_1.setBounds(198, 387, 116, 50);
	  f.getContentPane().add(btnNewButton_1);
	  
	  JButton btnNewButton_2 = new JButton("자폭");
	  btnNewButton_2.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent e) {
	  		JOptionPane.showMessageDialog(null,"펑!");
	  	}
	  });
	  btnNewButton_2.setBackground(Color.BLUE);
	  btnNewButton_2.setFont(new Font("이사만루체 Bold", Font.PLAIN, 18));
	  btnNewButton_2.setBounds(356, 387, 116, 50);
	  f.getContentPane().add(btnNewButton_2);
	  
	  textField_4 = new JTextField();
	  textField_4.setBackground(Color.WHITE);
	  textField_4.setForeground(Color.BLACK);
	  textField_4.setFont(new Font("이사만루체 Bold", Font.PLAIN, 18));
	  textField_4.setText("번호");
	  textField_4.setBounds(35, 107, 47, 28);
	  f.getContentPane().add(textField_4);
	  textField_4.setColumns(10);
	  
	  textField_6 = new JTextField();
	  textField_6.setBackground(Color.ORANGE);
	  textField_6.setBounds(35, 231, 437, 146);
	  f.getContentPane().add(textField_6);
	  textField_6.setColumns(10);
	  
	  textField_7 = new JTextField();
	  textField_7.setFont(new Font("이사만루체 Bold", Font.PLAIN, 49));
	  textField_7.setText("나의일기장");
	  textField_7.setBackground(Color.PINK);
	  textField_7.setBounds(119, 10, 246, 82);
	  f.getContentPane().add(textField_7);
	  textField_7.setColumns(10);
	  
	  textField_8 = new JTextField();
	  textField_8.setBounds(94, 109, 378, 28);
	  f.getContentPane().add(textField_8);
	  textField_8.setColumns(10);
	  
	  textField_9 = new JTextField();
	  textField_9.setText("날짜");
	  textField_9.setForeground(Color.BLACK);
	  textField_9.setFont(new Font("이사만루체 Bold", Font.PLAIN, 18));
	  textField_9.setColumns(10);
	  textField_9.setBackground(Color.WHITE);
	  textField_9.setBounds(35, 152, 47, 28);
	  f.getContentPane().add(textField_9);
	  
	  textField_5 = new JTextField();
	  textField_5.setColumns(10);
	  textField_5.setBounds(94, 152, 378, 28);
	  f.getContentPane().add(textField_5);
	  
	  textField_10 = new JTextField();
	  textField_10.setText("제목");
	  textField_10.setForeground(Color.BLACK);
	  textField_10.setFont(new Font("이사만루체 Bold", Font.PLAIN, 18));
	  textField_10.setColumns(10);
	  textField_10.setBackground(Color.WHITE);
	  textField_10.setBounds(35, 193, 47, 28);
	  f.getContentPane().add(textField_10);
	  
	  textField_11 = new JTextField();
	  textField_11.setColumns(10);
	  textField_11.setBounds(94, 190, 378, 28);
	  f.getContentPane().add(textField_11);

	  
	  
	  
		f.setVisible(true);
		
		
		
		
		
	}
}
