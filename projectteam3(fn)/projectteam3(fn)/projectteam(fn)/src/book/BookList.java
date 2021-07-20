package book;

import javax.swing.JFrame;
import java.awt.Color;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.net.URL;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

import member.MemberPage;
import search.SearchBook;

public class BookList {

//	******** 크게 수정한 부분 ********
//	클래스명 수정 BookList.java
//	BookList 호출 메서드 = open (main에서 memid 갖고오기)
//	로그인한 후 BookList에 들어오므로 화면 상단에 로그인 관련 텍스트필드, 버튼 삭제
//	Main에서 받아온 memid를 이어 받아서 환영 메시지 라벨에 출력
//	mac에서 버튼 색상 변경은 코드를 추가해줘야 해서 버튼 background color 전부 삭제
//	(버튼 컬러 바꿔서 UI 못생겨져도 이해해주세요)
//	상세 페이지로 들어가는 버튼들 이미지를 database에서 추출
//	책 제목이 잘려서 책 제목 라벨들 폰트 크기 축소
//	이 페이지가 실질적인 main 역할을 하기 때문에 창을 닫으면 프로그램 종료하게끔 코드 추가

	/**
	 * @wbp.parser.entryPoint
	 */

	public void open(String memid) throws Exception {
		BookDAO db = new BookDAO();
		ArrayList<String[]> list = db.readBook();
		String[] s0 = list.get(0); // id: s0[0], name: s0[1]
		String[] s1 = list.get(1);
		String[] s2 = list.get(2);
		String[] s3 = list.get(3);
		String[] s4 = list.get(4);
		String[] s5 = list.get(5);
		String[] s6 = list.get(6);
		String[] s7 = list.get(7);
		String[] s8 = list.get(8);
		String[] s9 = list.get(9);

		JFrame f = new JFrame();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setForeground(Color.WHITE);
		f.getContentPane().setFont(new Font("Dialog", Font.BOLD, 15));
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("No." + s0[0]);
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l1.setBounds(82, 61, 46, 41);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel(s0[1]);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l2.setBounds(82, 352, 157, 41);
		f.getContentPane().add(l2);

		JLabel l3 = new JLabel("No." + s1[0]);
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l3.setBounds(251, 61, 46, 41);
		f.getContentPane().add(l3);

		JLabel l4 = new JLabel(s1[1]);
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l4.setBounds(251, 352, 157, 41);
		f.getContentPane().add(l4);

		JLabel l5 = new JLabel("No." + s2[0]);
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l5.setBounds(418, 61, 46, 41);
		f.getContentPane().add(l5);

		JLabel l6 = new JLabel(s2[1]);
		l6.setForeground(Color.WHITE);
		l6.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l6.setBounds(418, 352, 157, 41);
		f.getContentPane().add(l6);

		JLabel l7 = new JLabel("No." + s3[0]);
		l7.setForeground(Color.WHITE);
		l7.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l7.setBounds(587, 61, 46, 41);
		f.getContentPane().add(l7);

		JLabel l8 = new JLabel(s3[1]);
		l8.setForeground(Color.WHITE);
		l8.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l8.setBounds(587, 352, 157, 41);
		f.getContentPane().add(l8);

		JLabel l9 = new JLabel("No." + s4[0]);
		l9.setForeground(Color.WHITE);
		l9.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l9.setBounds(756, 61, 46, 41);
		f.getContentPane().add(l9);

		JLabel l10 = new JLabel(s4[1]);
		l10.setForeground(Color.WHITE);
		l10.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l10.setBounds(756, 352, 157, 41);
		f.getContentPane().add(l10);

		JLabel l11 = new JLabel("No." + s5[0]);
		l11.setForeground(Color.WHITE);
		l11.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l11.setBounds(82, 403, 46, 41);
		f.getContentPane().add(l11);

		JLabel l12 = new JLabel(s5[1]);
		l12.setForeground(Color.WHITE);
		l12.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l12.setBounds(82, 694, 157, 41);
		f.getContentPane().add(l12);

		JLabel l13 = new JLabel(s6[1]);
		l13.setForeground(Color.WHITE);
		l13.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l13.setBounds(251, 694, 157, 41);
		f.getContentPane().add(l13);

		JLabel l14 = new JLabel("No." + s6[0]);
		l14.setForeground(Color.WHITE);
		l14.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l14.setBounds(251, 403, 46, 41);
		f.getContentPane().add(l14);

		JLabel l15 = new JLabel("No." + s7[0]);
		l15.setForeground(Color.WHITE);
		l15.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l15.setBackground(Color.WHITE);
		l15.setBounds(418, 403, 46, 41);
		f.getContentPane().add(l15);

		JLabel l16 = new JLabel(s7[1]);
		l16.setForeground(Color.WHITE);
		l16.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l16.setBackground(Color.WHITE);
		l16.setBounds(418, 694, 157, 41);
		f.getContentPane().add(l16);

		JLabel l17 = new JLabel(s8[1]);
		l17.setForeground(Color.WHITE);
		l17.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l17.setBackground(Color.WHITE);
		l17.setBounds(587, 694, 157, 41);
		f.getContentPane().add(l17);

		JLabel l18 = new JLabel("No." + s8[0]);
		l18.setForeground(Color.WHITE);
		l18.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l18.setBackground(Color.WHITE);
		l18.setBounds(587, 403, 46, 41);
		f.getContentPane().add(l18);

		JLabel l19 = new JLabel("No." + s9[0]);
		l19.setForeground(Color.WHITE);
		l19.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l19.setBackground(Color.WHITE);
		l19.setBounds(756, 403, 46, 41);
		f.getContentPane().add(l19);

		JLabel l20 = new JLabel(s9[1]);
		l20.setForeground(Color.WHITE);
		l20.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 15));
		l20.setBackground(Color.WHITE);
		l20.setBounds(756, 694, 157, 41);
		f.getContentPane().add(l20);

		JButton b1 = new JButton("등록");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookAdd w1 = new BookAdd();
				w1.add();
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 15));
		b1.setBounds(11, 8, 117, 41);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("정보수정");
		b2.setFont(new Font("굴림", Font.BOLD, 15));
		b2.setBounds(731, 8, 117, 41);
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				MemberPage memberPage = new MemberPage();
				memberPage.myPage(memid);
			}
		});
		f.getContentPane().add(b2);

		JButton b3 = new JButton("검색하기");
		b3.setFont(new Font("굴림", Font.BOLD, 15));
		b3.setBounds(858, 8, 117, 41);
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SearchBook searchBook = new SearchBook();
				try {
					searchBook.search();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		f.getContentPane().add(b3);

		JButton b4 = new JButton();
		ImageIcon img = new ImageIcon(s0[6]);
		b4.setIcon(img);
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetail a1 = new BookDetail();
				try {
					a1.detail(s0, memid);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		b4.setBounds(82, 103, 157, 249);
		f.getContentPane().add(b4);

		JButton b5 = new JButton();
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetail a1 = new BookDetail();
				try {
					a1.detail(s1, memid);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		ImageIcon img2 = new ImageIcon(s1[6]);
		b5.setIcon(img2);
		b5.setBounds(251, 103, 157, 249);
		f.getContentPane().add(b5);

		JButton b6 = new JButton();
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetail a1 = new BookDetail();
				try {
					a1.detail(s2, memid);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		ImageIcon img3 = new ImageIcon(s2[6]);
		b6.setIcon(img3);
		b6.setBounds(418, 103, 157, 249);
		f.getContentPane().add(b6);

		JButton b7 = new JButton();
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetail a1 = new BookDetail();
				try {
					a1.detail(s3, memid);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		ImageIcon img4 = new ImageIcon(s3[6]);
		b7.setIcon(img4);
		b7.setBounds(587, 103, 157, 249);
		f.getContentPane().add(b7);

		JButton b8 = new JButton();
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				BookDetail a1 = new BookDetail();
				try {
					a1.detail(s4, memid);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		ImageIcon img5 = new ImageIcon(s4[6]);
		b8.setIcon(img5);
		b8.setBounds(756, 103, 157, 249);
		f.getContentPane().add(b8);

		JButton b9 = new JButton();
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				BookDetail a1 = new BookDetail();
				try {
					a1.detail(s5, memid);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		ImageIcon img6 = new ImageIcon(s5[6]);
		b9.setIcon(img6);
		b9.setBounds(82, 446, 157, 249);
		f.getContentPane().add(b9);

		JButton b10 = new JButton();
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetail a1 = new BookDetail();
				try {
					a1.detail(s6, memid);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		ImageIcon img7 = new ImageIcon(s6[6]);
		b10.setIcon(img7);
		b10.setBounds(251, 445, 157, 249);
		f.getContentPane().add(b10);

		JButton b11 = new JButton();
		b11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetail a1 = new BookDetail();
				try {
					a1.detail(s7, memid);
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		ImageIcon img8 = new ImageIcon(s7[6]);
		b11.setIcon(img8);
		b11.setBounds(417, 446, 157, 249);
		f.getContentPane().add(b11);

		JButton b12 = new JButton();
		b12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				BookDetail a1 = new BookDetail();
				try {
					a1.detail(s8, memid);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		ImageIcon img9 = new ImageIcon(s8[6]);
		b12.setIcon(img9);
		b12.setBounds(586, 448, 157, 249);
		f.getContentPane().add(b12);

		JButton b13 = new JButton();
		b13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				BookDetail a1 = new BookDetail();
				try {
					a1.detail(s9, memid);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		ImageIcon img10 = new ImageIcon(s9[6]);
		b13.setIcon(img10);
		b13.setBounds(756, 446, 157, 249);
		f.getContentPane().add(b13);

		JLabel l21 = new JLabel(memid + "님, 환영합니다!");
		l21.setForeground(Color.WHITE);
		l21.setHorizontalAlignment(SwingConstants.RIGHT);
		l21.setFont(new Font("Dialog", Font.PLAIN, 15));
		l21.setBounds(415, 22, 304, 16);
		f.getContentPane().add(l21);

		f.setVisible(true);
	}
}
