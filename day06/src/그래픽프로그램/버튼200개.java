package 그래픽프로그램;

import java.awt.FlowLayout;
import java.util.Iterator;

import javax.swing.JButton;
import javax.swing.JFrame;

public class 버튼200개 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame f = new JFrame(" 나는 버튼 200개 입니다.");
		f.setSize(800, 800);

		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		//반복할 구간을 마우스로 잡는다.
		//마우스 오른쪽 , surround with -> for
		for (int i = 0; i < 300; i++) {
			
			JButton b1 = new JButton( (i + 1) + "번" );
			f.add(b1);
		}
		f.setVisible(true);

	}

}
