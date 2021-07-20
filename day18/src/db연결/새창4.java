package db연결;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 새창4 {
	
	public void open4(int no2) {
		JFrame f = new JFrame("새창1화면@@");
		f.setSize(500,500);
		if (no2 >= 30) {
			
		JOptionPane.showMessageDialog(f,"폭염!!!!");
			
		}
		JButton b1 = new JButton("새창1버튼 화면닫기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(f, "새창을 닫습니다.");
				// System.exit(0); 프로그램 종료
				
				//f.dispose(); 그 창만 닫는것
				
				
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
