package 순차문;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

public class 윈도우2 {
	private static JTextField textField;
	private static JTextField textField_1;
	private static JTextField textField_2;
	private static JTextField textField_3;

	public static void main(String[] args) {
	 JFrame f = new JFrame();
	  f.setSize(500, 500);
	  f.getContentPane().setLayout(null);
	  
	  JButton btnNewButton = new JButton("버튼1\r\n");
	  btnNewButton.setBackground(Color.BLUE);
	  btnNewButton.setFont(new Font("이사만루체 Bold", Font.PLAIN, 12));
	  btnNewButton.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent e) {
	  		System.out.println("저를 누루셨군요 .");
	  	}
	  });
	  btnNewButton.setBounds(73, 360, 121, 70);
	  f.getContentPane().add(btnNewButton);
	  
	  JButton btnNewButton_1 = new JButton("버튼2");
	  btnNewButton_1.addActionListener(new ActionListener() {
	  	public void actionPerformed(ActionEvent e) {
	  		System.out.println("저도 누루셨군요 .");
	  		
	  	}
	  });
	  btnNewButton_1.setFont(new Font("이사만루체 Bold", Font.PLAIN, 12));
	  btnNewButton_1.setBackground(Color.ORANGE);
	  btnNewButton_1.setBounds(313, 360, 121, 70);
	  f.getContentPane().add(btnNewButton_1);
	  
	  textField = new JTextField();
	  textField.setText("아이디");
	  textField.setFont(new Font("이사만루체 Bold", Font.PLAIN, 18));
	  textField.setBackground(Color.WHITE);
	  textField.setBounds(45, 84, 108, 52);
	  f.getContentPane().add(textField);
	  textField.setColumns(10);
	  
	  textField_1 = new JTextField();
	  textField_1.setBounds(178, 84, 152, 52);
	  f.getContentPane().add(textField_1);
	  textField_1.setColumns(10);
	  
	  textField_2 = new JTextField();
	  textField_2.setBounds(178, 177, 152, 52);
	  f.getContentPane().add(textField_2);
	  textField_2.setColumns(10);
	  
	  textField_3 = new JTextField();
	  textField_3.setBackground(Color.YELLOW);
	  textField_3.setText("패스워드");
	  textField_3.setFont(new Font("이사만루체 Bold", Font.PLAIN, 18));
	  textField_3.setBounds(45, 175, 108, 52);
	  f.getContentPane().add(textField_3);
	  textField_3.setColumns(10);

	  
	  
	  
	  
	  
		f.setVisible(true);
		
		
		
		
		
	}
}
