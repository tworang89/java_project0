package pay;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import javax.jws.Oneway;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PayOrder {


	
	private static JTextField txtQty;
	private static JTextField txt1;
	private static JTextField txt2;
	private static JTextField txt3;
	private static JTextField txt4;
	private static JTextField txt5;
	private static JTextField txt6;
	private static JTextField txt7;
	private static JTextField txt8;

	/**
	 * @wbp.parser.entryPoint
	 */
	
	public void pay1(String memid, String bookid) throws Exception {

		PayDAO db = new PayDAO();
		ArrayList listMem = db.readMem(memid);
		ArrayList listBook = db.readBook(bookid);
		String img = String.valueOf(listBook.get(4));

		JFrame f = new JFrame("주문 페이지");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.setSize(1000, 800);
		f.getContentPane().setLayout(null);

		JLabel lbl1 = new JLabel("주문 확인");
		lbl1.setForeground(Color.WHITE);
		lbl1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lbl1.setBounds(39, 20, 127, 36);
		f.getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("상품명", SwingConstants.CENTER);
		lbl2.setBackground(Color.GRAY);
		lbl2.setOpaque(true);
		lbl2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl2.setBounds(39, 68, 569, 36);
		f.getContentPane().add(lbl2);

		JLabel lbl3 = new JLabel("가격", SwingConstants.CENTER);
		lbl3.setOpaque(true);
		lbl3.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl3.setBackground(Color.GRAY);
		lbl3.setBounds(620, 68, 117, 36);
		f.getContentPane().add(lbl3);

		JLabel lbl4 = new JLabel("수량", SwingConstants.CENTER);
		lbl4.setOpaque(true);
		lbl4.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl4.setBackground(Color.GRAY);
		lbl4.setBounds(749, 68, 86, 36);
		f.getContentPane().add(lbl4);

		JLabel lbl5 = new JLabel("합계", SwingConstants.CENTER);
		lbl5.setOpaque(true);
		lbl5.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl5.setBackground(Color.GRAY);
		lbl5.setBounds(847, 68, 117, 36);
		f.getContentPane().add(lbl5);

		// 이미지 사이즈 바꾸기
		ImageIcon dbImage = new ImageIcon(img);
		Image img2 = dbImage.getImage();
		Image img3 = img2.getScaledInstance(100, 160, Image.SCALE_SMOOTH);
		ImageIcon bookimg = new ImageIcon(img3);
		JLabel lblBookImg = new JLabel("");
		lblBookImg.setBounds(49, 116, 100, 160);
		lblBookImg.setIcon(bookimg);
		lblBookImg.setBackground(Color.gray);
		lblBookImg.setOpaque(true);
		f.getContentPane().add(lblBookImg);

		JLabel lblBookName = new JLabel("제목: " + listBook.get(0));
		lblBookName.setForeground(Color.WHITE);
		lblBookName.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblBookName.setBounds(161, 116, 447, 36);
		f.getContentPane().add(lblBookName);

		JLabel lblBookWriter = new JLabel("저자: " + listBook.get(1));
		lblBookWriter.setForeground(Color.WHITE);
		lblBookWriter.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblBookWriter.setBounds(161, 151, 447, 28);
		f.getContentPane().add(lblBookWriter);

		JLabel lblBookGenre = new JLabel("장르: " + listBook.get(2));
		lblBookGenre.setForeground(Color.WHITE);
		lblBookGenre.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblBookGenre.setBounds(161, 179, 447, 28);
		f.getContentPane().add(lblBookGenre);

		JLabel lblBookPrice = new JLabel(listBook.get(3) + "원", SwingConstants.CENTER);
		lblBookPrice.setForeground(Color.WHITE);
		lblBookPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblBookPrice.setBounds(643, 179, 75, 28);
		f.getContentPane().add(lblBookPrice);

		txtQty = new JTextField();
		txtQty.setHorizontalAlignment(SwingConstants.CENTER);
		txtQty.setText("1");
		txtQty.setBounds(749, 181, 86, 26);
		f.getContentPane().add(txtQty);
		txtQty.setColumns(10);

		JLabel lblQtyPrice1 = new JLabel(listBook.get(3) + "원", SwingConstants.CENTER);
		lblQtyPrice1.setForeground(Color.WHITE);
		lblQtyPrice1.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblQtyPrice1.setBounds(861, 159, 100, 69);
		f.getContentPane().add(lblQtyPrice1);

		JLabel lbl6 = new JLabel("배송예정일", SwingConstants.CENTER);
		lbl6.setOpaque(true);
		lbl6.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl6.setBackground(Color.GRAY);
		lbl6.setBounds(39, 288, 197, 52);
		f.getContentPane().add(lbl6);

		String today = null;
		Date date = new Date();
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy년 MM월 dd일");
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, +3);
		today = sdformat.format(cal.getTime());

		JLabel lblShipDate = new JLabel(today);
		lblShipDate.setForeground(Color.WHITE);
		lblShipDate.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblShipDate.setBounds(265, 296, 211, 36);
		f.getContentPane().add(lblShipDate);

		JLabel lbl7 = new JLabel("총 상품 금액", SwingConstants.CENTER);
		lbl7.setOpaque(true);
		lbl7.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl7.setBackground(Color.GRAY);
		lbl7.setBounds(39, 352, 197, 52);
		f.getContentPane().add(lbl7);

		JLabel lbl8 = new JLabel("+", SwingConstants.CENTER);
		lbl8.setBackground(Color.DARK_GRAY);
		lbl8.setOpaque(true);
		lbl8.setForeground(Color.WHITE);
		lbl8.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lbl8.setBounds(279, 382, 34, 35);
		f.getContentPane().add(lbl8);

		JLabel lbl9 = new JLabel("배송비", SwingConstants.CENTER);
		lbl9.setOpaque(true);
		lbl9.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl9.setBackground(Color.GRAY);
		lbl9.setBounds(366, 352, 197, 52);
		f.getContentPane().add(lbl9);

		JLabel lbl10 = new JLabel("=", SwingConstants.CENTER);
		lbl10.setBackground(Color.DARK_GRAY);
		lbl10.setOpaque(true);
		lbl10.setForeground(Color.WHITE);
		lbl10.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lbl10.setBounds(605, 382, 34, 35);
		f.getContentPane().add(lbl10);

		JLabel lbl11 = new JLabel("최종 결제 금액", SwingConstants.CENTER);
		lbl11.setOpaque(true);
		lbl11.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl11.setBackground(Color.GRAY);
		lbl11.setBounds(691, 352, 273, 52);
		f.getContentPane().add(lbl11);

		JLabel lblQtyPrice2 = new JLabel(lblQtyPrice1.getText(), SwingConstants.CENTER);
		lblQtyPrice2.setForeground(Color.WHITE);
		lblQtyPrice2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblQtyPrice2.setBounds(39, 406, 197, 36);
		f.getContentPane().add(lblQtyPrice2);

		JLabel lbl12 = new JLabel("3000");
		lbl12.setForeground(Color.WHITE);
		lbl12.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl12.setBounds(441, 406, 86, 36);
		f.getContentPane().add(lbl12);

		final int PRICE = Integer.parseInt(String.valueOf(listBook.get(3)));
		int amount = PRICE + 3000;
		JLabel lblTotal = new JLabel(String.valueOf(amount) + "원", SwingConstants.CENTER);
		lblTotal.setForeground(Color.WHITE);
		lblTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblTotal.setBounds(691, 406, 273, 36);
		f.getContentPane().add(lblTotal);

		JLabel lbl13 = new JLabel("배송지", SwingConstants.CENTER);
		lbl13.setOpaque(true);
		lbl13.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl13.setBackground(Color.GRAY);
		lbl13.setBounds(691, 454, 273, 52);
		f.getContentPane().add(lbl13);

		JLabel lbl14 = new JLabel("이름");
		lbl14.setForeground(Color.WHITE);
		lbl14.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl14.setBounds(691, 518, 86, 36);
		f.getContentPane().add(lbl14);

		JLabel lbl15 = new JLabel("전화번호");
		lbl15.setForeground(Color.WHITE);
		lbl15.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl15.setBounds(691, 555, 86, 36);
		f.getContentPane().add(lbl15);

		JLabel lbl16 = new JLabel("주소");
		lbl16.setForeground(Color.WHITE);
		lbl16.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl16.setBounds(691, 593, 86, 36);
		f.getContentPane().add(lbl16);

		JLabel lblMemName = new JLabel(String.valueOf(listMem.get(0)));
		lblMemName.setForeground(Color.WHITE);
		lblMemName.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMemName.setBounds(789, 518, 148, 36);
		f.getContentPane().add(lblMemName);

		JLabel lblMemAddr = new JLabel(String.valueOf(listMem.get(1)));
		lblMemAddr.setForeground(Color.WHITE);
		lblMemAddr.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMemAddr.setBounds(789, 555, 142, 36);
		f.getContentPane().add(lblMemAddr);

		JLabel lblMemTel = new JLabel(String.valueOf(listMem.get(2)));
		lblMemTel.setForeground(Color.WHITE);
		lblMemTel.setFont(new Font("Lucida Grande", Font.PLAIN, 15));
		lblMemTel.setBounds(789, 593, 148, 36);
		f.getContentPane().add(lblMemTel);

		JLabel lbl17 = new JLabel("카드 결제", SwingConstants.CENTER);
		lbl17.setOpaque(true);
		lbl17.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl17.setBackground(Color.GRAY);
		lbl17.setBounds(40, 454, 553, 52);
		f.getContentPane().add(lbl17);

		JLabel lbl18 = new JLabel("카드사");
		lbl18.setForeground(Color.WHITE);
		lbl18.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl18.setBounds(40, 518, 57, 36);
		f.getContentPane().add(lbl18);

		JRadioButton rdbtn1 = new JRadioButton("A카드사");
		rdbtn1.setForeground(Color.WHITE);
		rdbtn1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtn1.setBounds(161, 524, 97, 23);
		rdbtn1.setSelected(true);
		f.getContentPane().add(rdbtn1);

		JRadioButton rdbtn2 = new JRadioButton("B카드사");
		rdbtn2.setForeground(Color.WHITE);
		rdbtn2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtn2.setBounds(270, 524, 97, 23);
		f.getContentPane().add(rdbtn2);

		JRadioButton rdbtn3 = new JRadioButton("C카드사");
		rdbtn3.setForeground(Color.WHITE);
		rdbtn3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtn3.setBounds(379, 524, 97, 23);
		f.getContentPane().add(rdbtn3);

		JRadioButton rdbtn4 = new JRadioButton("D카드사");
		rdbtn4.setForeground(Color.WHITE);
		rdbtn4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		rdbtn4.setBounds(488, 524, 105, 23);
		f.getContentPane().add(rdbtn4);

		ButtonGroup btngroup = new ButtonGroup();
		btngroup.add(rdbtn1);
		btngroup.add(rdbtn2);
		btngroup.add(rdbtn3);
		btngroup.add(rdbtn4);

		JLabel lbl19 = new JLabel("카드 번호");
		lbl19.setForeground(Color.WHITE);
		lbl19.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl19.setBounds(40, 566, 86, 36);
		f.getContentPane().add(lbl19);

		txt1 = new JTextField();
		txt1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txt1.setColumns(10);
		txt1.setBounds(161, 574, 89, 26);
		f.getContentPane().add(txt1);

		JLabel lbl20 = new JLabel("-", SwingConstants.CENTER);
		lbl20.setForeground(Color.WHITE);
		lbl20.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lbl20.setBounds(249, 572, 23, 24);
		f.getContentPane().add(lbl20);

		txt2 = new JTextField();
		txt2.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txt2.setColumns(10);
		txt2.setBounds(275, 574, 89, 26);
		f.getContentPane().add(txt2);

		JLabel lbl21 = new JLabel("-", SwingConstants.CENTER);
		lbl21.setForeground(Color.WHITE);
		lbl21.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lbl21.setBounds(363, 572, 23, 24);
		f.getContentPane().add(lbl21);

		txt3 = new JTextField();
		txt3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txt3.setColumns(10);
		txt3.setBounds(387, 574, 89, 26);
		f.getContentPane().add(txt3);

		JLabel lbl22 = new JLabel("-", SwingConstants.CENTER);
		lbl22.setForeground(Color.WHITE);
		lbl22.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lbl22.setBounds(475, 572, 23, 24);
		f.getContentPane().add(lbl22);

		txt4 = new JTextField();
		txt4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txt4.setColumns(10);
		txt4.setBounds(501, 574, 89, 26);
		f.getContentPane().add(txt4);

		JLabel lbl23 = new JLabel("이름");
		lbl23.setForeground(Color.WHITE);
		lbl23.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl23.setBounds(40, 603, 86, 36);
		f.getContentPane().add(lbl23);

		txt5 = new JTextField();
		txt5.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txt5.setBounds(161, 608, 139, 26);
		f.getContentPane().add(txt5);
		txt5.setColumns(10);

		JLabel lbl24 = new JLabel("카드 만료일");
		lbl24.setForeground(Color.WHITE);
		lbl24.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl24.setBounds(39, 641, 97, 36);
		f.getContentPane().add(lbl24);

		txt6 = new JTextField();
		txt6.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txt6.setColumns(10);
		txt6.setBounds(161, 646, 46, 26);
		f.getContentPane().add(txt6);

		JLabel lbl25 = new JLabel("/", SwingConstants.CENTER);
		lbl25.setForeground(Color.WHITE);
		lbl25.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lbl25.setBounds(209, 646, 23, 24);
		f.getContentPane().add(lbl25);

		txt7 = new JTextField();
		txt7.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txt7.setColumns(10);
		txt7.setBounds(236, 646, 46, 26);
		f.getContentPane().add(txt7);

		JLabel lbl26 = new JLabel("CVC");
		lbl26.setForeground(Color.WHITE);
		lbl26.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl26.setBounds(40, 679, 86, 36);
		f.getContentPane().add(lbl26);

		txt8 = new JTextField();
		txt8.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		txt8.setColumns(10);
		txt8.setBounds(161, 684, 71, 26);
		f.getContentPane().add(txt8);

		JButton btn1 = new JButton("▲");
		btn1.addActionListener(new ActionListener() { // ▲ 버튼 누르면
			public void actionPerformed(ActionEvent e) {
				int qtyPlus = Integer.parseInt(txtQty.getText()) + 1; // txtfield에 적힌 수량 + 1 증가
				txtQty.setText(String.valueOf(qtyPlus)); // +1된 수량 다시 txtfield에 출력
				int total = PRICE * Integer.parseInt(txtQty.getText()); // 가격 * 수량 계산
				int amount = total + 3000; // 총 상품 금액 + 배송비
				lblQtyPrice1.setText(String.valueOf(total) + "원"); // 합계 label에 출력
				lblQtyPrice2.setText(String.valueOf(total) + "원"); // 총 상품금액 label에 출력
				lblTotal.setText(amount + "원"); // 최종 결제 금액 label에 출력
			}
		});
		btn1.setBounds(749, 140, 86, 29);
		f.getContentPane().add(btn1);

		JButton btn2 = new JButton("▼");
		btn2.addActionListener(new ActionListener() { // ▼ 버튼 누르면
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(txtQty.getText()) > 1) { // 구매 수량이 0이 안 되게 1이상으로 조건
					int qtyMinus = Integer.parseInt(txtQty.getText()) - 1; // txtfield에 적힌 수량 -1 감소
					txtQty.setText(String.valueOf(qtyMinus)); // -1된 수량 다시 txtfield에 출력
					int total = PRICE * Integer.parseInt(txtQty.getText()); // 가격 * 수량 계산
					int amount = total + 3000; // 총 상품 금액 + 배송비
					lblQtyPrice1.setText(String.valueOf(total) + "원"); // 합계 label에 출력
					lblQtyPrice2.setText(String.valueOf(total) + "원"); // 총 상품금액 label에 출력
					lblTotal.setText(amount + "원"); // 최종 결제 금액 label에 출력
				}
			}
		});
		btn2.setBounds(749, 219, 86, 29);
		f.getContentPane().add(btn2);

		JButton btn3 = new JButton("취소");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose(); // 버튼 누르면 창 닫기
			}
		});
		btn3.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btn3.setBounds(718, 699, 117, 52);
		f.getContentPane().add(btn3);

		JButton btn4 = new JButton("결제하기");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// 카드번호 숫자 갯수 측정용
				int cardCount = txt1.getText().length() + txt2.getText().length() + txt3.getText().length() + txt4.getText().length();
				if (cardCount == 16 && !txt5.getText().equals("") && txt6.getText().length() == 2
						&& txt7.getText().length() == 2 && txt8.getText().length() == 3) { // 카드 정보 입력 조건들

					// 아래는 db 관련
					int qty = Integer.parseInt(txtQty.getText()); // 구매수량 txtfield에서 추출
					PayDAO payDB = new PayDAO(); // db 클래스 복사
					try {
						int result = payDB.create(memid, bookid, qty); // payDAO - create 메서드 호출 (주문기록)
						int result2 = payDB.update(bookid, qty); // book테이블 - update 메서드 호출 (판매량)
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} // try-catch
					PayConfirm pay2 = new PayConfirm();
					try {
						pay2.pay2(memid, String.valueOf(bookid));
					} catch (Exception e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					f.dispose();
				} else { // 카드 정보 입력조건 중 하나라도 틀리면
					JOptionPane.showMessageDialog(f, "입력하신 카드 정보가 틀렸습니다. 다시 확인해주세요.");
				} // cardCount
			} // actionPerformed
		}); // actionListener
		btn4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btn4.setBounds(847, 699, 117, 52);
		f.getContentPane().add(btn4);

		f.setVisible(true);

	}
}
