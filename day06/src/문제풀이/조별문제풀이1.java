package 문제풀이;

import javax.swing.JOptionPane;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter.DEFAULT;

public class 조별문제풀이1 {

	public static void main(String[] args) {

//		1.  건물 번호 입력  ' 101 ' 
//
//		층수 입력 후 첫번째 글짜가 '1' 인 경우 ' 사무실 입니다.'
//		                     '2' 인 경우 ' 병원 입니다.'
//		                     '3' 인 경우 ' 카페 입니다.'
//		                     '4' 인 경우 ' 호텔 입니다.'
//		                     나머지는 존재하지 않는 층수 입니다.

		String b1 = JOptionPane.showInputDialog("건물번호");
		
		char num1 = b1.charAt(0);
		char num2 = b1.charAt(1);		
		
		
		int b2 = Integer.parseInt(b1);

		switch (b2) {
		case 1:

			System.out.println("사무실입니다.");

			break;
		case 2:

			System.out.println("병원입니다.");

			break;
		case 3:

			System.out.println("카페입니다.");

			break;
		case 4:

			System.out.println("호텔입니다.");

			break;
			
		default: 
			
			System.out.println("존재하지 않는 층수 입니다.");
			break;
			
		
		}
		
		
		

	}

}
