package 생성자;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class BWindow {

	
	public BWindow() {
		System.out.println("B객체가 생성");
	}
	
	public static void open() {
		
		JFrame f = new JFrame("B");
		
		f.setSize(300, 300);
		
		
		JButton b = new JButton("A open");
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AWindow a = new AWindow();
				a.open();
				f.dispose();
				
			
				
			}
		});
		f.getContentPane().add(b);
		f.setVisible(true);

	}

}
