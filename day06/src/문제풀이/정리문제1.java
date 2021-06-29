package 문제풀이;

import javax.swing.JOptionPane;

public class 정리문제1 {

	public static void main(String[] args) {
		// 사원번호 입력: 기103
		// 사원번호 중 첫글자가 '기'인경우 '기획부이군요'
		// '인'인경우 '인사부이군요'
		// '개'인경우 '개발부이군요'

		String num = JOptionPane.showInputDialog("사원번호 입력");

		char num1 = num.charAt(0);
		char num2 = num.charAt(1);

		if (num1 == '기') {

			System.out.println("기획부이군요");

		} else if (num1 == '인') {

			System.out.println("인사부이군요");

		} else {

			System.out.println("개발부이군요");
		}
		
		if ( num2 == '1' || num2 == '2' ) {
			
			System.out.println("임원");
			
		} else if ( num2 == '3'  ){
			
			System.out.println("부장");

		}else if ( num2 =='4' || num2 == '5' ){
			
			System.out.println("평사원");

		} else {
			System.out.println("해당직급없음");
			
		}


		}

	}

