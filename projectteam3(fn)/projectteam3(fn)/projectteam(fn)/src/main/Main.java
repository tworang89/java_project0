package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import book.BookList;
import member.MemberDAO;
import member.MemberJoin;

//	******** 크게 수정한 부분 ********
//	클래스명 수정 Main.java
//	컬러 코드 (Background: DARK_GRAY, 폰트 Foreground: WHITE)
//	서점 이름을 bookstore에서 북흐북흐로 변경
//	아이디, 패스워드 라벨/텍스트필드/버튼 위치 조정
//	버튼 아래에 안내 문구 추가 
//	로그인 성공시 memid 값을 BookList에게 넘겨줌 booklist.open(memid)

public class Main {
	private static JTextField t1;
	private static JTextField t2;

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setForeground(Color.WHITE);
		f.getContentPane().setFont(new Font("Dialog", Font.BOLD, 15));
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("Bookook   ", SwingConstants.CENTER);
		l1.setFont(new Font("LingWai TC", Font.PLAIN, 99));
		l1.setBounds(6, 145, 988, 126);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel("   Bookook", SwingConstants.CENTER);
		l2.setFont(new Font("LingWai TC", Font.PLAIN, 99));
		l2.setBounds(6, 218, 988, 126);
		f.getContentPane().add(l2);

		JLabel l3 = new JLabel("3조 0차 프로젝트 : 북흐북흐");
		l3.setBounds(529, 328, 152, 16);
		f.getContentPane().add(l3);

		JLabel l4 = new JLabel("아이디");
		l4.setHorizontalAlignment(SwingConstants.RIGHT);
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		l4.setBounds(306, 393, 75, 40);
		f.getContentPane().add(l4);

		JLabel l5 = new JLabel("비밀번호");
		l5.setHorizontalAlignment(SwingConstants.RIGHT);
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		l5.setBounds(308, 450, 75, 40);
		f.getContentPane().add(l5);

		t1 = new JTextField();
		t1.setBounds(395, 393, 270, 40);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(394, 448, 270, 40);
		f.getContentPane().add(t2);

		JLabel l6 = new JLabel("서비스를 이용하시려면 로그인이 필요합니다.");
		l6.setForeground(Color.WHITE);

		l6.setBounds(396, 580, 287, 16);
		f.getContentPane().add(l6);

		JLabel l7 = new JLabel("아이디가 없으시다면 회원가입 해주세요.");
		l7.setForeground(Color.WHITE);
		l7.setBounds(395, 600, 287, 16);
		f.getContentPane().add(l7);

		JButton b1 = new JButton("로그인");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberDAO db = new MemberDAO();
				try {
					String pw = db.read2(t1.getText());
					if (t2.getText().equals(pw)) {
						String memid = t1.getText();
						BookList booklist = new BookList();
						booklist.open(memid);
//						f.setVisible(false); // 로그인성공하면 메인 페이지 숨기기
					} else {
						JOptionPane.showMessageDialog(f, "아이디와 비밀번호를 확인해주세요.");
						t2.setText("");
					}

				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b1.setBounds(395, 513, 125, 55);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("회원가입");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberJoin memberjoin = new MemberJoin();
				memberjoin.join();
			}
		});
		b2.setBounds(540, 513, 125, 55);
		f.getContentPane().add(b2);
		f.setVisible(true);
	}

}
