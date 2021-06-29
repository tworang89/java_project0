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

public class 버튼3개 {

	public static void main(String[] args) {
		// 디자인은 무조건 jframe을 치고 시작
		// f.setsize 만들기 f.setVisible(true) 하기

		JFrame f = new JFrame("나의 버튼 3개");
		f.getContentPane().setBackground(Color.BLACK);
		f.setSize(500, 500);
		f.getContentPane().setLayout(null);// 레이아웃을 지정하지 않으면 내가 넣고 싶은 위치에 넣을 수 있다.

		JButton btnNewButton = new JButton("별 10개");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < 10; i++) {

					System.out.print("*");
				}

				System.out.println();
			}
		});
		btnNewButton.setForeground(Color.DARK_GRAY);
		btnNewButton.setFont(new Font("이사만루체 Bold", Font.BOLD, 20));
		btnNewButton.setBounds(167, 10, 144, 77);
		f.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("커피 * 5");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < 5; i++) {

					System.out.print("커피*");

				}

				System.out.println();

			}
		});
		btnNewButton_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1.setFont(new Font("이사만루체 Bold", Font.BOLD, 20));
		btnNewButton_1.setBounds(167, 138, 144, 77);
		f.getContentPane().add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("1:짱!");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (int i = 1; i < 4; i++) {

					System.out.println(i+":짱!");

				}

			}
		});
		btnNewButton_2.setForeground(Color.DARK_GRAY);
		btnNewButton_2.setFont(new Font("이사만루체 Bold", Font.BOLD, 20));
		btnNewButton_2.setBounds(167, 374, 144, 77);
		f.getContentPane().add(btnNewButton_2);

		JButton btnNewButton_1_1 = new JButton("커피 * 우유3");
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				for (int i = 0; i < 3; i++) {

					System.out.println("커피*우유");

				}
			}
		});
		btnNewButton_1_1.setForeground(Color.DARK_GRAY);
		btnNewButton_1_1.setFont(new Font("이사만루체 Bold", Font.BOLD, 20));
		btnNewButton_1_1.setBounds(167, 256, 144, 77);
		f.getContentPane().add(btnNewButton_1_1);

		f.setVisible(true);

	}
}
