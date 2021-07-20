package db연결;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class 새창2 {
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void open2() {
		JFrame f = new JFrame("새창2화면@@");
		f.setSize(800,1000);
		JButton b1 = new JButton("새창2버튼 화면닫기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//JOptionPane.showMessageDialog(f, "새창2를 닫습니다.");
//				f.dispose();
				f.dispose();
			}
		});
		f.getContentPane().add(b1);
		b1.setBackground(Color.green);
		f.setVisible(true);
		
	}

}
