package member;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Color;

public class MemberJoin {
	private static JTextField t1;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;
	private static JTextField t6;
	private static JTextField t2;

//	******** 크게 수정한 부분 ********
//	클래스명 수정 MemberJoin.java
//	MemberJoin 호출 메서드 = join
//	컬러 코드 (Background: DARK_GRAY, 폰트 Foreground: WHITE)
//	칸이 비어있을 경우 넘어가지 못하게 경고 메시지 출력
//	회원가입 성공시 창 닫히게끔 코드 추가
//  창크기 540,500으로 변경
//  아이디 중복확인 버튼 추가	

	/**
	 * @wbp.parser.entryPoint
	 */
	public void join() {
		JFrame f = new JFrame();
		f.setSize(540, 500);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("아이디");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel.setBounds(42, 34, 91, 34);
		f.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("비밀번호 확인");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_1.setBounds(42, 147, 144, 34);
		f.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("이름");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_1_1.setBounds(42, 205, 91, 34);
		f.getContentPane().add(lblNewLabel_1_1);

		JLabel lblNewLabel_1_1_1 = new JLabel("전화번호");
		lblNewLabel_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_1_1_1.setBounds(42, 258, 91, 34);
		f.getContentPane().add(lblNewLabel_1_1_1);

		JLabel lblNewLabel_1_1_1_1 = new JLabel("주소");
		lblNewLabel_1_1_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1_1_1.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_1_1_1_1.setBounds(42, 310, 91, 34);
		f.getContentPane().add(lblNewLabel_1_1_1_1);

		JLabel lblNewLabel_2 = new JLabel("비밀번호");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Lucida Grande", Font.PLAIN, 24));
		lblNewLabel_2.setBounds(42, 93, 91, 34);
		f.getContentPane().add(lblNewLabel_2);

		t1 = new JTextField();
		t1.setBounds(198, 34, 244, 34);
		f.getContentPane().add(t1);
		t1.setColumns(10);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(198, 93, 244, 34);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(198, 151, 244, 34);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(198, 205, 244, 34);
		f.getContentPane().add(t4);

		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(198, 258, 244, 34);
		f.getContentPane().add(t5);

		JButton b1 = new JButton("회원가입");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String memid = t1.getText();
				String pw = t2.getText();
				String pw2 = t3.getText();
				String name = t4.getText();
				String tel = t5.getText();
				String addr = t6.getText();
				if (memid.length() != 0 && name.length() != 0 && tel.length() != 0 && addr.length() != 0
						&& pw.length() != 0 && pw.equals(pw2)) {
					MemberDAO db = new MemberDAO();
					try {
						int result = db.create(memid, pw, name, tel, addr);
						if (result == 1) {
							JOptionPane.showMessageDialog(f, "회원가입 성공");
							f.dispose(); // 회원가입 성공시 창 닫기
						} else {
							JOptionPane.showMessageDialog(f, "회원가입 실패");
						}
					} catch (Exception e1) {
						e1.printStackTrace();
					}
				} else if (!pw.equals(pw2)) {
					JOptionPane.showMessageDialog(f, "비밀번호가 일치하지 않습니다.");
					t3.setText("");
				} else {
					JOptionPane.showMessageDialog(f, "빈칸이 존재합니다.");
				}
			}
		});

		t6 = new JTextField();
		t6.setColumns(10);
		t6.setBounds(198, 310, 244, 34);
		f.getContentPane().add(t6);
		b1.setBounds(65, 381, 155, 43);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("취소");
		b2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		b2.setBounds(298, 383, 144, 41);
		f.getContentPane().add(b2);

		JButton b3 = new JButton("중복확인");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String memid = t1.getText();
				MemberDAO db = new MemberDAO();

				if (!memid.equals(memid)) {
					JOptionPane.showMessageDialog(f, "사용가능한 아이디입니다.");
				} else {
					JOptionPane.showMessageDialog(f, "중복된 아이디입니다.");
				}
			}
		});
		b3.setBounds(442, 42, 80, 29);
		f.getContentPane().add(b3);

		f.setVisible(true);
	}
}
