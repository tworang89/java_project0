package db연결;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 새창3 {
	
	public void open3(String id,String pw) {
		JFrame f = new JFrame("새창3화면@@");
		f.setSize(500,500);
		JButton b1 = new JButton("새창3버튼 화면닫기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(f, "새창을 닫습니다.");
				// System.exit(0); 프로그램 종료
				
//				f.dispose(); 그 창만 닫는것
				
				
//				f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//				System.exit(0);
				f.dispose();
				
			}
		});
		f.getContentPane().add(b1);
		b1.setBackground(Color.pink);
		f.setVisible(true);
		
	}

}
