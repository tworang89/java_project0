package 그래픽;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class 영화예매그래픽버젼2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame("영화예매그래픽버젼");
		f.setSize(560, 730);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		int[] seat = new int[200];
		// JButton b = new JButton(0+"");//String.valueof(0)

		for (int i = 0; i < 200; i++) {
			JButton b = new JButton(i + "");
			
			b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					String s = e.getActionCommand();
					int index = Integer.parseInt(s);
					seat[index] = 1;
					JOptionPane.showMessageDialog(f, index+" 번 예약됨");
					b.setEnabled(false);
					b.setBackground(Color.red);
					
				}
			});
			f.add(b);
				}

		JButton b2 = new JButton("<<<<<<<<<<<<<<결제하기>>>>>>>>>>>>>>");
		
		b2.setBackground(Color.yellow);
		f.add(b2);
		//f.setVisible(true);
		b2.addActionListener(new ActionListener() {

			// @Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				int count = 0;
				String seatno = "";

				String s = e.getActionCommand();
				//int index = Integer.parseInt(s);
				//seat[index] = 1;
				//JOptionPane.showMessageDialog(f, index + "년 예약됨.");
				// 버튼을 비활성화

				for (int i = 0; i < seat.length; i++) {
					if (seat[i] == 1) {

						count++;
						seatno = seatno + " " + i;

					}

				}

				int pay = count * 10000;
				JOptionPane.showMessageDialog(f, "당신이 예매한 좌석번호는 " +seatno+ "번");
				JOptionPane.showMessageDialog(f, "최종 결제 금액은 " + pay + "원");
			}
		});

		f.setVisible(true);

	}

}
