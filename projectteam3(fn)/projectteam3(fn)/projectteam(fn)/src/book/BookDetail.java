package book;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import pay.PayOrder;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class BookDetail {

//	******** 크게 수정한 부분 ********
//	클래스명 수정 BookDetail.java
//	BookDetail 호출 메서드 = detail (main에서 memid 갖고오기)
//	mac에서 버튼 색상 변경은 코드를 추가해줘야 해서 버튼 background color 전부 삭제
//	(버튼 컬러 바꿔서 UI 못생겨져도 이해해주세요)
//	좌측 사진 파일명 db에서 가져와서 출력
//	판매량은 출력할 이유가 없기 때문에 판매량 라벨들 삭제
	
	/**
	 * @wbp.parser.entryPoint
	 */
	public void detail(String[] book, String memid) throws Exception {

		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("Dialog", Font.BOLD, 30));
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);

		JLabel l2 = new JLabel("No." + book[0]);
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l2.setBounds(64, 39, 225, 35);
		f.getContentPane().add(l2);

		JLabel l1 = new JLabel();
		ImageIcon img = new ImageIcon(book[6]);
		l1.setIcon(img);
		l1.setFont(new Font("굴림", Font.BOLD, 35));
		l1.setBackground(Color.DARK_GRAY);
		l1.setBounds(64, 84, 340, 500);
		f.getContentPane().add(l1);

		JLabel l3 = new JLabel("도서명:");
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l3.setBounds(459, 115, 259, 45);
		f.getContentPane().add(l3);

		JLabel l4 = new JLabel(book[1]);
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l4.setBounds(596, 115, 283, 45);
		f.getContentPane().add(l4);

		JLabel l8 = new JLabel("지은이:");
		l8.setForeground(Color.WHITE);
		l8.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l8.setBounds(459, 190, 127, 45);
		f.getContentPane().add(l8);

		JLabel l5 = new JLabel(book[2]);
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l5.setBounds(596, 190, 283, 45);
		f.getContentPane().add(l5);

		JLabel l9 = new JLabel("장르:");
		l9.setForeground(Color.WHITE);
		l9.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l9.setBounds(459, 262, 127, 45);
		f.getContentPane().add(l9);

		JLabel l6 = new JLabel(book[3]);
		l6.setForeground(Color.WHITE);
		l6.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l6.setBounds(596, 262, 283, 45);
		f.getContentPane().add(l6);

		JLabel l10 = new JLabel("가격:");
		l10.setForeground(Color.WHITE);
		l10.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l10.setBounds(459, 387, 127, 45);
		f.getContentPane().add(l10);

		JLabel l7 = new JLabel(book[4]+ "원");
		l7.setForeground(Color.WHITE);
		l7.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l7.setBounds(596, 387, 167, 45);
		f.getContentPane().add(l7);

		JButton b1 = new JButton("구매하기");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PayOrder pay = new PayOrder();
				try {
					pay.pay1(memid, book[0]);
					f.dispose();
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		b1.setFont(new Font("굴림", Font.BOLD, 25));
		b1.setBounds(426, 604, 195, 86);
		f.getContentPane().add(b1);

		JButton b2 = new JButton("취소");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});

		b2.setFont(new Font("굴림", Font.BOLD, 25));
		b2.setBounds(703, 604, 195, 86);
		f.getContentPane().add(b2);

		f.setVisible(true);

	}
}
