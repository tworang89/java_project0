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
import java.awt.CardLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.RowSpec;
import net.miginfocom.swing.MigLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class 버튼5개 {

	public static void main(String[] args) {
		// 디자인은 무조건 jframe을 치고 시작
		// f.setsize 만들기 f.setVisible(true) 하기
		
		JFrame f = new JFrame("나의 버튼 5개");
		f.setSize(500, 500);
		f.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("북쪽");
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setForeground(Color.BLUE);
		btnNewButton.setFont(new Font("이사만루체 Light", Font.BOLD, 25));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(f, "북쪽입니다.");
			}
		});
		f.getContentPane().add(btnNewButton, BorderLayout.NORTH);
		
		JButton btnNewButton_1 = new JButton("서쪽");
		btnNewButton_1.setBackground(Color.YELLOW);
		btnNewButton_1.setForeground(Color.BLUE);
		btnNewButton_1.setFont(new Font("이사만루체 Light", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_1, BorderLayout.WEST);
		
		JButton btnNewButton_2 = new JButton("중앙");
		btnNewButton_2.setBackground(Color.RED);
		btnNewButton_2.setForeground(Color.BLUE);
		btnNewButton_2.setFont(new Font("이사만루체 Light", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_2, BorderLayout.CENTER);
		
		JButton btnNewButton_3 = new JButton("동쪽");
		btnNewButton_3.setBackground(Color.CYAN);
		btnNewButton_3.setForeground(Color.BLUE);
		btnNewButton_3.setFont(new Font("이사만루체 Light", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_3, BorderLayout.EAST);
		
		JButton btnNewButton_4 = new JButton("남쪽");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(f, "남쪽입니다");
			}
		});
		btnNewButton_4.setBackground(Color.GREEN);
		btnNewButton_4.setForeground(Color.BLUE);
		btnNewButton_4.setFont(new Font("이사만루체 Light", Font.BOLD, 25));
		f.getContentPane().add(btnNewButton_4, BorderLayout.SOUTH);
		f.setVisible(true);

	}
}
