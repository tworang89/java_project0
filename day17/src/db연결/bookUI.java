package db연결;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.nio.file.attribute.AclEntry;
import java.awt.event.ActionEvent;

public class bookUI {
	private static JTextField t1;
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.getContentPane().setBackground(Color.YELLOW);
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);
		JLabel lblNewLabel = new JLabel("도서넘버");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel.setBounds(27, 28, 79, 36);
		f.getContentPane().add(lblNewLabel);
		t1 = new JTextField();
		t1.setFont(new Font("굴림", Font.PLAIN, 25));
		t1.setBounds(135, 28, 116, 36);
		f.getContentPane().add(t1);
		t1.setColumns(10);
		JLabel lblNewLabel_1 = new JLabel("패스워드");
		lblNewLabel_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(27, 74, 79, 36);
		f.getContentPane().add(lblNewLabel_1);
		t2 = new JTextField();
		t2.setFont(new Font("굴림", Font.PLAIN, 25));
		t2.setColumns(10);
		t2.setBounds(135, 74, 116, 36);
		f.getContentPane().add(t2);
		JLabel lblNewLabel_1_1 = new JLabel("이름");
		lblNewLabel_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1.setBounds(27, 127, 79, 36);
		f.getContentPane().add(lblNewLabel_1_1);
		t3 = new JTextField();
		t3.setFont(new Font("굴림", Font.PLAIN, 25));
		t3.setColumns(10);
		t3.setBounds(135, 127, 116, 36);
		f.getContentPane().add(t3);
		JLabel lblNewLabel_1_1_1 = new JLabel("전화번호");
		lblNewLabel_1_1_1.setFont(new Font("굴림", Font.PLAIN, 15));
		lblNewLabel_1_1_1.setBounds(27, 173, 79, 36);
		f.getContentPane().add(lblNewLabel_1_1_1);
		t4 = new JTextField();
		t4.setFont(new Font("굴림", Font.PLAIN, 25));
		t4.setColumns(10);
		t4.setBounds(135, 173, 116, 36);
		f.getContentPane().add(t4);
		JButton btnNewButton = new JButton("가입");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// t1~t4에 입력된 값을 가지고 와야함
				String id = t1.getText();
				String pw = t2.getText();
				String name = t3.getText();
				String tel = t4.getText();
				// member 테이블에 저장하려고함.
				// 해결책,우리가 원하는 기능을 가진 메서드를 가지고 있는
				// 부품을 찾아야함
				// 램에 가져다 놓으면 됨
				

				MemberDB db = new MemberDB();
				try {
					db.create(id, pw, name, tel);
				}catch(Exception e1) {
					e1.printStackTrace();
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");

			}
		});
		btnNewButton.setFont(new Font("굴림", Font.PLAIN, 10));
		btnNewButton.setBounds(60, 219, 55, 32);
		f.getContentPane().add(btnNewButton);
		JButton btnNewButton_1 = new JButton("탈퇴");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String id = JOptionPane.showInputDialog("탈퇴할 id 입니다");
				
				MemberDB db = new MemberDB();
				
				 try {
		               int result = db.delete(id);//1
		               if(result == 1) {
		                  JOptionPane.showMessageDialog(f, "탈퇴 성공@@@" );
		               }else {
		                  JOptionPane.showMessageDialog(f, "없는 id입니다.");
		               }
		            } catch (Exception e1) {
		               e1.printStackTrace();
		            }
		         }

		});
		btnNewButton_1.setFont(new Font("굴림", Font.PLAIN, 10));
		btnNewButton_1.setBounds(127, 219, 55, 32);
		f.getContentPane().add(btnNewButton_1);
		JButton btnNewButton_2 = new JButton("수정");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String id = JOptionPane.showInputDialog(f,"수정할 아이디 입력");
				String tel = JOptionPane.showInputDialog(f,"수정할 연락처 입력");
				
				MemberDB db = new MemberDB();
				
				try {
					
					int result = db.update(tel,id);
					
				
				if (result == 1) {
					
					JOptionPane.showMessageDialog(f, "수정성공");
					
				}else{
					
					JOptionPane.showMessageDialog(f, "없는 아이디");
					
				}
				
				}catch (Exception e1) {
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton_2.setFont(new Font("굴림", Font.PLAIN, 10));
		btnNewButton_2.setBounds(196, 219, 55, 32);
		f.getContentPane().add(btnNewButton_2);
		f.setVisible(true);
	}
}
