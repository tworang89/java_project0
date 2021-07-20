package member;

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

import pay.PayDAO;

public class MemberPage {

//	******** 크게 수정한 부분 ********
//	클래스명 수정 MemberPage.java
//	MemberPage 호출 메서드 = myPage (BookList에서 memid 갖고오기)
//	컬러 코드 (Background: DARK_GRAY, 폰트 Foreground: WHITE)
//	서점 이름을 bookstore에서 북흐북흐로 변경
//	라벨/텍스트필드/버튼 위치 조정
//	memid는 수정불가능한 값이라 텍스트필드 삭제 후 id 출력 라벨 추가
//	메인으로 버튼 추가 (현재 창 닫기)
//	탈퇴 성공시 프로그램 종료

	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JTextField t6;
	private static JTextField t2;

	/**
	 * @wbp.parser.entryPoint
	 */
	public void myPage(String memid) {
		JFrame f = new JFrame();
		f.setSize(1000, 800);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.getContentPane().setLayout(null);

		JLabel l4 = new JLabel("아이디");
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		l4.setBounds(236, 348, 91, 34);
		f.getContentPane().add(l4);

		JLabel l6 = new JLabel("비밀번호 확인");
		l6.setForeground(Color.WHITE);
		l6.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		l6.setBounds(236, 444, 144, 34);
		f.getContentPane().add(l6);

		JLabel l7 = new JLabel("이름");
		l7.setForeground(Color.WHITE);
		l7.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		l7.setBounds(236, 490, 91, 34);
		f.getContentPane().add(l7);

		JLabel l8 = new JLabel("전화번호");
		l8.setForeground(Color.WHITE);
		l8.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		l8.setBounds(236, 532, 91, 34);
		f.getContentPane().add(l8);

		JLabel l9 = new JLabel("주소");
		l9.setForeground(Color.WHITE);
		l9.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		l9.setBounds(236, 578, 91, 34);
		f.getContentPane().add(l9);

		JLabel l5 = new JLabel("새로운 비밀번호");
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		l5.setBounds(236, 394, 155, 34);
		f.getContentPane().add(l5);

		JLabel lblId = new JLabel(memid);
		lblId.setForeground(Color.WHITE);
		lblId.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblId.setBounds(427, 348, 244, 34);
		f.getContentPane().add(lblId);

//		t1 = new JTextField();
//		t1.setBounds(339, 278, 244, 34);
//		f.getContentPane().add(t1);
//		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(427, 398, 244, 34);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(427, 444, 244, 34);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(427, 490, 244, 34);
		f.getContentPane().add(t4);

		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(427, 536, 244, 34);
		f.getContentPane().add(t5);

		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(427, 578, 244, 34);
		f.getContentPane().add(t6);

		JButton b1 = new JButton("회원탈퇴");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberDAO db = new MemberDAO();
				PayDAO db2 = new PayDAO();
				try {
					int result2 = db2.deletePayM(memid);
					int result = db.delete(memid);
					if (result == 1 && result2 == 1) {
						JOptionPane.showMessageDialog(f, "탈퇴 성공");
						System.exit(0);
					} else {
						JOptionPane.showMessageDialog(f, "탈퇴 실패");
					}
				} catch (Exception e1) {
					e1.printStackTrace();

				}
			}
		});
		b1.setBounds(620, 663, 117, 29);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("회원수정");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String[] all = { t2.getText(), t4.getText(), t5.getText(), t6.getText() };
				MemberDAO db = new MemberDAO();
				try {
					int result = db.update(memid, all);
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "수정 성공");
						t2.setText("");
						t3.setText("");
						t4.setText("");
						t5.setText("");
						t6.setText("");
					} else {
						JOptionPane.showMessageDialog(f, "수정 실패");
					}
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b2.setBounds(749, 663, 117, 29);
		f.getContentPane().add(b2);

		JLabel lblNewLabel_4 = new JLabel("회원 정보 수정");
		lblNewLabel_4.setForeground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Lucida Grande", Font.PLAIN, 35));
		lblNewLabel_4.setBounds(121, 266, 206, 48);
		f.getContentPane().add(lblNewLabel_4);

		JButton b3 = new JButton("메인으로");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		b3.setBounds(121, 663, 117, 29);
		f.getContentPane().add(b3);

		JLabel l1 = new JLabel("Bookook   ", SwingConstants.CENTER);
		l1.setFont(new Font("LingWai TC", Font.PLAIN, 99));
		l1.setBounds(6, 57, 988, 126);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel("   Bookook", SwingConstants.CENTER);
		l2.setFont(new Font("LingWai TC", Font.PLAIN, 99));
		l2.setBounds(6, 130, 988, 126);
		f.getContentPane().add(l2);

		JLabel l3 = new JLabel("3조 0차 프로젝트 : 북흐북흐");
		l3.setBounds(529, 240, 152, 16);
		f.getContentPane().add(l3);

		f.setVisible(true);
	}

}
