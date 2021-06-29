package 그래픽프로그램;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JProgressBar;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.BorderLayout;
import javax.swing.BoxLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class 버튼3개2 {

	public static void main(String[] args) {
		// 디자인은 무조건 jframe을 치고 시작
		// f.setsize 만들기 f.setVisible(true) 하기

		JFrame f = new JFrame("나의 버튼 3개");
		f.getContentPane().setBackground(Color.BLACK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);
		
		JButton b = new JButton("");
		b.setBounds(64, 30, 364, 130);
		f.getContentPane().add(b);
		
		JLabel m = new JLabel("New label");
		m.setForeground(Color.WHITE);
		m.setBackground(Color.WHITE);
		m.setBounds(184, 258, 205, 130);
		f.getContentPane().add(m);
		
		ImageIcon mac1 = new ImageIcon("mac1.png");
		b.setIcon(mac1);
		
		
		
		
		

		f.setVisible(true);

	}
}
