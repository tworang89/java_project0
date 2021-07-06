package 그래픽;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class up {
	
	public void up() {
		
		JFrame f = new JFrame("업프레임");
		f.setSize(300, 300);
		JButton b = new JButton("나를눌렀군요");
		
		f.add(b);
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
			up2 up2 = new up2();
			
			up2.up();
				// TODO Auto-generated method stub
				
			}
		});
		
		f.setVisible(true);
		
		
		
		
		
		
	}

}
