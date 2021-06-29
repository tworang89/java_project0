package 문제풀이;

import java.util.Date;

import javax.swing.JOptionPane;

public class 정리문제2 {

	public static void main(String[] args) {
		// 나이를 입력 : 2
		// => 태어난 연도는 2020년(Date이용)
		// 자동 import => 컨트롤 + 쉬프트+ 영문 o , f2

		String age = JOptionPane.showInputDialog("나이를입력");

		int age1 = Integer.parseInt(age);

		Date date = new Date();

		int year = date.getYear() + 1901 - age1;

		System.out.println(year);

		// 태어난 시각 : 10
		// => 오전에 태어나셨군요(오전,오후,밤,새벽)
		
		String time = JOptionPane.showInputDialog("태어난시각");
		int time2 = Integer.parseInt(time);
		
		if ( time2 >= 0 && time2 <= 12 ) {
			
			System.out.println("오전에태어나셨군요");
			
		} else if ( time2 <= 6 ) { 
			
			System.out.println("오후에태어나셨군요");

		} else if (time2 >= 21 ) { 
			
			System.out.println("밤에태어나셨군요");

		} else {
			
			System.out.println("새벽에태어나셨군요");
			
		}
		
		
		
		
		
		

	}

}
