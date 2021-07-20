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

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class PayConfirm {
	/**
	 * @wbp.parser.entryPoint
	 */
	public void pay2(String memid, String bookid) throws Exception {

		PayDAO db = new PayDAO();
		ArrayList listMem = db.readMem(memid);
		ArrayList listBook = db.readBook(bookid);
		ArrayList listPay = db.readPay();

		JFrame f = new JFrame("주문 완료");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(1000, 800);
		f.getContentPane().setBackground(Color.DARK_GRAY);
		f.getContentPane().setLayout(null);

		JLabel lbl1 = new JLabel("주문이 완료되었습니다!", SwingConstants.CENTER);
		lbl1.setForeground(Color.WHITE);
		lbl1.setFont(new Font("Lucida Grande", Font.BOLD, 25));
		lbl1.setBounds(40, 32, 925, 36);
		f.getContentPane().add(lbl1);

		JLabel lbl2 = new JLabel("배송지 정보", SwingConstants.CENTER);
		lbl2.setOpaque(true);
		lbl2.setForeground(Color.BLACK);
		lbl2.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl2.setBackground(Color.GRAY);
		lbl2.setBounds(40, 145, 197, 100);
		f.getContentPane().add(lbl2);

		JLabel lblMemName = new JLabel("이름: " + String.valueOf(listMem.get(0)));
		lblMemName.setForeground(Color.WHITE);
		lblMemName.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblMemName.setBounds(265, 145, 242, 36);
		f.getContentPane().add(lblMemName);

		JLabel lblMemAddr = new JLabel("연락처: " + String.valueOf(listMem.get(1)));
		lblMemAddr.setForeground(Color.WHITE);
		lblMemAddr.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblMemAddr.setBounds(265, 182, 219, 36);
		f.getContentPane().add(lblMemAddr);

		JLabel lblMemTel = new JLabel("주소: " + String.valueOf(listMem.get(2)));
		lblMemTel.setForeground(Color.WHITE);
		lblMemTel.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblMemTel.setBounds(265, 220, 219, 36);
		f.getContentPane().add(lblMemTel);

		JLabel lbl3 = new JLabel("배송예정일", SwingConstants.CENTER);
		lbl3.setOpaque(true);
		lbl3.setForeground(Color.BLACK);
		lbl3.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl3.setBackground(Color.GRAY);
		lbl3.setBounds(39, 275, 197, 52);
		f.getContentPane().add(lbl3);

		// 오늘 날짜 + 3일 출력용
		Date date = new Date();
		SimpleDateFormat sdformat = new SimpleDateFormat("yyyy년 MM월 dd일");
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		cal.add(Calendar.DATE, +3);
		String today = sdformat.format(cal.getTime());

		JLabel lbl4 = new JLabel(today);
		lbl4.setForeground(Color.WHITE);
		lbl4.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl4.setBounds(265, 283, 219, 36);
		f.getContentPane().add(lbl4);

		JLabel lbl5 = new JLabel("상품명", SwingConstants.CENTER);
		lbl5.setForeground(Color.BLACK);
		lbl5.setBackground(Color.GRAY);
		lbl5.setOpaque(true);
		lbl5.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl5.setBounds(39, 363, 569, 36);
		f.getContentPane().add(lbl5);

		JLabel lbl6 = new JLabel("가격", SwingConstants.CENTER);
		lbl6.setOpaque(true);
		lbl6.setForeground(Color.BLACK);
		lbl6.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl6.setBackground(Color.GRAY);
		lbl6.setBounds(620, 363, 117, 36);
		f.getContentPane().add(lbl6);

		JLabel lbl7 = new JLabel("수량", SwingConstants.CENTER);
		lbl7.setOpaque(true);
		lbl7.setForeground(Color.BLACK);
		lbl7.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl7.setBackground(Color.GRAY);
		lbl7.setBounds(749, 363, 86, 36);
		f.getContentPane().add(lbl7);

		JLabel lbl8 = new JLabel("합계", SwingConstants.CENTER);
		lbl8.setOpaque(true);
		lbl8.setForeground(Color.BLACK);
		lbl8.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl8.setBackground(Color.GRAY);
		lbl8.setBounds(847, 363, 117, 36);
		f.getContentPane().add(lbl8);

		ImageIcon dbImage = new ImageIcon(String.valueOf(listBook.get(4)));
		Image img = dbImage.getImage();
		Image img2 = img.getScaledInstance(100, 160, Image.SCALE_SMOOTH);
		ImageIcon bookimg = new ImageIcon(img2);
		JLabel lblBookImg = new JLabel("");
		lblBookImg.setBounds(49, 411, 100, 160);
		lblBookImg.setIcon(bookimg);
		lblBookImg.setBackground(Color.gray);
		lblBookImg.setOpaque(true);
		f.getContentPane().add(lblBookImg);

		JLabel lblBookName = new JLabel("제목: " + String.valueOf(listBook.get(0)));
		lblBookName.setForeground(Color.WHITE);
		lblBookName.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lblBookName.setBounds(161, 411, 447, 36);
		f.getContentPane().add(lblBookName);

		JLabel lblBookWriter = new JLabel("저자: " + String.valueOf(listBook.get(1)));
		lblBookWriter.setForeground(Color.WHITE);
		lblBookWriter.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblBookWriter.setBounds(161, 438, 447, 28);
		f.getContentPane().add(lblBookWriter);

		JLabel lblBookGenre = new JLabel("장르: " + String.valueOf(listBook.get(2)));
		lblBookGenre.setForeground(Color.WHITE);
		lblBookGenre.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblBookGenre.setBounds(161, 459, 447, 28);
		f.getContentPane().add(lblBookGenre);

		JLabel lblBookPrice = new JLabel(String.valueOf(listBook.get(3)) + "원", SwingConstants.CENTER);
		lblBookPrice.setForeground(Color.WHITE);
		lblBookPrice.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblBookPrice.setBounds(643, 474, 75, 28);
		f.getContentPane().add(lblBookPrice);

		JLabel lblQty = new JLabel(String.valueOf(listPay.get(0)), SwingConstants.CENTER);
		lblQty.setForeground(Color.WHITE);
		lblQty.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		lblQty.setBounds(760, 474, 75, 28);
		f.getContentPane().add(lblQty);

		final int PRICE = Integer.parseInt(String.valueOf(listBook.get(3)));
		final int QTY = Integer.parseInt(String.valueOf(listPay.get(0)));
		int total = PRICE * QTY;
		JLabel bkTotal = new JLabel(String.valueOf(total) + "원", SwingConstants.CENTER);
		bkTotal.setForeground(Color.WHITE);
		bkTotal.setFont(new Font("Lucida Grande", Font.PLAIN, 14));
		bkTotal.setBounds(858, 474, 101, 28);
		f.getContentPane().add(bkTotal);

		JLabel lbl9 = new JLabel("배송비", SwingConstants.CENTER);
		lbl9.setOpaque(true);
		lbl9.setForeground(Color.BLACK);
		lbl9.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl9.setBackground(Color.GRAY);
		lbl9.setBounds(39, 593, 187, 52);
		f.getContentPane().add(lbl9);

		JLabel lbl10 = new JLabel("3000원");
		lbl10.setForeground(Color.WHITE);
		lbl10.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl10.setBounds(255, 601, 255, 36);
		f.getContentPane().add(lbl10);
		JLabel lbl11 = new JLabel("최종 결제 금액", SwingConstants.CENTER);

		lbl11.setOpaque(true);
		lbl11.setForeground(Color.BLACK);
		lbl11.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl11.setBackground(Color.GRAY);
		lbl11.setBounds(39, 657, 187, 52);
		f.getContentPane().add(lbl11);

		int amount = total + 3000;
		JLabel lbl12 = new JLabel(String.valueOf(amount) + "원");
		lbl12.setForeground(Color.WHITE);
		lbl12.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lbl12.setBounds(255, 665, 255, 36);
		f.getContentPane().add(lbl12);

		JButton btn1 = new JButton("메인으로");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				f.dispose(); // pay2 창 닫기
			}
		});
		btn1.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		btn1.setBounds(847, 699, 117, 52);
		f.getContentPane().add(btn1);

		JLabel lbl13 = new JLabel("주문 번호", SwingConstants.CENTER);
		lbl13.setOpaque(true);
		lbl13.setFont(new Font("Lucida Grande", Font.BOLD, 20));
		lbl13.setBackground(Color.GRAY);
		lbl13.setBounds(40, 80, 197, 52);
		f.getContentPane().add(lbl13);

		// (가짜) 주문번호 형식 (오늘날짜 + payid)
		SimpleDateFormat sdformat2 = new SimpleDateFormat("yyyyMMdd");
		today = sdformat2.format(cal.getTime());
//		System.out.println(today);
		String orderNo = today + String.valueOf(listPay.get(1));

		JLabel lblPayid = new JLabel(orderNo);
		lblPayid.setForeground(Color.WHITE);
		lblPayid.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		lblPayid.setBounds(265, 88, 242, 36);
		f.getContentPane().add(lblPayid);

		f.setVisible(true);

	}
}
