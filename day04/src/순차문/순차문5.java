package 순차문;

import javax.swing.JOptionPane;

public class 순차문5 {

	public static void main(String[] args) {

		String x = JOptionPane.showInputDialog("내가 먹고싶은 음식은?");
		String y = JOptionPane.showInputDialog("친구가 먹고 싶은 음식은?");

		String x2 = "팥빙수";
		String y2 = "팥빙수";

		System.out.println(x.equals(x2));
		System.out.println(y.equals(y2));
		
		if (x.equals(x2) && y.equals(y2) ) {
			
			System.out.println("아하! 나랑 친구랑 같아요!");
			
		} else {
			
			System.out.println("크~! 나랑 친구랑 달라요!");

		}
		
		
	}

}
