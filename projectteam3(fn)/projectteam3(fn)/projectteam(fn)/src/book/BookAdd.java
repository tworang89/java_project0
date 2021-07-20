package book;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import pay.PayDAO;

public class BookAdd {
	private static JTextField t2;
	private static JTextField t3;
	private static JTextField t4;
	private static JTextField t5;

//	******** 크게 수정한 부분 ********
//	클래스명 수정 BookAdd
//	BookAdd 호출 메서드 = add
//	mac에서 버튼 색상 변경은 코드를 추가해줘야 해서 버튼 background color 전부 삭제
//	(버튼 컬러 바꿔서 UI 못생겨져도 이해해주세요)
//	판매량은 책 등록시 넣어줄 필요가 없어서 판매량 라벨/텍스트필드 삭제
//	(판매량은 책 등록시 0으로 값이 들어갑니다)
//	(판매량은 주문 완료하면 해당 bookid의 sold를 구매한 수량만큼 더해집니다)
//	칸이 비어있을 경우 넘어가지 못하게 경고 메시지 출력
//	그 외 라벨/텍스트필드들 위치 조정

	/**
	 * @wbp.parser.entryPoint
	 */
	public void add() {
		JFrame f = new JFrame();
		f.getContentPane().setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);

		JLabel l1 = new JLabel("도서No");
		l1.setForeground(Color.WHITE);
		l1.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l1.setBounds(46, 10, 113, 53);
		f.getContentPane().add(l1);

		JLabel l2 = new JLabel("제목");
		l2.setForeground(Color.WHITE);
		l2.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l2.setBounds(436, 54, 131, 53);
		f.getContentPane().add(l2);

		JLabel l3 = new JLabel("지은이");
		l3.setForeground(Color.WHITE);
		l3.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l3.setBounds(436, 183, 145, 53);
		f.getContentPane().add(l3);

		JLabel l4 = new JLabel("장르");
		l4.setForeground(Color.WHITE);
		l4.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l4.setBounds(436, 335, 105, 47);
		f.getContentPane().add(l4);

		JLabel l5 = new JLabel("가격");
		l5.setForeground(Color.WHITE);
		l5.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 30));
		l5.setBounds(436, 467, 133, 53);
		f.getContentPane().add(l5);

		t2 = new JTextField();
		t2.setColumns(10);
		t2.setBounds(579, 54, 343, 53);
		f.getContentPane().add(t2);

		t3 = new JTextField();
		t3.setColumns(10);
		t3.setBounds(579, 183, 343, 53);
		f.getContentPane().add(t3);

		t4 = new JTextField();
		t4.setColumns(10);
		t4.setBounds(579, 329, 343, 53);
		f.getContentPane().add(t4);

		t5 = new JTextField();
		t5.setColumns(10);
		t5.setBounds(581, 467, 343, 53);
		f.getContentPane().add(t5);

		JButton b1 = new JButton("등록");
		b1.setFont(new Font("굴림", Font.BOLD, 35));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookname = t2.getText();
				String writer = t3.getText();
				String genre = t4.getText();
				String price = t5.getText();
				BookDAO db = new BookDAO();
				if (bookname.length() != 0 && writer.length() != 0 && genre.length() != 0 && price.length() != 0) {
					try {
						db.create(bookname, writer, genre, price);
						JOptionPane.showMessageDialog(f, "등록되었습니다.");
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					t2.setText("");
					t3.setText("");
					t4.setText("");
					t5.setText("");
				} else {
					JOptionPane.showMessageDialog(f, "빈칸이 존재합니다.");
				}
			}
		});
		b1.setBounds(46, 602, 280, 94);
		f.getContentPane().add(b1);

		JButton b3 = new JButton("메인으로");
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose();
			}
		});
		b3.setFont(new Font("굴림", Font.BOLD, 35));
		b3.setBounds(653, 602, 280, 94);
		f.getContentPane().add(b3);

		JButton b2 = new JButton("삭제");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bookid = JOptionPane.showInputDialog(f, "삭제 할 도서No 입력");
				BookDAO db = new BookDAO();
				PayDAO db2 = new PayDAO();
				try {
					int result2 = db2.deletePayB(bookid);
					int result = db.delete(bookid);// 1
					if (result == 1) {
						JOptionPane.showMessageDialog(f, "삭제되었습니다.");
					} else {
						JOptionPane.showMessageDialog(f, "없는 도서No 입니다.");
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}

			}
		});
		b2.setFont(new Font("굴림", Font.BOLD, 35));
		b2.setBounds(350, 602, 280, 94);
		f.getContentPane().add(b2);

		JButton b4 = new JButton();
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		ImageIcon img1 = new ImageIcon("inputimage.png");
		b4.setIcon(img1);
		b4.setFont(new Font("굴림", Font.BOLD, 25));
		b4.setBounds(36, 60, 350, 350);
		f.getContentPane().add(b4);
		f.setVisible(true);

	}
}
